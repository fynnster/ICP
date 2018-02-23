package labs;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frema
 */
public class MovieClass {
    String movieName;
    String movieDirector;
    int yearOfRelease;
    int movieDuration;

    public MovieClass(){
    }
    
    public MovieClass(String movieName, String movieDirector, int yearOfRelease, int movieDuration) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.yearOfRelease = yearOfRelease;
        this.movieDuration = movieDuration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }
    
    
    public static void main(String[] args){
        MovieClass newMovie;
        newMovie = new MovieClass("Movie", "Fynnba", 2016, 10);
        System.out.println("movieName = " + newMovie.getMovieName() + " movieDirector = " + newMovie.getMovieDirector() 
                + " movieDuration = " + newMovie.getMovieDuration() + " byearOfRelease = " + newMovie.getYearOfRelease() );

    } 
}
