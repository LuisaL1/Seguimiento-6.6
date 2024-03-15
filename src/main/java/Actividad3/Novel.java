package Actividad3;

public class Novel extends Book {
    public Novel(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String getInfo() {
        return "Título: " + getTitle() + ", Autor: " + getAuthor() + ", Páginas: " + getPages();
    }
}

