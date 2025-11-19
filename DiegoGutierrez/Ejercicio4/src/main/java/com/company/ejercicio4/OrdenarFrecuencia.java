/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.ejercicio4;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author DIEGO
 */
public class OrdenarFrecuencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[10];
        int[] frecuencias = new int[10];
        // Definimos los arreglos a usar.
        // Cabe recalcar que el tamaño definido es para simplificar el código.

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número "+(i+1)+":");
            arreglo[i] = sc.nextInt();
        }
        // Insertamos los valores del arreglo a ordenar.

        for (int i = 0; i < 10; i++) {
            frecuencias[arreglo[i]] += 1;
        }
        // Si un número concuerda con la posición se incrementa la frecuencia.

        int[] ordenado = new int[10];
        int index = 0;
        // Definimos el índice en 0 para empezar a trabajar con él.

        for (int i = 10; i >= 0; i--) { 
            for (int ii = 0; ii < 10; ii++) {
                if (frecuencias[ii] == i) {
                    for (int iii = 0; iii < i; iii++) {
                        ordenado[index] = ii;
                        index =+ 1;
                        // Sumamos el índice según se cumpla la condición del bloque anterior.
                    }
                }
            }
        }

        System.out.println("Frecuencias:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + frecuencias[i]);
        }

        System.out.println("Arreglo ordenado por frecuencia:");
        for (int i = 0; i < 10; i++) {
            System.out.print(ordenado[i] + " ");
        }

        System.out.println();
    }
}