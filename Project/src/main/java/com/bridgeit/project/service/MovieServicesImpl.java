package com.bridgeit.project.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgeit.project.dto.MovieDTO;
import com.bridgeit.project.model.Actor;
import com.bridgeit.project.model.Movie;
import com.bridgeit.project.model.Producer;
import com.bridgeit.project.repository.ActorRepository;
import com.bridgeit.project.repository.MovieRepository;
import com.bridgeit.project.repository.ProducerRepository;
import com.bridgeit.project.response.Response;
import com.bridgelabz.project.exception.UserException;

@Service
public class MovieServicesImpl implements MovieService {

	// @Autowired
	// private ModelMapper modelMapper;
	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private ActorRepository actorRepository;
	@Autowired
	private ProducerRepository producerRepository;

	@Override
	public Response createMovie(MovieDTO moviedto) {
		ModelMapper modelMapper = new ModelMapper();
		Movie movie = modelMapper.map(moviedto, Movie.class);
		movieRepository.save(movie);
		Response response = ResponseHelper.statusResponse(100, "create movie");
		return response;

	}
	
	@Override
	public Response updateMovie(MovieDTO moviedto,long movieId)
	{
		Movie movie=movieRepository.findById(movieId).orElseThrow(() -> new UserException("No movie is available"));
		movie.setMovieName(moviedto.getMovieName());
		movie.setPlot(moviedto.getPlot());
		movie.setPoster(moviedto.getPoster());
		movie.setYear(moviedto.getYearOfRelease());
		Response response = ResponseHelper.statusResponse(100, "update movie");
		return response;

	}
	

	@Override
	public Response addActorProducerToMovie(long movieId, long producerId, List<String> actors) {
		// ModelMapper modelMapper = new ModelMapper();
		// Movie movie = modelMapper.map(moviedto, Movie.class);
		Optional<Movie> movie = movieRepository.findById(movieId);
		if (movie.isPresent()) {
			return new Response("movie not found ", 404);
		}
		for (String actor1 : actors) {
			Optional<Actor> actor = actorRepository.findById(actor1.getActorId());
			if (actor.isPresent()) {
				return new Response("actor not found ", 404);
			}

			movie.get().getActors().add(actor.get());
			movieRepository.save(movie.get());

			actor.get().getMovies().add(movie.get());
			actorRepository.save(actor.get());
		}

		Optional<Producer> producer = producerRepository.findById(producerId);

		if (producer.isPresent()) {
			// logger.info("in email");
			return new Response("producer not found ", 404);
		}
		movie.get().getProducers().add(producer.get());
		movieRepository.save(movie.get());
		producer.get().getMovies().add(movie.get());
		producerRepository.save(producer.get());
		Response response = ResponseHelper.statusResponse(100, "actor added to movie");
		return response;
	}

	@Override
	public List<Movie> getAllMovie(long movieId) {
		List<Movie> movielist = movieRepository.findAll();
		return movielist;
	}

}
