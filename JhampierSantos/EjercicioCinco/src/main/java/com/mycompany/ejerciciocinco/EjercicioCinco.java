

package com.mycompany.ejerciciocinco;

import java.util.Arrays;

/**
 * Rotación de matriz (90°)
 * Descripción:
 * Escribe una función que reciba una matriz NxN y retorne su versión rotada 90° a la derecha.
 * Datos ejemplo:
 * Entrada:
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * Salida:
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * @author Jhampier
 */
public class EjercicioCinco {

    public static int[][] rotarMatriz90Derecha(int[][] matriz) {
        int n = matriz.length;
        int[][] rotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotada[j][n - 1 - i] = matriz[i][j];
            }
        }

        return rotada;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("matriz original:");
        imprimirMatriz(matriz);

        int[][] matrizRotada = rotarMatriz90Derecha(matriz);

        System.out.println("matriz rotada 90° a la derecha:");
        imprimirMatriz(matrizRotada);
    }
}
