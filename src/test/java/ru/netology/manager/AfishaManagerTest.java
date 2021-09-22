package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    void shouldAddFilm() {

        AfishaManager afisha = new AfishaManager();
        Film filmToAdd = new Film(8, "f8", "fantastic");
        afisha.add(filmToAdd);
        Film[] expected;
        expected = new Film[]{
                new Film(1, "f1", "thriller"),
                new Film(2, "f2", "cartoon"),
                new Film(3, "f3", "comedy"),
                new Film(4, "f4", "thriller"),
                new Film(5, "f5", "horror"),
                new Film(6, "f6", "cartoon"),
                new Film(7, "f7", "comedy"),
                new Film(8, "f8", "fantastic")
        };
        Film[] actual = afisha.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowFilmsEmpty() {
        AfishaManager afisha = new AfishaManager();
        afisha.getLast10();
        Film[] expected = new Film[]{
                new Film(7, "Number One", "comedy"),
                new Film(6, "Trolls", "cartoon"),
                new Film(5, "The Invisible Man", "horror"),
                new Film(4, "The Gentlemen", "thriller"),
                new Film(3, "Hotel Belgrad", "comedy"),
                new Film(2, "Onward", "cartoon"),
                new Film(1, "Bloodshot", "thriller"),
        };
        Film[] actual = afisha.getLast10();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowFilms() {
        AfishaManager afisha = new AfishaManager(5);
        afisha.getLast10();
        Film[] expected = new Film[]{
                new Film(5, "The Invisible Man", "horror"),
                new Film(4, "The Gentlemen", "thriller"),
                new Film(3, "Hotel Belgrad", "comedy"),
                new Film(2, "Onward", "cartoon"),
                new Film(1, "Bloodshot", "thriller"),
        };
        Film[] actual = afisha.getLast10();
        assertArrayEquals(expected, actual);
    }
}