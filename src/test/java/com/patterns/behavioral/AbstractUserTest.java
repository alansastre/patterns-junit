package com.patterns.behavioral;

import com.patterns.behavioral.mediator.AbstractUser;
import com.patterns.behavioral.mediator.ChatMediator;
import com.patterns.behavioral.mediator.Telegram;
import com.patterns.behavioral.mediator.User;
import com.patterns.behavioral.observer.observer1.WeatherType;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AbstractUserTest {

    // captors:
    @Captor
    ArgumentCaptor<String> messageArgumentCaptor;

    // dependencias
    @Mock
    ChatMediator chat2;

    // SUT - dependiente
    @InjectMocks
    User user3;


    ChatMediator chat = new Telegram();
    AbstractUser user1 = new User(chat, "Juan");
    AbstractUser user2 = new User(chat, "Alberto");


    @Test
    @DisplayName("comprobando user notNull")
    void test1() {
        assertNotNull(user1);
    }

    @Test
    @DisplayName("comprobando user1 notEqual user2 ")
    void test2() {
        assertNotEquals(user1, user2);
    }

    @Test
    @DisplayName("comprobando user1 instanceof AbstractUser ")
    void test3() {
        assertTrue(user1 instanceof AbstractUser);
    }

    @Test
    @DisplayName("comprobando chat instanceof ChatMediator ")
    void test4() {
        assertTrue(chat instanceof ChatMediator);
    }

    @Test
    @DisplayName("comprobando recibe el mensaje ")
    @Disabled("FIX - mediator tests")
    void test5() {
        user3.setName("Sergio");
        user3.setMediator(chat2);

        chat2.sendMessage("Hola buenas!", user3);

        ArgumentCaptor<String> messageArgumentCaptor = ArgumentCaptor.forClass(String.class);

        verify(chat2).sendMessage(messageArgumentCaptor.capture(),eq(user3));
        assertEquals("Hola buenas!", messageArgumentCaptor.getValue());
    }

}