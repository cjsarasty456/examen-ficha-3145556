/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rotar;

/**
 *
 * @author USUARIO
 */
public class Rotar {
    public static int[][] rotar90(int[][] m) {
        int n = m.length;
        int[][] r = new int[n][n];

        // rotacion directa
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[j][n - 1 - i] = m[i][j];
            }
        }

        return r;
    }

    public static void main(String[] args) {

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] R = rotar90(A);

        // muestra el resultado
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R.length; j++) {
                System.out.print(R[i][j] + " ");
            }
            System.out.println();
        }
    }
}

