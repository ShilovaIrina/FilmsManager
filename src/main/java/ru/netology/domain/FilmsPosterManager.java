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
        FilmData[] tmp_films;
        if (films == null) {
            tmp_films = new FilmData[1];
            tmp_films[0] = film;
        } else {
            tmp_films = new FilmData[films.length + 1];
            for (int i = 0; i < films.length; i++) {
                tmp_films[i] = films[i];
            }
            tmp_films[films.length] = film;
        }

        films = tmp_films;
    }

    public FilmData[] findAll() {
        System.out.println("displaying " + films.length + " films:");
        for (int i = 0; i < films.length; i++) {
            System.out.println("film name: " + films[i].getFilmName() + "\nfilm genre: " + films[i].getFilmGenre() + "\n");
        }
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
        System.out.println("displaying " + realOutputNumber + " films:");
        for (int i = 0; i < realOutputNumber; i++) {
            System.out.println("film name: " + outputArray[i].getFilmName() + "\nfilm genre: " + outputArray[i].getFilmGenre() + "\n");
        }
        return outputArray;
    }

}