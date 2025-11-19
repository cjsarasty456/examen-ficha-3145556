/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumam;

/**
 *
 * @author USUARIO
 */
public class SumaM {
    public static void main(String[] args) {

        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] C = new int[2][2];

        C[0][0] = A[0][0] + B[0][0];
        C[0][1] = A[0][1] + B[0][1]; //aqui estoy haciendo las operaciones
        C[1][0] = A[1][0] + B[1][0];
        C[1][1] = A[1][1] + B[1][1];

        System.out.println(C[0][0] + " " + C[0][1]);
        System.out.println(C[1][0] + " " + C[1][1]);
    }
}

