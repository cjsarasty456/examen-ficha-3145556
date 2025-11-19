/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto5;

/**
 *
 * @author Juan Gomez
 */
public class Punto5 {

    public static void main(String[] args) {

        int[][] m = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] r = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                r[j][2 - i] = m[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
