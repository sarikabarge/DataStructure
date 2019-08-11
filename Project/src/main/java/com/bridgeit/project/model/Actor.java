package com.bridgeit.project.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Actor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long actorId;
	private String name;
	private String gender;
	private LocalDateTime DOB;
	private String bio;
	private long movieId;
	
	
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public long getActorId() {
		return actorId;
	}
	public void setActorId(long actorId) {
		this.actorId = actorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDateTime getDOB() {
		return DOB;
	}
	public void setDOB(LocalDateTime dOB) {
		DOB = dOB;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", name=" + name + ", gender=" + gender + ", DOB=" + DOB + ", bio=" + bio
				+ ", Movies=" + Movies + "]";
	}



	@ManyToMany(cascade = CascadeType.ALL,mappedBy ="actors")
	private List<Movie> Movies;
	public List<Movie> getMovies() {
		return Movies;
	}
	public void setMovies(List<Movie> movies) {
		Movies = movies;
	}

	
	
}
