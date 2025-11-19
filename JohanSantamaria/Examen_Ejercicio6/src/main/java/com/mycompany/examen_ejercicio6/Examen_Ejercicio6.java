/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.examen_ejercicio6;
import java.util.Scanner;

/**
 *
 * @author Smith
 */
public class Examen_Ejercicio6 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas de las matrices");
        int filas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de columnas de las matrices");
        int columnas = scanner.nextInt();
        
        int[][] A = new int[filas][columnas];
        int[][] B = new int[filas][columnas];
        
        //Se llenan ambas matrices de forma individual
        System.out.println("Llene la primera matriz(A)");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                A[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Llene la segunda matriz(B)");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                B[i][j]= scanner.nextInt();
            }
        }
        
        //Se crea e inicializa la matriz C
        int[][] C = new int[filas][columnas];
        
        //Se realiza la suma de la matriz C
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                C[i][j]= A[i][j] + B[i][j];
            }
        }
        
        System.out.println("Resultado de la suma: ");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.println(C[i][j]);
            }
        }
    }
}
