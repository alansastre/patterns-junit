package com.patterns.mockito.iterator;

import mockito.iterator.iterator1.BookShop;
import mockito.iterator.iterator1.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BookShopJUnitTest {


    private BookShop bookShop;

    @BeforeEach
    void setUp() {
        bookShop = new BookShop();
    }

    @Test
    @DisplayName("Test name")
    void testName() {

        Book book1 = new Book("1234379873","Darwin",1990);
        Book book2 = new Book("1234379873","Darwin",1990);

        bookShop.addBook(book1);
        bookShop.addBook(book2);

        Assertions.assertEquals(2,bookShop.getSize());

    }


}
