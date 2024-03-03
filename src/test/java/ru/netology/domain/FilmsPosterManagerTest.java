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

        FilmData poster1 = new FilmData("Бладшот", "боевик");
        FilmData poster2 = new FilmData("Вперёд", "мультфильм");
        FilmData poster3 = new FilmData("Отель «Белград»", "комедия");
        FilmData poster4 = new FilmData("Джентельмены", "боевик");
        FilmData poster5 = new FilmData("Человек-невидимка", "ужасы");
        FilmData poster6 = new FilmData("Тролли. Мировой тур", "мультфильм");
        FilmData poster7 = new FilmData("Номер один", "комедия");

        manager.addNewFilm(poster1);
        manager.addNewFilm(poster2);
        manager.addNewFilm(poster3);
        manager.addNewFilm(poster4);
        manager.addNewFilm(poster5);
        manager.addNewFilm(poster6);
        manager.addNewFilm(poster7);

        FilmData[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7};
        FilmData[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkPosterManagerFilmAddingAndFindLast() {
        FilmsPosterManager manager = new FilmsPosterManager();

        FilmData poster1 = new FilmData("Бладшот", "боевик");
        FilmData poster2 = new FilmData("Вперёд", "мультфильм");
        FilmData poster3 = new FilmData("Отель «Белград»", "комедия");
        FilmData poster4 = new FilmData("Джентельмены", "боевик");
        FilmData poster5 = new FilmData("Человек-невидимка", "ужасы");
        FilmData poster6 = new FilmData("Тролли. Мировой тур", "мультфильм");
        FilmData poster7 = new FilmData("Номер один", "комедия");

        manager.addNewFilm(poster1);
        manager.addNewFilm(poster2);
        manager.addNewFilm(poster3);
        manager.addNewFilm(poster4);
        manager.addNewFilm(poster5);
        manager.addNewFilm(poster6);
        manager.addNewFilm(poster7);

        FilmData[] expected = {poster7, poster6, poster5, poster4, poster3};
        FilmData[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkPosterManagerFilmAddingAndFindLast2() {
        FilmsPosterManager manager = new FilmsPosterManager();

        FilmData poster6 = new FilmData("Тролли. Мировой тур", "мультфильм");
        FilmData poster7 = new FilmData("Номер один", "комедия");

        manager.addNewFilm(poster6);
        manager.addNewFilm(poster7);

        FilmData[] expected = {poster7, poster6};
        FilmData[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
