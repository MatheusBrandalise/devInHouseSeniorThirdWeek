package Suggestion;

import java.time.LocalDate;

import User.*;

public class Suggestion {
	String movieSuggestion;
	User user;
	LocalDate suggestionDate;
	
	public Suggestion(String movieSuggestion, User user) {
		this.movieSuggestion = movieSuggestion;
		this.user = user;
		this.suggestionDate = LocalDate.now();
	}

	public LocalDate getSuggestionDate() {
		return suggestionDate;
	}

	public void setSuggestionDate(LocalDate suggestionDate) {
		this.suggestionDate = suggestionDate;
	}

	public void setMovieSuggestion(String movieSuggestion) {
		this.movieSuggestion = movieSuggestion;
	}

	public String getMovieSuggestion() {
		return movieSuggestion;
	}

	public void setMovieSugestion(String movieSuggestion) {
		this.movieSuggestion = movieSuggestion;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
    @Override
    public String toString() {
    	return this.movieSuggestion;
    }

}