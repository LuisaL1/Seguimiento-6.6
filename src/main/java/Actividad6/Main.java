package Actividad6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        Item book1 = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 15.99f);
        Item book2 = new Book("Stephen King", "The Shining", 12.50f);
        Item book3 = new Book("Agatha Christie", "Murder on the Orient Express", 18.75f);

        Item movie1 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "Elijah Wood", "Peter Jackson", 19.99f);
        Item movie2 = new Movie("The Shawshank Redemption", "Tim Robbins", "Frank Darabont", 14.99f);
        Item movie3 = new Movie("Inception", "Leonardo DiCaprio", "Christopher Nolan", 17.50f);

        items.add(book1);
        items.add(book2);
        items.add(book3);
        items.add(movie1);
        items.add(movie2);
        items.add(movie3);

        System.out.println("Listado de libros y películas disponibles:");
        for (Item item : items) {
            System.out.println(item);
        }
        
        float totalVentas = 0;
        for (Item item : items) {
            totalVentas += item.getPrice();
        }
        System.out.println("\nTotal de ventas realizadas: $" + totalVentas);
    }
}
