package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class FilmManagerTest {

    @Test //вывод всех фильмов в порядке добавления
    public void shouldAllMoviesInTheOrderOfAddition() {
        FilmManager filmManager = new FilmManager();
        FilmInfo bloodshot = new FilmInfo(101, 0, "Бладшот", "боевик");
        FilmInfo forward = new FilmInfo(102, 1, "Вперёд", "мультфильм");
        FilmInfo hotelBelgrade = new FilmInfo(103, 2, "Отель 'Белград'", "комедия");
        FilmInfo antMan = new FilmInfo(104, 3, "Человек-муравей и Оса", "фантастика");
        FilmInfo rabies = new FilmInfo(105, 4, "Бешенство", "триллер");
        FilmInfo rageOfTheGods = new FilmInfo(106, 5, "Шазам! Ярость богов", "триллер");
        FilmInfo interstellar = new FilmInfo(107, 6, "Интерстеллар", "фантастика");
        FilmInfo theMainCharacter = new FilmInfo(108, 7, "Главный герой", "боевик");
        FilmInfo venom = new FilmInfo(109, 8, "Веном", "фантастика");
        FilmInfo radius = new FilmInfo(110, 9, "Радиус", "ужасы");
        FilmInfo escapeFromShawshank = new FilmInfo(110, 9, "Побег из Шоушенка", "ужасы");
        filmManager.save(bloodshot);
        filmManager.save(forward);
        filmManager.save(hotelBelgrade);
        filmManager.save(antMan);
        filmManager.save(rabies);
        filmManager.save(rageOfTheGods);
        filmManager.save(interstellar);
        filmManager.save(theMainCharacter);
        filmManager.save(venom);
        filmManager.save(radius);
        filmManager.save(escapeFromShawshank);

        FilmInfo[] actual = filmManager.findAll();
        FilmInfo[] expected = new FilmInfo[]{bloodshot, forward, hotelBelgrade, antMan, rabies, rageOfTheGods, interstellar, theMainCharacter, venom, radius, escapeFromShawshank};

        assertArrayEquals(expected, actual);
    }

    @Test //вывод фильмов в обратном порядке; сохраняем фильмов больше лимита, выводим в лимите по умолчанию
    public void shouldReverseOrderDefaultLimit() {
        FilmManager filmManager = new FilmManager();
        FilmInfo bloodshot = new FilmInfo(101, 0, "Бладшот", "боевик");
        FilmInfo forward = new FilmInfo(102, 1, "Вперёд", "мультфильм");
        FilmInfo hotelBelgrade = new FilmInfo(103, 2, "Отель 'Белград'", "комедия");
        FilmInfo antMan = new FilmInfo(104, 3, "Человек-муравей и Оса", "фантастика");
        FilmInfo rabies = new FilmInfo(105, 4, "Бешенство", "триллер");
        FilmInfo rageOfTheGods = new FilmInfo(106, 5, "Шазам! Ярость богов", "триллер");
        FilmInfo interstellar = new FilmInfo(107, 6, "Интерстеллар", "фантастика");
        FilmInfo theMainCharacter = new FilmInfo(108, 7, "Главный герой", "боевик");
        FilmInfo venom = new FilmInfo(109, 8, "Веном", "фантастика");
        FilmInfo radius = new FilmInfo(110, 9, "Радиус", "ужасы");
        FilmInfo escapeFromShawshank = new FilmInfo(110, 9, "Побег из Шоушенка", "ужасы");
        filmManager.save(bloodshot);
        filmManager.save(forward);
        filmManager.save(hotelBelgrade);
        filmManager.save(antMan);
        filmManager.save(rabies);
        filmManager.save(rageOfTheGods);
        filmManager.save(interstellar);
        filmManager.save(theMainCharacter);
        filmManager.save(venom);
        filmManager.save(radius);
        filmManager.save(escapeFromShawshank);

        FilmInfo[] actual = filmManager.findLast();
        FilmInfo[] expected = new FilmInfo[]{escapeFromShawshank, radius, venom, theMainCharacter, interstellar, rageOfTheGods, rabies, antMan, hotelBelgrade, forward};

        assertArrayEquals(expected, actual);
    }

    @Test //вывод фильмов в обратном порядке; выводим фильмов меньше лимита по умолчанию
    public void shouldReverseOrderIsLessLimit() {
        FilmManager filmManager = new FilmManager();
        FilmInfo bloodshot = new FilmInfo(101, 0, "Бладшот", "боевик");
        FilmInfo forward = new FilmInfo(102, 1, "Вперёд", "мультфильм");
        FilmInfo hotelBelgrade = new FilmInfo(103, 2, "Отель 'Белград'", "комедия");
        FilmInfo antMan = new FilmInfo(104, 3, "Человек-муравей и Оса", "фантастика");
        FilmInfo rabies = new FilmInfo(105, 4, "Бешенство", "триллер");
        filmManager.save(bloodshot);
        filmManager.save(forward);
        filmManager.save(hotelBelgrade);
        filmManager.save(antMan);
        filmManager.save(rabies);
        FilmInfo[] actual = filmManager.findLast();
        FilmInfo[] expected = new FilmInfo[]{rabies, antMan, hotelBelgrade, forward, bloodshot};

        assertArrayEquals(expected, actual);
    }

    @Test
    //вывод фильмов в обратном порядке; сохраняем фильмов больше лимита, выводим фильмы в установленном лимите, отличном от умолчательного
    public void shouldReverseOrderSettingTheLimit() {
        FilmManager filmManager = new FilmManager(5);
        FilmInfo bloodshot = new FilmInfo(101, 0, "Бладшот", "боевик");
        FilmInfo forward = new FilmInfo(102, 1, "Вперёд", "мультфильм");
        FilmInfo hotelBelgrade = new FilmInfo(103, 2, "Отель 'Белград'", "комедия");
        FilmInfo antMan = new FilmInfo(104, 3, "Человек-муравей и Оса", "фантастика");
        FilmInfo rabies = new FilmInfo(105, 4, "Бешенство", "триллер");
        FilmInfo rageOfTheGods = new FilmInfo(106, 5, "Шазам! Ярость богов", "триллер");
        FilmInfo interstellar = new FilmInfo(107, 6, "Интерстеллар", "фантастика");
        FilmInfo theMainCharacter = new FilmInfo(108, 7, "Главный герой", "боевик");
        FilmInfo venom = new FilmInfo(109, 8, "Веном", "фантастика");
        FilmInfo radius = new FilmInfo(110, 9, "Радиус", "ужасы");
        FilmInfo escapeFromShawshank = new FilmInfo(110, 9, "Побег из Шоушенка", "ужасы");
        filmManager.save(bloodshot);
        filmManager.save(forward);
        filmManager.save(hotelBelgrade);
        filmManager.save(antMan);
        filmManager.save(rabies);
        filmManager.save(rageOfTheGods);
        filmManager.save(interstellar);
        filmManager.save(theMainCharacter);
        filmManager.save(venom);
        filmManager.save(radius);
        filmManager.save(escapeFromShawshank);

        FilmInfo[] actual = filmManager.findLast();
        FilmInfo[] expected = new FilmInfo[]{escapeFromShawshank, radius, venom, theMainCharacter, interstellar};

        assertArrayEquals(expected, actual);
    }
}

