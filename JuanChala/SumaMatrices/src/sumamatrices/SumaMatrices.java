/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumamatrices;

/**
 *
 * @author CHALA RAMIREZ
 */
public class SumaMatrices {
    public static void main(String[] args) {
        // Matriz #1 2x2
        int[][] matriz1 = {
            {1, 2},
            {3, 4}
        };

        // Matriz #2 2x2
        int[][] matriz2 = {
            {5, 6},
            {7, 8}
        };

        // Matriz donde se almacenara la suma de las otras matrices
        int[][] suma = new int[2][2];

        // Ciclo for para recorrer las filas de la matriz de suma
        for (int i = 0; i < 2; i++) {
            // Ciclo for para recorrer las columnas de la matriz suma
            for (int j = 0; j < 2; j++) {
                // Suma de las matrices 1 y 2
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Resultado de la suma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // Imprimir el resultado de la suma
                System.out.println(matriz1[i][j] + " + " + matriz2[i][j] + " = " + suma[i][j]);
            }
            System.out.println();
        }
    }
}
