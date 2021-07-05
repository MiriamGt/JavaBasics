package demo;

import java.security.PublicKey;

public class Libro {

    private String title;
    private String isbn;
    private String author;

    public Libro(){

    }

    public Libro(String title, String isbn, String author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle() {

    }

    public void prestamo() {

    }

    public void devolucion() {

    }

    public String toString(String title, String isbn, String author) {
        return this.title + ", " + this.isbn + ", " + this.author;
    }
}
