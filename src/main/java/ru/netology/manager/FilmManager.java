package ru.netology.manager;

import ru.netology.domain.FilmInfo;

public class FilmManager {
    private FilmInfo[] films = new FilmInfo[0];
    int numberOfMovies = 10;


    public FilmManager(int n) {
        this.numberOfMovies = n;
    }

    public FilmManager() {
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
        if (films.length < numberOfMovies) {
            numberOfMovies = films.length;
        }
        FilmInfo[] result = new FilmInfo[numberOfMovies];
        for (int i = 0; i < numberOfMovies; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
