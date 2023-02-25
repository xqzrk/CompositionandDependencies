package ru.netology.affiche;

public class Affiche {

    private Poster[] posters = new Poster[0];
    private int resultLength = 10;



    public Affiche(int resultLength) {
        this.resultLength = resultLength;

    }
    public Affiche() {

    }
    public int getResultLength () {
        return resultLength;
    }

    public void addNewPoster(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Poster[] findAll() {
        return posters;
    }


    public Poster[] findLast() {
        Poster[] last = findAll();
        int resultReversed = getResultLength();
        if (resultReversed > findAll().length) {
            resultReversed = findAll().length;
        }
        Poster[] lastReversed = new Poster[resultReversed];
        for (int i = 0; i < resultReversed; i++) {
            lastReversed[i] = last[findAll().length - 1 - i];

        }
        return lastReversed;
    }
}
