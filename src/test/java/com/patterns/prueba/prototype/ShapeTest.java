package com.patterns.prueba.prototype;

import com.patterns.creational.prototype.Rectangle;
import com.patterns.creational.prototype.Shape;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Shape")
class ShapeTest {

    @Test
    @DisplayName("InstanceOf")
    void testShape(){
        Shape shape = new Rectangle("verde", 1, 1);
        assertTrue(shape instanceof Shape);
    }


    @Test
    @DisplayName("Clone")
    void testClone() throws CloneNotSupportedException {
        Shape rect1 = new Rectangle("rojo", 100,100);
        Shape rectClonado = rect1.clone();

        assertNotEquals(rect1, rectClonado);
    }

}
