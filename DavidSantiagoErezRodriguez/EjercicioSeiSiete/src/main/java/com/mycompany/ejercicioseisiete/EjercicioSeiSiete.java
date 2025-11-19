/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioseisiete;

/**
 *
 * @author nox
 */
public class EjercicioSeiSiete {

    public static void main(String[] args) {
        
        // primero degino las matrices
        int [][] matrizUno = {
        {3,3,5},// se suma esta fila y la de abajo
        {1,3,5}  
    };
        int [][] matrizDos = {
            {2,3,4},// con esta fila con la de abajo es decir el resultado aca seria de = 569 
            {4,3,4}
    };
        
        // aca creo una nueva matriz resultado y le defino el tamaño
        int [][] resultado =  new int [2][3];
        

        // recorremos las filas y columnas para sumar los elementos de de cada matriz
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                resultado[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }

        // posteriormente se muestra el resultado
        System.out.println("la suma de las matrices es:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j]);
            }
            System.out.println();
        }
    }
}

   
