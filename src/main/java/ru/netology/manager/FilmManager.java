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

    //вывод всех фильмов в порядке добавления
    public FilmInfo[] findAll() {
        return getFilms();
    }

    //вывод n фильмов в обратном порядке
    public FilmInfo[] findLast() {
        int resultLength = films.length;
        if (resultLength > numberOfMovies) {
            resultLength = numberOfMovies;
        } else {
            resultLength = films.length;
        }
        FilmInfo[] result = new FilmInfo[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}

