/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author nox
 */

public class EjercicioCinco {
    public static int [][] vuelta(int[][] matriz){
        //se establece el largor de la matriz
        int largo = matriz.length;
        // aca se  declara una variable para establecer el largor de las matriz
        int [][] vuelta = new int [largo][largo];
        // por cada iteracion de estos dos for, optendremos lo s valores para dar la vuelta 
       for(int i = 0; i < largo; i++ ){
    for(int j = 0; j < largo; j++){   // ahora sí incrementa j
        vuelta[j][largo - 1 - i] = matriz[i][j];
        } 
        }

        return vuelta;
    }
// metodo para imprimir la matriz
    public static void impMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int value : fila) {
                System.out.print(value );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        
      // ingresamos los datos a la matriz
        int [][] matriz= {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        
        };
        
        int [][] result= vuelta(matriz);
        impMatriz(result);
     
    }
}
