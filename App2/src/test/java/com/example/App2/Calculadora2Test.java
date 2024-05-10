package com.example.App2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class Calculadora2Test {
    Calculadora2 calculadora2 {


    @BeforeEach
    void setUp() {
         calculadora2 = new Calculadora2() {

            @Test
            void tenSumByTwoEqualsTwenty() {
            int result = calculadora2.sumar(10, 20);

            assertEquals(30);
            }

             private void assertEquals(int i) {
             }

         }
    }
}