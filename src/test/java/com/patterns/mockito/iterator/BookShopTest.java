package com.patterns.mockito.iterator;

import com.patterns.behavioral.iterator.iterator1.CustomIterator;
import mockito.iterator.iterator1.Book;
import mockito.iterator.iterator1.BookShop;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

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

        Book book = new Book("5656435", "Hawkins", 2021 );


        assertNotNull(book);

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
/*
    @Test
    @DisplayName("iterator")
    void iterator() {

        // 1 Configurar mocks
        when(bookShop.iterator()).thenReturn(new CustomIterator);

        // 2 - Probar el SUT
        assertTrue(bookShop.iterator() instanceof CustomIterator);

        // 3 - Verificar datos y mock
        verify(bookShop, times(1)).iterator();


    }

    @Test
    @DisplayName("iteratorHasNext")
    public void iteratorHasNext() {




    }*/
}