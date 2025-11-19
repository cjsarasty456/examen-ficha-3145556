/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class RotacionMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo:");
        int tamaño = sc.nextInt();
        // Se ingresa un único valor para la matriz ya que tiene el mismo tamaño para ambas dimensiones.
        
        int[][] arreglo = new int[tamaño][tamaño];
        // Se crea la matriz.
        
        for (int i = 0; i < tamaño; i++) {
            for (int ii = 0; ii < tamaño; ii++) {
                System.out.println("Ingrese el número de la posición "+(i+1)+", "+(ii+1)+":");
                arreglo[i][ii] = sc.nextInt();
            }
        }
        // Se pide el ingreso de los valores de la matriz.
        
        int[][] arregloRotado = new int[tamaño][tamaño];
        // Se crea una nueva matriz donde se insertarán los valores rotados.
        
        for (int i = 0; i < tamaño; i++) {
            for (int ii = 0; ii < tamaño; ii++) {
                arregloRotado[i][ii] = arreglo[tamaño - 1 - ii][i];
            }
        }
        // Con este ciclo for y esta asignación se rota la matriz hacia la derecha.
        
        System.out.println("Matriz inicial:");
        
        for (int i = 0; i < tamaño; i++) {
            for (int ii = 0; ii < tamaño; ii++) {
                System.out.print(arreglo[i][ii] +"   ");
            }
            System.out.println(" ");
        }
        
        System.out.println("Matriz rotada 90° a la derecha:");
        
        for (int i = 0; i < tamaño; i++) {
            for (int ii = 0; ii < tamaño; ii++) {
                System.out.print(arregloRotado[i][ii] +"   ");
            }
            System.out.println(" ");
        }
    }
}
