/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import org.apache.commons.lang3.math.NumberUtils;

/*Dado el siguiente arreglo
```
String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
```

Obtener como resultado un arreglo con las siguientes características:

```
int[] dataFinal = {100, 90, 0, 10, 0, 0};
```
Presentar dataFinal

Usar el método toInt de la clase NumberUtils, revisar la información en  https://commons.apache.org/proper/commons-lang/javadocs/api-release/index.html 
 */
public class clase03 {

    public static void main(String[] args) {
        int default1 = 0;
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int[] datafinal = new int[dataInicial.length];
        for (int i = 0; i < dataInicial.length; i++) {
            datafinal[i] = NumberUtils.toInt(dataInicial[i]);

        }
        for (int i = 0; i < dataInicial.length; i++) {
            System.out.printf("%d", datafinal[i]);
        }

    }
}
