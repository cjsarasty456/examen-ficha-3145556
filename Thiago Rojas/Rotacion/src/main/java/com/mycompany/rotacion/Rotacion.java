/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rotacion;

/**
 *
 * @author thiag
 */
public class Rotacion {

    public static void main(String[] args) {

        int[][] m = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //Definimos neustras matrices NxN
        
        int n = m.length;
        int[][] r = new int[n][n]; // aqui definimos donde vamos aguardar la matriz rotada

        // Creamos este for para rotar la matriz que recorre hasta la longitud de la matriz m que fue la que se ingreso primero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[i][j] = m[n - j - 1][i];
            }
        }

        // aqui creamos este for para mostrar nuestra matriz ya rotada 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}

