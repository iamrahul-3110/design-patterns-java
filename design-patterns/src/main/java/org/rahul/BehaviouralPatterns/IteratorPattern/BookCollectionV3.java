package org.rahul.BehaviouralPatterns.IteratorPattern;


import java.util.*;

public class BookCollectionV3 implements Iterable<Book>{
    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() { // now we don't need a separate method to create an iterator
        return books.iterator(); // Using the built-in iterator of the TreeSet class
    }
}