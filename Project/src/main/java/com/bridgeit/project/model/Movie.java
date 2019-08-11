package com.bridgeit.project.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
public class Movie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long movieId;
	private String movieName;
	private long year;
	private String plot;
	private String poster;
	private long producerId;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Actor> actors;

	@OneToOne(cascade = CascadeType.ALL)
	private List<Producer> producers;

	
	public List<Producer> getProducers() {
		return producers;
	}


	public void setProducers(List<Producer> producers) {
		this.producers = producers;
	}


	public long getMovieId() {
		return movieId;
	}


	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public long getYear() {
		return year;
	}


	public void setYear(long year) {
		this.year = year;
	}


	public long getProducerId() {
		return producerId;
	}


	public void setProducerId(long producerId) {
		this.producerId = producerId;
	}


	public List<Actor> getActors() {
		return actors;
	}


	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	
	
	public String getPlot() {
		return plot;
	}


	public void setPlot(String plot) {
		this.plot = plot;
	}


	public String getPoster() {
		return poster;
	}


	public void setPoster(String poster) {
		this.poster = poster;
	}


	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", year=" + year + ", plot=" + plot
				+ ", poster=" + poster + ", producerId=" + producerId + ", actors=" + actors + ", producers="
				+ producers + "]";
	}


	
	
}
