/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenarfrecuencia;

/**
 *
 * @author juani
 */

import java.util.Arrays;

public class OrdenarFrecuencia {
    public static void main(String[] args) {

        int[] arr = {4, 4, 1, 2, 2, 2, 3};

        int[] resultado = ordenarPorFrecuencia(arr);

        System.out.println(Arrays.toString(resultado));
    }

    public static int[] ordenarPorFrecuencia(int[] arr) {

        int[] resultado = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultado[i] = arr[i];
        }

        // voy a ordenar usando un método similar a burbuja pero comparando por frecuencia
        for (int i = 0; i < resultado.length - 1; i++) {
            for (int j = 0; j < resultado.length - 1 - i; j++) {

                // Sacamos los dos valores que vamos a comparar
                int a = resultado[j];
                int b = resultado[j + 1];

                // Contamos cuántas veces aparece a en el arreglo
                int contadorA = 0;
                for (int k = 0; k < resultado.length; k++) {
                    if (resultado[k] == a) {
                        contadorA++;
                    }
                }

                // Contamos cuántas veces aparece "b" en el arreglo
                int contadorB = 0;
                for (int k = 0; k < resultado.length; k++) {
                    if (resultado[k] == b) {
                        contadorB++;
                    }
                }

              
                if (contadorA < contadorB) {
                    int temp = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temp;
                }
                  else if (contadorA == contadorB    && a > b) {
                    int temp = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temp;
                }
            }
        }

        return resultado;
    }
}

