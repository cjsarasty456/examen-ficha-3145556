/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrices;

/**
 *
 * @author thiag
 */
public class Matrices {

    public static void main(String[] args) {
        
        int[][] A = {
            {1, 3},
            {2, 5}
        };
        int[][] B = {
            {4, 2},
            {6, 1}
        };
        //Creamos nuestras matrices 2x2
        
        int filas = A.length;
        int columnas = A[0].length;

        int[][] C = new int[filas][columnas]; // Creamos otra matriz del mismo tamaño que nos va mostrar el resultado de la suma 

        // Sumamos A + B recorriendo con el for cada posicion y va sumando cada uno a uno 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Aqui pues se va imprimir el resultado de forma matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

