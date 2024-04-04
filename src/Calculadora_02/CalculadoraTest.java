package Calculadora_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void suma() {
        double valorEsperado = 30;
        Calculadora calcu = new Calculadora(20,10);
        double resultado = calcu.suma();
        assertEquals(valorEsperado, resultado,0);
    }

    @Test
    void resta() {
        double valorEsperado = 10;
        Calculadora calcu = new Calculadora(20,10);
        double resultado = calcu.resta();
        assertEquals(valorEsperado, resultado, 0);
    }

    @Test
    void multiplica() {
        double valorEsperado = 200;
        Calculadora calcu = new Calculadora(20,10);
        double resultado = calcu.multiplica();
        assertEquals(valorEsperado, resultado, 0);
    }

    @Test
    void divide() {
        double valorEsperado = 2;
        Calculadora calcu = new Calculadora(20,10);
        double resultado = calcu.divide();
        assertEquals(valorEsperado, resultado, 0);
    }
    @Test
    public void testDivide0() {
        Calculadora calcu = new Calculadora(20,0);
        assertThrows(ArithmeticException.class, () -> calcu.divide(), "excepcion");
    }
    @Test
    public void testAll() {
        double valorEsperadoSuma = 30;
        double valorEsperadoResta = 10;
        double valorEsperadoMultiplica = 200;
        double valorEsperadoDivide = 2;
        Calculadora calcu = new Calculadora(20,10);
        assertAll(
                ()-> assertEquals(valorEsperadoSuma, calcu.suma(),0),
                ()-> assertEquals(valorEsperadoResta, calcu.resta(),0),
                ()-> assertEquals(valorEsperadoMultiplica, calcu.multiplica(),0),
                ()-> assertEquals(valorEsperadoDivide, calcu.divide(),0)
        );
    }
}