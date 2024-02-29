package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsPosterManagerTest {

    @Test
    public void checkPosterManagerConstructorDefault() {
        FilmsPosterManager manager = new FilmsPosterManager();

        int actual = manager.getOutputLimit();

        Assertions.assertEquals(5, actual);
    }

    @Test
    public void checkPosterManagerConstructorCustom() {
        FilmsPosterManager manager = new FilmsPosterManager(3);

        int actual = manager.getOutputLimit();

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void shouldPosterManagerFilmAddingAndFindAll() {
        FilmsPosterManager manager = new FilmsPosterManager();

        manager.addNewFilm(new FilmData("Бладшот", "боевик"));
        manager.addNewFilm(new FilmData("Вперёд", "мультфильм"));
        manager.addNewFilm(new FilmData("Отель «Белград»", "комедия"));
        manager.addNewFilm(new FilmData("Джентельмены", "боевик"));
        manager.addNewFilm(new FilmData("Человек-невидимка", "ужасы"));
        manager.addNewFilm(new FilmData("Тролли. Мировой тур", "мультфильм"));
        manager.addNewFilm(new FilmData("Номер один", "комедия"));

        FilmData[] films = manager.findAll();

        Assertions.assertEquals(films.length, 7);
    }

    @Test
    public void checkPosterManagerFilmAddingAndFindLast() {
        FilmsPosterManager manager = new FilmsPosterManager();

        manager.addNewFilm(new FilmData("Бладшот", "боевик"));
        manager.addNewFilm(new FilmData("Вперёд", "мультфильм"));
        manager.addNewFilm(new FilmData("Отель «Белград»", "комедия"));
        manager.addNewFilm(new FilmData("Джентельмены", "боевик"));
        manager.addNewFilm(new FilmData("Человек-невидимка", "ужасы"));
        manager.addNewFilm(new FilmData("Тролли. Мировой тур", "мультфильм"));
        manager.addNewFilm(new FilmData("Номер один", "комедия"));

        FilmData[] films = manager.findLast();

        Assertions.assertEquals(films.length, 5);
    }

    @Test
    public void checkPosterManagerFilmAddingAndFindLast2() {
        FilmsPosterManager manager = new FilmsPosterManager();

        manager.addNewFilm(new FilmData("Тролли. Мировой тур", "мультфильм"));
        manager.addNewFilm(new FilmData("Номер один", "комедия"));

        FilmData[] films = manager.findLast();

        Assertions.assertEquals(films.length, 2);
    }
}
