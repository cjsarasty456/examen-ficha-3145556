/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.rotacionmatriz;

import java.util.Arrays;

/**
 * @author Aprendiz
 */
public class RotacionMatriz {

    public int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    public static void main(String[] args) {

        RotacionMatriz rm = new RotacionMatriz();

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] rotada = rm.rotateMatrix(matriz);

        System.out.println("\nMatriz rotada 90°:");
        imprimirMatriz(rotada);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }  
}