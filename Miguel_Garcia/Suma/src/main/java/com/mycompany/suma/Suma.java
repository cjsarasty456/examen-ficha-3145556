/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma;

/**
 *
 * @author USUARIO
 */
public class Suma {
    public static void main(String[] args) {

        // Tenemos la matriz A
        int[][] A = {
            {1, 3},
            {2, 5}
        };

        // Aqui tenemos la matriz B
        int[][] B = {
            {4, 2},
            {6, 1}
        };

        // Matriz C, resultado de suma de matrices
        int[][] C = new int[2][2];

        // Sumamos elemento a elemento
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Mostramos la matriz resultante
        System.out.println("Resultado C = A + B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

