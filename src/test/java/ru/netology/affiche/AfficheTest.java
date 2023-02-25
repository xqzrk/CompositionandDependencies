package ru.netology.affiche;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfficheTest {

    Poster film1 = new Poster(1, "Аватар", "Фантастика", "urlAvatar", 2009);
    Poster film2 = new Poster(2, "Аватар2", "Фантастика", "urlAvatar2", 2011);
    Poster film3 = new Poster(3, "Аватар3", "Фантастика", "urlAvatar3", 2017);
    Poster film4 = new Poster(4, "Аватар", "Фантастика", "urlAvatar", 2009);
    Poster film5 = new Poster(5, "Аватар2", "Фантастика", "urlAvatar2", 2011);
    Poster film6 = new Poster(6, "Аватар3", "Фантастика", "urlAvatar3", 2017);
    Poster film7 = new Poster(7, "Аватар", "Фантастика", "urlAvatar", 2009);
    Poster film8 = new Poster(8, "Аватар2", "Фантастика", "urlAvatar2", 2011);
    Poster film9 = new Poster(9, "Аватар3", "Фантастика", "urlAvatar3", 2017);
    Poster film10 = new Poster(10, "Аватар3", "Фантастика", "urlAvatar3", 2017);
    Poster film11 = new Poster(11, "Аватар", "Фантастика", "urlAvatar", 2009);
    Poster film12 = new Poster(12, "Аватар2", "Фантастика", "urlAvatar2", 2011);


    @Test
    public void shouldAddPoster() {
        Affiche affiche = new Affiche();

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

        Poster[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12};
        Poster[] actual = affiche.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseLastAdded() {
        Affiche affiche = new Affiche();

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


        Poster[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};
        Poster[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldReverseLastAddedIfResultLengthEntered() {
        Affiche affiche = new Affiche(5);

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


        Poster[] expected = {film12, film11, film10, film9, film8};
        Poster[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseResultLengthExceedsAffiche() {
        Affiche affiche = new Affiche(15);

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

        Poster[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Poster[] actual = affiche.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
