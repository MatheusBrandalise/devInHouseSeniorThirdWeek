package Movie;

import java.util.ArrayList;
import java.util.List;

import User.User;

public class Movie {

	String name;
	String synopsis;
	MovieGenre genre;
	int idGenre;
	String link;
	int like;
	int dislike;
	boolean avaliation = false;
	User user;
	static List<MovieGenre> moviesGenres = new ArrayList<>();
	
	static {
		for (MovieGenre genre : MovieGenre.values()) {
			moviesGenres.add(genre);
		}
	}
	
	public Movie(String name, String synopsis, MovieGenre genre, String link) {
		this.name = name;
		this.synopsis = synopsis;
		this.genre = genre;
		this.link = link;
	}
	
	public Movie(String name, String synopsis, int idGenre, String link) {
		this.name = name;
		this.synopsis = synopsis;
		this.idGenre = idGenre;
		this.link = link;
	}
	
	public int getIdGenre() {
		return getIdGenre();
	}

	public void setIdGenre(int idGenre) {
		for (MovieGenre genre : MovieGenre.values()) {
			if (genre.getId() == idGenre) {
				this.setGenre(genre);
			}
		}
	}
	
	public void watchedMovie (User user, Movie movie) {
		
	}
	
	public int likeDislike(User user, boolean avaliation) {
		if (this.avaliation == true){
			this.like ++;
			return this.like;
		}else {
			dislike ++;
			return this.dislike;
		}
	}

	public Movie() {
	}

	public String getName() {
		return name;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getDislike() {
		return dislike;
	}

	public void setDislike(int dislike) {
		this.dislike = dislike;
	}

	public boolean isAvaliation() {
		return avaliation;
	}

	public void setAvaliation(User user, boolean avaliation) {
		this.avaliation = avaliation;
		likeDislike(this.user, this.avaliation);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public MovieGenre getGenre() {
		return genre;
	}

	public void setGenre(MovieGenre genre) {
		this.genre = genre;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
