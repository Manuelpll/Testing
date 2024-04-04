package Numeos_01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Numeros {

     public static final int NUN_MAX = 10;
     public static int par = 0;
     public static int impar = 0;
    public static int c = 0;

    public static void main(String[] args) {
        validarNumeros();
        mostrarResultado();
    }


    public static void validarNumeros() {
        Scanner scanner = new Scanner(System.in);
        while(c<NUN_MAX) {
            try {
                System.out.println("Introduce entero");
                int var = scanner.nextInt();
                esPar(var);
                c = c+1;

            }catch (InputMismatchException e) {
                System.out.println("Entero por favor");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static void esPar(int var) {
        if ((var%2)==0) {
            par = par+1;
        }else {
            impar = impar+1;
        }
    }

    public static void mostrarResultado() {
        System.out.println("Impar: "+ impar + "Par: "+ par);
    }
}
