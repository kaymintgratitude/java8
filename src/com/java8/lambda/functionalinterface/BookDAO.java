package com.java8.lambda.functionalinterface;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            books.add(new Book(i+1000, String.format("Book %d", i), i+239));
        return books;
    }
}
