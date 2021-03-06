package com.patterns.prueba.prototype;

import com.patterns.creational.prototype.Rectangle;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Rectangle")
class RectangleTest {

    @Test
    @DisplayName("InstanceOf")
    void testRectangle(){
        Rectangle rect = new Rectangle("azul", 3, 3);
        assertTrue(rect instanceof Rectangle);
    }

    @Test
    @DisplayName("Clone")
    void testClone() throws CloneNotSupportedException {
        Rectangle rect = new Rectangle("rojo", 100,100);
        Rectangle rectClonado = rect.clone();

        assertNotEquals(rect, rectClonado);

        assertEquals(rect.getColor(), rectClonado.getColor());
        assertEquals(rect.getHeight(), rectClonado.getHeight());
        assertEquals(rect.getWidth(),rectClonado.getWidth());
    }

    @Test
    @DisplayName("Area")
    void testArea(){
        Rectangle rect = new Rectangle("blanco", 2.0, 5.0);

        assertEquals(10.0, rect.area());
    }

}
