package com.patterns.prueba.DecoratorTestsSara;


import com.patterns.structural.decorator.BorderThicknessDecorator;
import com.patterns.structural.decorator.Circle;
import com.patterns.structural.decorator.Rectangle;
import com.patterns.structural.decorator.Shape;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BorderThicknessDecoratorTest {

    @Test
    void description() {
        Shape rectangulo = new Rectangle();
        Shape rectanguloDecorado = new BorderThicknessDecorator(rectangulo, "2px");
        assertEquals("Hey there! I'm using Decorator! decorated with border thickness: 2px",rectanguloDecorado.description());
    }

    @Test
    void isHide() {
        Shape circulo = new Circle();
        Shape circuloDecorado = new BorderThicknessDecorator(circulo, "2px");
        assertEquals(false,circuloDecorado.isHide());
    }
}