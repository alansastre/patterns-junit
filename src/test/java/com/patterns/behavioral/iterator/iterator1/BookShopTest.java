package com.patterns.behavioral.iterator.iterator1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookShopTest {

    @Test
    void addBook() {

        Book bookToAdd = new Book("5656435", "Hawkins", 2021 );

        BookShop books = new BookShop();
        CustomIterator iterador = books.iterator();

        books.addBook(bookToAdd);

        Book lastBook = (Book) books.getOne(books.getSize());
        System.out.println(lastBook.getIsbn() + bookToAdd.getIsbn());
        assertEquals(lastBook.getIsbn(), bookToAdd.getIsbn());

    }

    @Test
    void addBookNull() {

        Book book1 = null;

        BookShop books = new BookShop();
        CustomIterator iterador = books.iterator();

        int totalBooksBefore = books.getSize();
        System.out.println(totalBooksBefore);
        books.addBook(book1);

        assertEquals(totalBooksBefore, books.getSize());

    }

    @Test
    void iterator() {

        BookShop books = new BookShop();

        assertTrue(books.iterator() instanceof CustomIterator);
    }

    @Test
    @DisplayName("iteratorHasNext")
    void iteratorHasNext() {

        Book book1 = new Book("5656435", "Hawkins", 2021 );

        BookShop books = new BookShop();

        books.addBook(book1);


        CustomIterator iterador = books.iterator();

        assertTrue(iterador.hasNext());


    }

    @Test
    @DisplayName("iteratorNotHasNext")
    void iteratorNotHasNext() {

        BookShop books = new BookShop();

        CustomIterator iterador = books.iterator();

        assertFalse(iterador.hasNext());

    }

    @Test
    @DisplayName("getNext")
    void getNext() {

        Book book1 = new Book("5656435", "Hawkins", 2021 );

        BookShop books = new BookShop();

        books.addBook(book1);


        CustomIterator iterador = books.iterator();


        assertTrue(iterador.next() instanceof Book);
    }

    @Test
    @DisplayName("noGetNext")
    void noGetNext() {

        BookShop books = new BookShop();

        CustomIterator iterador = books.iterator();

        assertEquals(false, iterador.next());

    }
}