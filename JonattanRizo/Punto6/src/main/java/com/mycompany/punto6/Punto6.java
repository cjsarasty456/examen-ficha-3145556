/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.punto6;

/**
 *
 * @author Jonattan Rizo
 */
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

        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matriz C resultante la cual es (A + B):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
