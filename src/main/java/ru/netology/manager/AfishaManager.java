package ru.netology.manager;

import ru.netology.domain.Film;

public class AfishaManager {

    private int showFilms = 10;
    private Film[] films = new Film[]{};

    public AfishaManager() {
    }

    public AfishaManager(int showFilms) {

        this.showFilms = showFilms;
    }

    public void add(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return films; }

    public Film[] getLast10() {
        Film[] films = findAll();
        int resultLength;
        if (films.length < showFilms) {
            resultLength = films.length;
        } else {
            resultLength = showFilms;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - 1 - i;
            result[i] = films[index];
        }
        return result;
    }

}












