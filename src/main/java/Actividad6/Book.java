package Actividad6;

public class Book implements Item {
    private String author;
    private String title;
    private float price;

    public Book(String author, String title, float price) {
        this.author = author;
        this.title = title;
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
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
