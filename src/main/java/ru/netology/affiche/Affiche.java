package ru.netology.affiche;

public class Affiche {

    private ru.netology.affiche.Poster[] posters = new ru.netology.affiche.Poster[0];
    private int resultLength = 10;



    public Affiche(int resultLength) {
        this.resultLength = resultLength;

    }
    public Affiche() {

    }
    public int getResultLength () {
        return resultLength;
    }

    public void addNewPoster(ru.netology.affiche.Poster poster) {
        ru.netology.affiche.Poster[] tmp = new ru.netology.affiche.Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public ru.netology.affiche.Poster[] findAll() {
        return posters;
    }


    public ru.netology.affiche.Poster[] findLast() {
        ru.netology.affiche.Poster[] last = findAll();
        int resultReversed = getResultLength();
        if (resultReversed > findAll().length) {
            resultReversed = findAll().length;
        }
        ru.netology.affiche.Poster[] lastReversed = new ru.netology.affiche.Poster[resultReversed];
        for (int i = 0; i < resultReversed; i++) {
            lastReversed[i] = last[findAll().length - 1 - i];

        }
        return lastReversed;
    }
}
