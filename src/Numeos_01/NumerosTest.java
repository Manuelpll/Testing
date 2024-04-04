package Numeos_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {

    @Test
    public void testValidarNumeros() {
        Numeros.c = 10;
        Numeros.par = 6;
        Numeros.impar = 4;

        Numeros.validarNumeros();
        Numeros.mostrarResultado();

        // Verifica si c es igual a 10 después de llamar a validarNumeros()
        Assertions.assertEquals(10, Numeros.c);
    }//Fin del primer test
    @Test
    public void testValidarNumeros2() {
        Numeros.c = 9;
        Numeros.par = 6;
        Numeros.impar = 3;

        //introducimos un número impar
        Numeros.validarNumeros();
        Numeros.mostrarResultado();

        Assertions.assertEquals(4, Numeros.impar);
    }//Fin del segundo test

}