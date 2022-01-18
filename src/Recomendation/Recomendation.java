package Recomendation;

import java.util.ArrayList;
import java.util.List;

import Movie.Movie;
import User.User;

public class Recomendation {
	
	String textRecomendation;
	User user;
	Movie movie;
	
	public void userRecomendation (User user, Movie movie, User user2, String textRecomendation) {
	}

	public Recomendation() {
	}

	public String getTextRecomendation() {
		return textRecomendation;
	}

	public void setTextRecomendation(String textRecomendation) {
		this.textRecomendation = textRecomendation;
	}

	public Recomendation(String textRecomendation) {
		this.textRecomendation = textRecomendation;
	}
}
