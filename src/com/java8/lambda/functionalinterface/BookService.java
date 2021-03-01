package com.java8.lambda.functionalinterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getSortedBooks(){
        List<Book> books = new BookDAO().getBooks();
//        Collections.sort(books, new MyComparator());
//        Collections.sort(books, new Comparator<Book>(){
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getTitle().compareTo(o2.getTitle());
//            }
//        });
        Collections.sort(books, (o1, o2) -> o2.getTitle().compareTo(o1.getTitle()));
        return books;
    }

    public static void main(String[] args){
        System.out.println(new BookService().getSortedBooks());
    }
}

class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
