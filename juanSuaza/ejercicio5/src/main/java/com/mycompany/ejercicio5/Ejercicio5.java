/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;
import java.util.*;
/**
 *
 * @author Asus
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matriz.length;
        
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[n - j - 1][i];
                matriz[n - j - 1][i] = matriz[n - i - 1][n - j - 1];
                matriz[n - i - 1][n - j - 1] = matriz[j][n - i - 1];
                matriz[j][n - i - 1] = temp;
            }
        }
        
        for (int[] fet : matriz) {
            System.out.println(Arrays.toString(fet));
        }
    }


}
