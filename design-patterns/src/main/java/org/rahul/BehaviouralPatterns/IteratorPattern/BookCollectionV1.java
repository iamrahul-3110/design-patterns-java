package org.rahul.BehaviouralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionV1 {
    private List<Book> books = new ArrayList<>(); // If we change the underlying data structure, we need to change the client code as well.
    // This violates the OCP (Open Closed Principle) of SOLID Principles. that's why we use Iterator Pattern.
    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }
}
