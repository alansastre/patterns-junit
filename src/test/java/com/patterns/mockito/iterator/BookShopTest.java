package com.patterns.mockito.iterator;

import mockito.iterator.iterator1.Book;
import mockito.iterator.iterator1.BookShop;
import mockito.iterator.iterator1.CustomIterator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookShopTest {

    // captors:
    @Captor
    ArgumentCaptor<Book> bookArgumentCaptor;

    // dependencias
    @Mock
    BookShop bookShop;

    // SUT - dependiente
    @InjectMocks
    Book book;


    @Test
    @DisplayName("addBook")
    void addBook() {

        Book bookToAdd = new Book("5656435", "Hawkins", 2021 );

        bookShop.addBook(bookToAdd);

        System.out.println("num libros: " + bookShop.getSize());

        verify(bookShop).addBook(bookArgumentCaptor.capture());
        System.out.println(bookArgumentCaptor.getValue());

        assertEquals(bookArgumentCaptor.getValue(), bookToAdd);
    }

    @Test
    @DisplayName("addBookNull")
    void addBookNull() {


        int totalBooksBefore = bookShop.getSize();

        bookShop.addBook(null);

        assertEquals(totalBooksBefore, bookShop.getSize());

    }


    @Test
    @DisplayName("getSizeBookShop")
    @Disabled("")
    void getSizeBookShop() {
        // 1 Configurar mocks
        when(bookShop.getSize()).thenReturn(1);

        // 2 - Probar el SUT

        bookShop.addBook(new Book("5656435", "Hawkins", 2021 ));
        bookShop.addBook(new Book("1254265", "Martins", 2021 ));
        assertEquals(2, bookShop.getSize());

        // 3 - Verificar datos y mock
        verify(bookShop, times(1)).getSize();

    }

    @Test
    @DisplayName("getSizeBookShop2")
    void getSizeBookShop2() {
        // 1 Configurar mocks
        when(bookShop.getSize()).thenReturn(2);

        // 2 - Probar el SUT
        bookShop.addBook(new Book("5656435", "Hawkins", 2021 ));
        bookShop.addBook(new Book("1254265", "Martins", 2021 ));
        assertEquals(2, bookShop.getSize());

        // 3 - Verificar datos y mock
        verify(bookShop, times(1)).getSize();
       // verify(bookShop, times(1)).addBook(new Book("5656435", "Hawkins", 2021 ));
       // verify(bookShop, times(1)).addBook(new Book("1254265", "Martins", 2021 ));
    }

    @Test
    @DisplayName("iterator")
    void iterator() {

        BookShop books = new BookShop();

        assertNotNull(books.iterator());

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
}