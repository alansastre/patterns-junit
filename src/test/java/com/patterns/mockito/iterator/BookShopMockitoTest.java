package com.patterns.mockito.iterator;

import mockito.iterator.iterator1.Book;
import mockito.iterator.iterator1.BookShop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookShopMockitoTest {


    // dependencia
    @Mock
    Book book;


    // SUT
    @InjectMocks
    BookShop bookShop;


    @Test
    @DisplayName("Check retrieve one book")
    void testName() {

        Book normalBook = new Book("ssdsd","sdad",12);
        when(book.getIsbn()).thenReturn("12345");
        bookShop.addBook(book);
        bookShop.addBook(normalBook);
        Assertions.assertEquals(2,bookShop.getSize());
        Optional<Book> bookOpt =  bookShop.getOne(0);
        Assertions.assertTrue(bookOpt.isPresent());
        Book book2 = bookOpt.get();
        Assertions.assertEquals(book.getIsbn(),book2.getIsbn());


        // Probar indices out of bound
        bookShop.getOne(-5);
        bookShop.getOne(28);

    }
}
