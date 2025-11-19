/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

/**
 *
 * @author SoporteSENA
 */
public class RotarMatriz {
    public static int[][] rotar90(int[][] m) {
        int n = m.length;
        int[][] resultado = new int[n][n];

        // La columna se vuelve fila
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[j][n - 1 - i] = m[i][j];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
/*la rotamos 90 grados*/
        int[][] r = rotar90(m);

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
