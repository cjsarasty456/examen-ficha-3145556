/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotarmatriz;

/**
 *
 * @author Aprendiz
 */
public class RotarMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
            {1 , 2, 3},
            {4 , 5, 6},
            {7 , 8, 9}
        };

        int[][] rotada = rotar90(matriz);

        for (int i = 0; i < rotada.length; i++) {
            for (int j = 0; j < rotada[0].length; j++) {
                System.out.print(rotada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotar90(int[][] m) {
        int n = m.length;
        int[][] r = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[j][n - 1 - i] = m[i][j];
            }
        }

        return r;
    }
}
