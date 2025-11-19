/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioseis;

import java.util.Arrays;

/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class EjercicioSeis {

    public static void main(String[] args) {
        //ejemplo del problema
        int[][] matrizA = {
            {1, 3},
            {2, 5}
        };

        int[][] matrizB = {
            {4, 2},
            {6, 1}
        };
        
        //muestra de las matrices en consola
        System.out.println("Matriz A:");
        mostrarM(matrizA);

        System.out.println("Matriz B:");
        mostrarM(matrizB);

        //uso del metodo para sumar las matrices
        int[][] matrizC = sumarM(matrizA, matrizB);

        System.out.println("Matriz C = A + B:");
        mostrarM(matrizC);
    }
    
    public static int[][] sumarM(int[][] a, int[][] b) {
        // Verificar que las matrices tengan las mismas dimensiones
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones");
        }

        int filas = a.length;
        int columnas = a[0].length;

        // Crear matriz resultado
        int[][] resultado = new int[filas][columnas];

        // Sumar elemento a elemento
        for (int posicionUno = 0; posicionUno < filas; posicionUno ++){
            for (int posicionDos = 0; posicionDos < filas; posicionDos ++){
                // los elementos cambian de posicion
                resultado[posicionUno][posicionDos] = a[posicionUno][posicionDos] + b[posicionUno][posicionDos];
            }
        }

        return resultado;
    }
    
    public static void mostrarM(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();
    }
}
