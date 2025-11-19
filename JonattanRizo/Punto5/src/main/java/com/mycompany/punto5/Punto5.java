/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.punto5;

/**
 *
 * @author Jonattan Rizo
 */
public class Punto5 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizRotada = rotarMatriz(matriz);
        
        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada[i].length; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotarMatriz(int[][] matriz) {
        int n = matriz.length;
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[j][n - 1 - i] = matriz[i][j];
            }
        }

        return resultado;
    }
}
