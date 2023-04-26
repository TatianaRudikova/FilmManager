package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class FilmManagerTest {

    @Test
    public void shouldSaveFilmLessThanShow() {
        FilmManager filmManager = new FilmManager();
        FilmInfo bloodshot = new FilmInfo(101, 0, "Бладшот", "боевик");
        FilmInfo forward = new FilmInfo(102, 1, "Вперёд", "мультфильм");
        FilmInfo hotelBelgrade = new FilmInfo(103, 2, "Отель 'Белград'", "комедия");
        filmManager.save(bloodshot);
        filmManager.save(forward);
        filmManager.save(hotelBelgrade);

        FilmInfo[] actual = filmManager.getAll();
        FilmInfo[] expected = new FilmInfo[]{hotelBelgrade, forward, bloodshot};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveFilmMoreThanShow() {
        FilmManager filmManager = new FilmManager(2);
        FilmInfo bloodshot = new FilmInfo(101, 0, "Бладшот", "боевик");
        FilmInfo forward = new FilmInfo(102, 1, "Вперёд", "мультфильм");
        FilmInfo hotelBelgrade = new FilmInfo(103, 2, "Отель 'Белград'", "комедия");
        filmManager.save(bloodshot);
        filmManager.save(forward);
        filmManager.save(hotelBelgrade);

        FilmInfo[] actual = filmManager.getAll();
        FilmInfo[] expected = new FilmInfo[]{hotelBelgrade, forward};

        assertArrayEquals(expected, actual);
    }
}

