package seriefibonaccirecursiva;

import java.util.Scanner;

/**
 * Estandar de codificacion: Pascal Case
 * @author SERGIO ALEJANDRO
 */
public class SerieFibonacciRecursiva {

    //Metodo main
    public static void main(String[] args) {
        //Leer el teclado
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la serie Fibonacci: ");
        //variable para guardar el numero digitado por teclado
        long Numero = Teclado.nextLong();
        
        //Dejar un espacio entre la cantidad digitada para la serie y el comienzo de la serie
        System.out.println(" ");

        //Muestra el resultado y/o la serie
        for (int i = 0; i < Numero; i++) {

            if (EsPrimo(Fibonacci(i))) {
                System.out.println(Fibonacci(i) + " - " + "Número Primo");
            } else {
                System.out.println(Fibonacci(i) + " - ");
            }
        }
    }

    //Metodo que calcula la secuencia hasta llegar a N numeros
    public static long Fibonacci(long NumeroIngresado) {

        if (NumeroIngresado > 1) {
            //Funcion Recursiva
            return Fibonacci(NumeroIngresado - 1) + Fibonacci(NumeroIngresado - 2);
        } else if (NumeroIngresado == 1) {
            //Caso base
            return 1;
        } else if (NumeroIngresado == 0) {
            //Caso base
            return 0;
        } else {
            //Error
            System.out.println("Ingrese un tamaño igual o mayor a 1");
            return -1;
        }
    }

    //Metodo que define si el numero de la serie es primo o no
    public static boolean EsPrimo(long NumeroValidar) {
        //Variable para guardar si el número a valir es primo o no
        boolean ValidacionPrimo = false;
        //Variable contadora de cantidad de divisibles que tiene el número ingresado
        int CantidadDivisibles = 0;

        //for para saber cuantos numeros divisibles tiene el valor ingresado
        for (int i = 1; i <= NumeroValidar; i++) {
            if (NumeroValidar % i == 0) {
                CantidadDivisibles++;
            }
        }
        
        //saber si el valor solo tiene 2 numeros divisibles/ primo
        if (CantidadDivisibles == 2) {
            ValidacionPrimo = true;
        }
        return ValidacionPrimo;
    }

}
