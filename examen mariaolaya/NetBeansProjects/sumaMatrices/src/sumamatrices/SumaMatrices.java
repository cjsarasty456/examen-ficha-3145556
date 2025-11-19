/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumamatrices;

/**
 *
 * @author Aprendiz
 */
public class SumaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
/* public class Main {*/ 
        /*    public static void main(String[] args) {*/   
      
        int[][] A = {
            {7,3},
            {9,4}
        };

        int[][] B = {
            {5,6},
            {6,2}
        };

        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Resultado:");
        for (int[] fila : C) {
            for (int n : fila) System.out.print(n + " ");
            System.out.println();
        }
    }
}
