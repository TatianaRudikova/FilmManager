package ru.netology.manager;

import ru.netology.domain.FilmInfo;

public class FilmManager {
    private FilmInfo[] films = new FilmInfo[0];
    private int numberOfMovies = 10;


    public FilmManager(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public FilmManager() {
    }

    public FilmInfo[] getFilms() {
        return films;
    }

    public void save(FilmInfo film) {
        int length = films.length + 1;
        FilmInfo[] tmp = new FilmInfo[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public FilmInfo[] getAll() {
        FilmInfo[] result = new FilmInfo[Math.min(films.length, numberOfMovies)];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public void findAll() {
        getFilms();
    }

    public void findLast() {
        if (numberOfMovies > films.length) {
            numberOfMovies = films.length;
        }
        FilmInfo[] tmp = new FilmInfo[numberOfMovies];
        for (int i =0, j = films.length - 1; i < films.length; i++, j--) {
            tmp[i] = films[j];
        }
        films = tmp;
    }

}
