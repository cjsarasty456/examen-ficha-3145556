package com.mycompany.ejercicioseis;

/**
 * Suma de matrices
 * La suma de matrices consiste en sumar elemento a elemento dos matrices que
 * tienen la misma dimensión (mismo número de filas y columnas).
 * Ejemplo 1: Suma de matrices 2x2
 * A =
 * 1 3
 * 2 5
 * B =
 * 4 2
 * 6 1
 * C = A + B =
 * 5 5
 * 8 6
 * @author Jhampier
 */
public class EjercicioSeis {

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
        
        //suma de elementos
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        //resultado
        System.out.println("Matriz C (A + B):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
