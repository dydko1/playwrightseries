package creationalpatterns.training.javaedupl.prototype1;

import lombok.Getter;


@Getter

public class Movie extends Element {

    String movieTime;

    Movie() {
    }

    Movie(String title, String price, String url, String movieTime) {
        super(title, price, url);
        this.movieTime = movieTime;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }
}