package com.example.App2;


    import static org.junit.jupiter.api.Assertions.*;

    import org.junit.jupiter.api.DisplayName;
    import org.junit.jupiter.api.Test;

    public class CalculadoraTest {
        CalculatorBraing calculadora = new CalculatorBraing();

        @Test
        @DisplayName ("Test de la suma")
        public void testSumar() {
            assertEquals(10, calculadora.sumar(7, 3), "La suma de 7 y 3 debe ser 10");
        }

        @Test
        @DisplayName("Test de la resta")
        public void testRestar() {
            assertEquals(4, calculadora.restar(7, 3), "La resta de 7 y 3 debe ser 4");
        }
        @DisplayName("Test de la multiplicacion")
        @Test
        public void testMultiplicar() {
            // Verificar que la multiplicación funcione correctamente
            assertEquals(21, calculadora.multiplicar(7, 3), "La multiplicación de 7 y 3 debe ser 21");
        }
        @DisplayName("Test de la dividion")
        @Test
        public void testDividir() {
            // Verificar que la división funcione correctamente
            assertEquals(2, calculadora.dividir(6, 3), "La división de 6 y 3 debe ser 2");
        }
        @DisplayName("Test de la división por cero")
        @Test
        public void testDividirPorCero() {
            // Verificar la división por cero
            assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0),
                    "La división por cero debe lanzar una excepción ArithmeticException");
        }

        @DisplayName("Test de Suma de numeros negativos")
        @Test
        public void testSumarNumerosNegativos() {
            // Verificar la suma de números negativos
            assertTrue(calculadora.sumar(-3, -2) < 0, "La suma de dos números negativos debe ser negativa");
        }
        @DisplayName("Test de la suma de numeros negativos")
        @Test
        public void testSumarEsNoNulo() {
            // Verificar que el resultado de sumar no es nulo
            assertNotNull(calculadora.sumar(5, 5), "El resultado de la suma no debe ser nulo");
        }
    }


