package ru.netology.domain;

public class Film {
    private int id;
    private String title;
    private String genre;

    public Film(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public boolean equals(final Object o) {
        final Film other = (Film) o;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        final Object this$genre = this.getGenre();
        final Object other$genre = other.getGenre();
        return true;
    }

}
