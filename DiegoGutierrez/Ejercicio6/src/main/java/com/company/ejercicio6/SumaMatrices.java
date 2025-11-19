/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class SumaMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas de los arreglos:");
        int filas = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas de los arreglos:");
        int columnas = sc.nextInt();
        
        int[][] arregloA = new int[filas][columnas];
        int[][] arregloB = new int[filas][columnas];
        // Creamos los 2 arreglos.
        
        for (int i = 0; i < filas; i++) {
            for (int ii = 0; ii < columnas; ii++) {
                System.out.println("Ingrese el número de la posición "+(i+1)+", "+(ii+1)+" del primer arreglo:");
                arregloA[i][ii] = sc.nextInt();
            }
        }
        // Se ingresan los valores que contiene el arreglo A.
        
        for (int i = 0; i < filas; i++) {
            for (int ii = 0; ii < columnas; ii++) {
                System.out.println("Ingrese el número de la posición "+(i+1)+", "+(ii+1)+" del segundo arreglo:");
                arregloB[i][ii] = sc.nextInt();
            }
        }
        // Se ingresan los valores que contiene el arreglo B.
        
        int[][] arregloC = new int[filas][columnas];
        // Se crea el arreglo donde se van a sumar las matrices ya creadas y llenadas.
        
        for (int i = 0; i < filas; i++) {
            for (int ii = 0; ii < columnas; ii++) {
                arregloC[i][ii] = arregloA[i][ii] + arregloB[i][ii];
            }
        }
        // Se almacena en el arreglo C la suma de los otros 2 arreglos.
        
        for (int i = 0; i < filas; i++) {
            for (int ii = 0; ii < columnas; ii++) {
                System.out.print(arregloA[i][ii] +" + "+ arregloB[i][ii] + "  |  ");
            }
            System.out.print("=  ");
            for (int ii = 0; ii < columnas; ii++) {
                System.out.print(arregloC[i][ii]+"  ");
            }
            System.out.println("");
        }
        // Y por último, se imprime el resultado esperado del ejercicio.
    }
}
