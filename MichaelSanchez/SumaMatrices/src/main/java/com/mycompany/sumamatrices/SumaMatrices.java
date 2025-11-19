/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumamatrices;
import java.util.Arrays;
/**
 *
 * @author Aprendiz
 */
public class SumaMatrices {
    public static void main(String[] args) {
        int[][] a = {{1, 3}, {2, 5}};
        int[][] b = {{4, 2}, {6, 1}};
        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

