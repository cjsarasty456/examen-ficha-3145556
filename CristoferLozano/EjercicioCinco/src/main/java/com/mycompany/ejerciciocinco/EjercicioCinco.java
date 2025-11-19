/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocinco;

import java.util.Arrays;

/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class EjercicioCinco {

    public static void main(String[] args) {
        int[][] matriz = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        System.out.println("Matriz:");
        mostrarMatriz(matriz);
        
        // Rotar la matriz
        int[][] matrizRotada = rotarMatriz(matriz);
        
        System.out.println("Matriz rotada a la derecha:");
        mostrarMatriz(matrizRotada);
    }
    //metodo para rotar la matriz
    public static int [][] rotarMatriz (int[][] matriz){
        int matri = matriz.length;
        
        int[][] resul = new int [matri][matri];
        
        for (int posicionUno = 0; posicionUno < matri; posicionUno ++){
            for (int posicionDos = 0; posicionDos < matri; posicionDos ++){
                // los elementos cambian de posicion
                resul[posicionDos][matri - 1 - posicionUno] = matriz[posicionUno][posicionDos];
            }
        }
        
        return resul;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
    
}
