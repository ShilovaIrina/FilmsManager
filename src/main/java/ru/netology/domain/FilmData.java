package ru.netology.domain;

public class FilmData {
    private final String filmName;
    private final String filmGenre;

    public FilmData(String filmName, String filmGenre) {
        this.filmName = filmName;
        this.filmGenre = filmGenre;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }
}