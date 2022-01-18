package Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import User.User;

public class WatchedMovie {
	public List<Movie> watchedMovies = new ArrayList<Movie>();
	String nameMostWathcedgenre;
	int indexMostWathcedGenre;
	int countMostWatchedGenre;
	int[] watchedMovieList = new int[8];
	int countHorrorMovie;
	int countComedyMovie;
	int countRomanceMovie;
	int countActionMovie;
	int countSIFIMovie;
	int countClassicMovie;
	int countDramaMovie;
	int countAnimationMovie;
	int countDefaulersTryWatch;

	public void watchedMovie(User user, Movie movie) {
		if (user.getPaymentSituation() == true) {
			watchedMovies.add(movie);
			if (movie.getGenre() == MovieGenre.HORROR) {
				this.countHorrorMovie++;
				this.nameMostWathcedgenre = "Horror";
				this.watchedMovieList[0] = countHorrorMovie;
			}
			if (movie.getGenre() == MovieGenre.COMEDIA) {
				this.countComedyMovie++;
				this.watchedMovieList[1] = countComedyMovie;
				this.nameMostWathcedgenre = "Comedia";
			}
			if (movie.getGenre() == MovieGenre.ROMANCE) {
				this.countRomanceMovie++;
				this.watchedMovieList[2] = countRomanceMovie;
				this.nameMostWathcedgenre = "Romance";
			}
			if (movie.getGenre() == MovieGenre.ACAO) {
				this.countActionMovie++;
				this.watchedMovieList[3] = countActionMovie;
				this.nameMostWathcedgenre = "Ação";
			}
			if (movie.getGenre() == MovieGenre.SIFI) {
				this.countSIFIMovie++;
				this.nameMostWathcedgenre = "SI-FI";
				this.watchedMovieList[4] = countSIFIMovie;
			}
			if (movie.getGenre() == MovieGenre.CLASSICO) {
				this.countClassicMovie++;
				this.nameMostWathcedgenre = "Clássico";
				this.watchedMovieList[5] = countClassicMovie;
			}
			if (movie.getGenre() == MovieGenre.DRAMA) {
				this.countDramaMovie++;
				this.watchedMovieList[6] = countDramaMovie;
				this.nameMostWathcedgenre = "Drama";
			} else
				this.countAnimationMovie++;
			this.watchedMovieList[7] = countAnimationMovie;
			this.nameMostWathcedgenre = "Animação";
		} else {
			countDefaulersTryWatch++;
		}
	}

	public void countMostWatchedGenre() {
		int maxValue = Integer.MIN_VALUE;
		int indexMaxValue = -1;
		for (int i = 0; i < watchedMovieList.length; i++) {
			if (watchedMovieList[i] > maxValue) {
				maxValue = watchedMovieList[i];
				indexMaxValue = i;
			}
		}
		countMostWatchedGenre = maxValue;
		indexMostWathcedGenre = indexMaxValue;
	}

	public String genreMostWatchedGenre() {
		if (indexMostWathcedGenre == 0) {
			return "Horror";
		}
		if (indexMostWathcedGenre == 1) {
			return "Comedia";
		}
		if (indexMostWathcedGenre == 2) {
			return "Romance";
		}
		if (indexMostWathcedGenre == 3) {
			return "Ação";
		}
		if (indexMostWathcedGenre == 4) {
			return "SIFI";
		}
		if (indexMostWathcedGenre == 5) {
			return "Classico";
		}
		if (indexMostWathcedGenre == 6) {
			return "Drama";
		} else
			return "Animação";
	}

	public int getCountMostWatchedGenre() {
		return countMostWatchedGenre;
	}

	public String getNameMostWathcedgenre() {
		return nameMostWathcedgenre;
	}

	public int getCountDefaulersTryWatch() {
		return countDefaulersTryWatch;
	}

	public void setCountDefaulersTryWatch(int countDefaulersTryWatch) {
		this.countDefaulersTryWatch = countDefaulersTryWatch;
	}
}
