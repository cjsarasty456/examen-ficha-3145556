/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotacionmatriz;

/**
 *
 * @author Aprendiz
 */
public class RotacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
 /* public class Main {*/ 
        /*    public static void main(String[] args) {*/ 
        
        int[][] m = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n = m.length;
        int[][] r = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[j][n - 1 - i] = m[i][j];
            }
        }

        for (int[] fila : r) {
            for (int v : fila) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
