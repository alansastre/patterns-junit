package com.patterns.mockito;

import mockito.iterator.iterator1.Book;
import mockito.iterator.iterator1.BookShop;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SuiteTest {

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

        book.setIsbn("5656435");
        book.setAuthor("Hawkins");
        book.setYear(2021);

        bookShop.addBook(book);

        System.out.println("num libros: " + bookShop.getSize());

        verify(bookShop).addBook(bookArgumentCaptor.capture());
        System.out.println(bookArgumentCaptor.getValue());

        assertEquals(bookArgumentCaptor.getValue(), book);
    }
}
