package org.example.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("first", "author"));
        books.add(new Book("second", "author-2"));
        books.add(new Book("third", "author-3"));
        books.add(new Book("fourth", "author-4"));
        books.add(new Book("fourth", "author-4"));
        books.add(new Book("fifth", "author-5"));

        System.out.println("======================== Using a parameter =====================");

        //  creating a comparator object directly as a parameter to the function
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        books.stream().forEach(book -> System.out.println(book.getName() + " : " + book.getAuthor()));

        System.out.println("======================== Using a lambda operation =====================");
        Collections.sort(books, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        books.stream().forEach(book -> System.out.println(book.getName() + " : " + book.getAuthor()));

        System.out.println("======================== Using a class =====================");

        Collections.sort(books, new BookComparator());

        books.stream().forEach(book -> System.out.println(book.getName() + " : " + book.getAuthor()));
    }
}
