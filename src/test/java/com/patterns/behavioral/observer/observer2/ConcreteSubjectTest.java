package com.patterns.behavioral.observer.observer2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteSubjectTest {

    @Test
    @DisplayName("Añadir Suscriptor")
    void addSubscriberTest() {
        ConcreteSubject elon = new ConcreteSubject("@elonmusk");
        Observer bloomberg = new ConcreteObserver("bloomberg");
        assertEquals(0, elon.observers.size());
        elon.addSubscriber(bloomberg);
        assertEquals("@elonmusk",elon.handle);
        assertEquals(1, elon.observers.size());

    }

    @Test
    @DisplayName("Eliminar Suscriptor")
    void removeSubscriberTest() {
        ConcreteSubject elon = new ConcreteSubject("@elonmusk");
        Observer bloomberg = new ConcreteObserver("bloomberg");
        elon.addSubscriber(bloomberg);
        assertEquals(1, elon.observers.size());
        elon.removeSubscriber(bloomberg);
        assertEquals(0, elon.observers.size());

    }

    @Test
    @DisplayName("Notificar Suscriptor")
    void notifySubscribersTest() {
        ConcreteSubject elon = new ConcreteSubject("@elonmusk");
        Observer bloomberg = new ConcreteObserver("bloomberg");
     //   System.out.println(bloomberg.notify(elon.handle, "Test"));
        assertSame(elon.handle, bloomberg.notify(elon.handle, "Test"));
    }

}