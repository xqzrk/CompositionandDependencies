package ru.netology.affiche;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfficheTest {

    ru.netology.affiche.Poster film1 = new ru.netology.affiche.Poster(1, "Аватар", "Фантастика", "urlAvatar", 2009);
    ru.netology.affiche.Poster film2 = new ru.netology.affiche.Poster(2, "Аватар2", "Фантастика", "urlAvatar2", 2011);
    ru.netology.affiche.Poster film3 = new ru.netology.affiche.Poster(3, "Аватар3", "Фантастика", "urlAvatar3", 2017);
    ru.netology.affiche.Poster film4 = new ru.netology.affiche.Poster(4, "Аватар", "Фантастика", "urlAvatar", 2009);
    ru.netology.affiche.Poster film5 = new ru.netology.affiche.Poster(5, "Аватар2", "Фантастика", "urlAvatar2", 2011);
    ru.netology.affiche.Poster film6 = new ru.netology.affiche.Poster(6, "Аватар3", "Фантастика", "urlAvatar3", 2017);
    ru.netology.affiche.Poster film7 = new ru.netology.affiche.Poster(7, "Аватар", "Фантастика", "urlAvatar", 2009);
    ru.netology.affiche.Poster film8 = new ru.netology.affiche.Poster(8, "Аватар2", "Фантастика", "urlAvatar2", 2011);
    ru.netology.affiche.Poster film9 = new ru.netology.affiche.Poster(9, "Аватар3", "Фантастика", "urlAvatar3", 2017);
    ru.netology.affiche.Poster film10 = new ru.netology.affiche.Poster(10, "Аватар3", "Фантастика", "urlAvatar3", 2017);
    ru.netology.affiche.Poster film11 = new ru.netology.affiche.Poster(11, "Аватар", "Фантастика", "urlAvatar", 2009);
    ru.netology.affiche.Poster film12 = new ru.netology.affiche.Poster(12, "Аватар2", "Фантастика", "urlAvatar2", 2011);


    @Test
    public void shouldAddPoster() {
        ru.netology.affiche.Affiche affiche = new ru.netology.affiche.Affiche();

        affiche.addNewPoster(film1);
        affiche.addNewPoster(film2);
        affiche.addNewPoster(film3);
        affiche.addNewPoster(film4);
        affiche.addNewPoster(film5);
        affiche.addNewPoster(film6);
        affiche.addNewPoster(film7);
        affiche.addNewPoster(film8);
        affiche.addNewPoster(film9);
        affiche.addNewPoster(film10);
        affiche.addNewPoster(film11);
        affiche.addNewPoster(film12);

        ru.netology.affiche.Poster[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12};
        ru.netology.affiche.Poster[] actual = affiche.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseLastAdded() {
        ru.netology.affiche.Affiche affiche = new ru.netology.affiche.Affiche();

        affiche.addNewPoster(film1);
        affiche.addNewPoster(film2);
        affiche.addNewPoster(film3);
        affiche.addNewPoster(film4);
        affiche.addNewPoster(film5);
        affiche.addNewPoster(film6);
        affiche.addNewPoster(film7);
        affiche.addNewPoster(film8);
        affiche.addNewPoster(film9);
        affiche.addNewPoster(film10);
        affiche.addNewPoster(film11);
        affiche.addNewPoster(film12);


        ru.netology.affiche.Poster[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};
        ru.netology.affiche.Poster[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldReverseLastAddedIfResultLengthEntered() {
        ru.netology.affiche.Affiche affiche = new ru.netology.affiche.Affiche(5);

        affiche.addNewPoster(film1);
        affiche.addNewPoster(film2);
        affiche.addNewPoster(film3);
        affiche.addNewPoster(film4);
        affiche.addNewPoster(film5);
        affiche.addNewPoster(film6);
        affiche.addNewPoster(film7);
        affiche.addNewPoster(film8);
        affiche.addNewPoster(film9);
        affiche.addNewPoster(film10);
        affiche.addNewPoster(film11);
        affiche.addNewPoster(film12);


        ru.netology.affiche.Poster[] expected = {film12, film11, film10, film9, film8};
        ru.netology.affiche.Poster[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseResultLengthExceedsAffiche() {
        ru.netology.affiche.Affiche affiche = new ru.netology.affiche.Affiche(15);

        affiche.addNewPoster(film1);
        affiche.addNewPoster(film2);
        affiche.addNewPoster(film3);
        affiche.addNewPoster(film4);
        affiche.addNewPoster(film5);
        affiche.addNewPoster(film6);
        affiche.addNewPoster(film7);
        affiche.addNewPoster(film8);
        affiche.addNewPoster(film9);
        affiche.addNewPoster(film10);
        affiche.addNewPoster(film11);
        affiche.addNewPoster(film12);

        ru.netology.affiche.Poster[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        ru.netology.affiche.Poster[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
