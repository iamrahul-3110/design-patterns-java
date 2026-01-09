package org.rahul.BehaviouralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollectionV2 {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public Iterator<Book> createIterator(){  // Method to create and return an iterator for the collection
        return new BookIterator(this.books); // depends on the nested class BookIterator ie. dependency Injection
    }

    //Another Class (Nested Class)
    private class BookIterator implements Iterator<Book>{
        private List<Book> books; // Collection to iterate over
        private int position = 0; // To keep track of current position in the collection

        public BookIterator(List<Book> books){
            this.books = books;
        }

        @Override
        public boolean hasNext() { // Check if there are more elements to iterate
           return position < books.size();
        }

        @Override
        public Book next() { // Return the next element in the collection
            return books.get(position++);
        }
    }
}