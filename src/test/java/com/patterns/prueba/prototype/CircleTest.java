package com.patterns.prueba.prototype;

import com.patterns.creational.prototype.Circle;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Circle")
public class CircleTest {


    @Test
    @DisplayName("InstanceOf")
    void testCircle(){
        Circle circle = new Circle("amarillo", 1.0);
        assertTrue(circle instanceof Circle);
    }

    @Test
    @DisplayName("Clone")
    void testClone() throws CloneNotSupportedException{
        Circle circle =  new Circle("amarillo", 2.0);
        Circle circleClonado = new Circle(circle);
        //Circle(Circle cloneCircle)

        assertNotEquals(circle, circleClonado);

        assertEquals(circle.getColor(), circleClonado.getColor());
        assertEquals(circle.getRadio(), circleClonado.getRadio());
        assertEquals(circle.getRadio(),  circleClonado.getRadio());
    }

    @Test
    @DisplayName("Area")
    void testArea() throws CloneNotSupportedException{
        Circle circle =  new Circle("amarillo", 1.0);

        assertEquals(Math.PI,  circle.area());
    }
}
