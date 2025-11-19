/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ejercicio4;
import java.util.Scanner;

/**
 *
 * @author Smith
 */
public class Examen_Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Arreglo = new int[10];
        int[] Frecuencias = new int[10]; // Frecuencia de cada número 0-9

        // El usuario ingresa 10 numeros del 0 al 9 
        System.out.println("Ingrese 10 numeros del 0 al 9:");
        for (int i = 0; i < 10; i++) {
            Arreglo[i] = scanner.nextInt();
        }

        // Conteo de frecuencias
        for (int i = 0; i < 10; i++) {
            Frecuencias[Arreglo[i]]++;
        }

        // Crear un nuevo arreglo ordenado
        int[] Ordenado = new int[10];
        int index = 0;

        /* Se ordenan los numeros en base a su frecuencia*/
        for (int f = 10; f >= 0; f--) { 
            for (int num = 0; num < 10; num++) {
                if (Frecuencias[num] == f) {
                    for (int k = 0; k < f; k++) {
                        Ordenado[index] = num;
                        index++;
                    }
                }
            }
        }

        // Mostrar arreglo ordenado
        System.out.println("\nArreglo ordenado por frecuencia:");
        for (int i = 0; i < 10; i++) {
            System.out.print(Ordenado[i] + " ");
        }
    }
}
