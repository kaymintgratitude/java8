package com.java8.lambda.functionalinterface;

import java.util.Objects;

public class Book {

    private int numberOfPages;
    private String title;
    private int id;

    public Book(int numberOfPages, String title, int id) {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.id = id;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages &&
                id == book.id &&
                title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPages, title, id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}
