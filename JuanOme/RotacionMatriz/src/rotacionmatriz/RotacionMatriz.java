/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotacionmatriz;

/**
 *
 * @author juani
 */
public class RotacionMatriz {
    public static int[][] rotar90Derecha(int[][] matriz) {
        int n = matriz.length;
        int[][] rotada = new int[n][n];
        
        //rotacion de los datos de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotada[j][n - 1 - i] = matriz[i][j];
            }
        }

        return rotada;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] rotada = rotar90Derecha(matriz);

        for (int[] fila : rotada) {
            for (int x : fila) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

}
