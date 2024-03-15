package Actividad6;

public class Movie implements Item {
    private String title;
    private String protagonist;
    private String director;
    private float price;

    public Movie(String title, String protagonist, String director, float price) {
        this.title = title;
        this.protagonist = protagonist;
        this.director = director;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", protagonist='" + protagonist + '\'' +
                ", director='" + director + '\'' +
                ", price=" + price +
                '}';
    }
}