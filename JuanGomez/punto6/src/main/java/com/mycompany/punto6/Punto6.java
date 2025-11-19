/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto6;

/**
 *
 * @author Juan Gomez
 */
import java.util.Arrays;

public class Punto6 {

    public static void main(String[] args) {

        int[][] A = {
            {1, 3},
            {2, 5}
        };

        int[][] B = {
            {4, 2},
            {6, 1}
        };

        int filas = A.length;
        int columnas = A[0].length;

        int[][] C = new int[filas][columnas];

        // Suma elemento por elemento
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Mostrar matrices
        System.out.println("Matriz A:");
        imprimir(A);

        System.out.println("\nMatriz B:");
        imprimir(B);

        System.out.println("\nResultado C = A + B:");
        imprimir(C);
    }

    public static void imprimir(int[][] m) {
        for (int[] fila : m) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
