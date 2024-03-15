package Actividad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Novel("El Señor de los Anillos", "J.R.R. Tolkien", 1000));

        List<Person> people = new ArrayList<>();
        people.add(new Student("Juan", 20, "Ingeniería"));
        people.add(new Teacher("María", 35, "Matemáticas"));

        for (Book book : books) {
            System.out.println(book.getInfo());
        }

        for (Person person : people) {
            System.out.println(person.getInfo());
        }
    }
}

