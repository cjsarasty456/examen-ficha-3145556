/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotarmatriz;

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;
import java.util.Scanner;
public class Matriz {
    Scanner entrada = new Scanner(System.in);
    public void resivirMatriz(){
        System.out.println("Escribe de cuanto quieres tu matriz (N*N)");
        int dimension = entrada.nextInt();
        int[][] matriz = new int[dimension][dimension];
        int [][] matriz2 = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.println("Digite los numeros que quiere en su matriz:");
                matriz[j][i] = entrada.nextInt();
                
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.println(Arrays.toString(matriz[j]));
            }
        }
        System.out.println("La matriz rotada 90°");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz2[i][j] = matriz[i][j];
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.println(":c");
                //Lo intente
            }
        }
    }
}
