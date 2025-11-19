/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ejercicio5;
import java.util.Scanner;

/**
 *
 * @author Smith
 */
public class Examen_Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija el tamaño de la matriz NxN");
        int N = scanner.nextInt();

        int[][] Matriz = new int[N][N]; //Se define el tamaño de la matriz NxN

        int CantTotal = N * N;
        System.out.println("Cantidad de números: " + CantTotal);
        System.out.println("Ingrese los números para llenar la matriz:");

        // El usuario ingresa los valores a la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Matriz[i][j] = scanner.nextInt();
            }
        }

        /*Se recorren nuevamente las matrices pero una se recorre convencionalmente de izquierda a derecha y arriba a abajo
        Esto da como resultado una matriz temporal equivalente a 
        1, 4, 7,
        2, 5, 8,
        3, 6, 9         Ahora toca invertirla verticalmente
        */
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                Matriz[i][j] = Matriz[j][i];
            }
        }

        //Se recorren las matrices nuevamente para invertir las filas unicamente
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = Matriz[i][j];
                Matriz[i][j] = Matriz[i][N - 1 - j];
                Matriz[i][N - 1 - j] = temp;
            }
        }

        System.out.println("La matriz al ser rotada 90 grados queda así:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(Matriz[i][j]);
            }
        }
    }
}
