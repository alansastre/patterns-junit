package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardStrategyTest {

    /*
    *   We are going to check CVV code has a length of 3.
    * */
    @Test
    @DisplayName("check CVV has a lenght of 3.")
    void test1(){
        CreditCardStrategy card = new CreditCardStrategy("Juan", "456785413658","456","25/02/2007");

        Function<String,Integer> calc = String::length;
        assertEquals(3, calc.apply(card.getCcv()));
    }

    @Test
    @DisplayName("check CVV code is digits")
     void test2(){
        CreditCardStrategy card = new CreditCardStrategy("Juan", "456785413658","456","25/02/2007");
        assertTrue(card.getCcv().chars().allMatch(Character::isDigit));
    }
    @Test
    @DisplayName("check cardNumber is only digit")
    void test3(){
        CreditCardStrategy card = new CreditCardStrategy("Juan", "456785413658","456","25/02/2007");
        assertTrue(card.getCardNumber().chars().allMatch(Character::isDigit));
    }

    @Test
    @DisplayName("DateOfExpirity is a valid DATE")
    void test4() throws ParseException {
        CreditCardStrategy card = new CreditCardStrategy("Juan", "456785413658","456","25-02-2007");
        assertTrue(isDateValid(card.getDateOfExpiry()));

    }

    public static boolean isDateValid(String date)
    {
        try {
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}