package Movies;

public class Movie {

	String name;
	String synopsis;
	String movieGenre;
	String link;
	
	Movie(String name, String synopsis, String movieGenre, String link) {
		this.name = name;
		this.synopsis = synopsis;
		this.movieGenre = movieGenre;
		this.link = link;
	}

	Movie() {
		
	}

	public String getName() {
		return name;
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

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
