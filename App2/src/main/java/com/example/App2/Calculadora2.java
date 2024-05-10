package com.example.App2;

public class Calculadora2 {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) throws Exception {
        if (b != 0) {
            return a / b;
        }
        throw new Exception("Error");
    }
}