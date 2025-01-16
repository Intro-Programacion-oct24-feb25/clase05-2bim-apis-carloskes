/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;
import paquete06.claseimprimir1;

// import paquete04.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero(100);
        int valorB = OperadorUno.obtenerNumero(10);
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multiplicacion = OperadorTres.obtenerMultiplicacion(valorA, 
                                                                valorB);
        /*se llama a un procedimiento llamado claseimprimir que está en el
        paquete6 en con su clase especifica, le enviamos 4 valores enteros para
        que los imprima*/
        claseimprimir1.claseimprimir(suma,multiplicacion, valorA,valorB);
        
        /*System.out.printf("La suma de %d + %d es igual a: %d\n"
                + "La multiplicacion de %d * %d es igual a: %d\n",
                valorA,valorB,
                suma,
                valorA, valorB,
                multiplicacion);*/
    }
}
