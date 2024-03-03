package ru.netology.domain;

public class FilmsPosterManager {
    private FilmData[] films;
    private final int outputLimit;

    public FilmsPosterManager() {
        this.outputLimit = 5;
    }

    public FilmsPosterManager(int outputLimit) {
        this.outputLimit = outputLimit;
    }

    public int getOutputLimit() {
        return outputLimit;
    }

    public void addNewFilm(FilmData film) {
        FilmData[] tmpFilms;
        if (films == null) {
            tmpFilms = new FilmData[1];
            tmpFilms[0] = film;
        } else {
            tmpFilms = new FilmData[films.length + 1];
            for (int i = 0; i < films.length; i++) {
                tmpFilms[i] = films[i];
            }
            tmpFilms[films.length] = film;
        }

        films = tmpFilms;
    }

    public FilmData[] findAll() {
        return films;
    }

    public FilmData[] findLast() {
        int realOutputNumber = 0;
        if (films.length > outputLimit) {
            realOutputNumber = outputLimit;
        } else {
            realOutputNumber = films.length;
        }
        FilmData[] outputArray = new FilmData[realOutputNumber];
        for (int i = 0; i < realOutputNumber; i++) {
            outputArray[i] = films[films.length - i - 1];
        }
        return outputArray;
    }

}