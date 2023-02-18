package ru.netology.affiche;

public class Poster {
    private int id;
    private String title;
    private String genre;
    private String imageUrl;
    private int releaseYear;

    public Poster(int id, String title, String genre, String imageUrl, int releaseYear) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.imageUrl = imageUrl;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
