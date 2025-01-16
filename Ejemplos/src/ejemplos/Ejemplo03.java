/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.security.SecureRandom;
// import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numeroelementos = 20;
        int limite = 100;
        int[] valores = obtenerValores(numeroelementos, limite);
        //int suma = obtenerSuma(valores, limite);
        //for (int i = 0; i < valores.length; i++) {
        //  System.out.printf("%d\n", valores[i]);

        presentardatos(valores);
    }

    public static void presentardatos(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }

    public static int[] obtenerValores(int a, int b) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        int[] valores = new int[a];

        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        for (int i = 0; i < a; i++) {
            valores[i] = numerosAleatorios.nextInt(b);

        }
        return valores;
    }
}
