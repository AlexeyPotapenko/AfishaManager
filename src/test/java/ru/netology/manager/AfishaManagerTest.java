package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    void shouldAddFilm() {

        AfishaManager afisha = new AfishaManager();

        Film first = new Film(1, "f1", "thriller");
        Film second = new Film(2, "f2", "cartoon");
        Film third = new Film(3, "f3", "comedy");
        Film fourth = new Film(4, "f4", "thriller");
        Film fifth = new Film(5, "f5", "horror");
        Film sixth = new Film(6, "f6", "cartoon");
        Film seventh = new Film(7, "f7", "comedy");
        Film eighth = new Film(8, "f8", "fantastic");


        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);


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
    void shouldShowLastAddedFilmsNoEmpty() {
        AfishaManager afisha = new AfishaManager(4);

        Film first = new Film(1, "f1", "thriller");
        Film second = new Film(2, "f2", "cartoon");
        Film third = new Film(3, "f3", "comedy");
        Film fourth = new Film(4, "f4", "thriller");
        Film fifth = new Film(5, "f5", "horror");
        Film sixth = new Film(6, "f6", "cartoon");
        Film seventh = new Film(7, "f7", "comedy");
        Film eighth = new Film(8, "f8", "fantastic");


        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);

        afisha.getLast10();

        Film[] expected = new Film[]{

                new Film(8, "f8", "fantastic"),
                new Film(7, "f7", "comedy"),
                new Film(6, "f6", "cartoon"),
                new Film(5, "f5", "horror")
        };


        Film[] actual = afisha.getLast10();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLastAddedFilmsEmpty() {
        AfishaManager afisha = new AfishaManager();

        Film first = new Film(5, "f5", "horror");
        Film second = new Film(6, "f6", "cartoon");
        Film third = new Film(2, "f2", "cartoon");

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);

        afisha.getLast10();
        Film[] expected = new Film[]{
                new Film(2, "f2", "cartoon"),
                new Film(6, "f6", "cartoon"),
                new Film(5, "f5", "horror")
        };
        Film[] actual = afisha.getLast10();
        assertArrayEquals(expected, actual);
    }


}