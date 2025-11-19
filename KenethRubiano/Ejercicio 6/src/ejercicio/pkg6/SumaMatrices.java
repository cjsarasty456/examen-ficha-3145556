/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

/**
 *
 * @author SoporteSENA
 */
public class SumaMatrices {
    public static void main(String[] args) {
        int[][] A = {
            {1, 3},
            {2, 5}
        };

        int[][] B = {
            {4, 2},
            {6, 1}
        };
/* se suman columa y filas de matriz a */
        int filas = A.length;
        int columnas = A[0].length;

        int[][] C = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
/* imprimimos la matriz final*/
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
