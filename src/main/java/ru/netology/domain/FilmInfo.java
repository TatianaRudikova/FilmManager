package ru.netology.domain;

public class FilmInfo {
    private int id;
    private int filmId;
    private String filmName;
    private String filmGenre;


    public FilmInfo() {
    }

    public FilmInfo(int id, int filmId, String filmName, String filmGenre) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }
}
