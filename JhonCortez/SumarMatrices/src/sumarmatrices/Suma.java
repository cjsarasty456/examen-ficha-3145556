/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumarmatrices;

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;
public class Suma {
    int fila = 2;
    int columna = 2;
    
    int[][] matriz1 = {{1,3},
                       {2,5}};
    int[][] matriz2 = {{4,2},
                       {6,1}};
    int[][] matriz3 = new int[fila][columna];
    
    public void sumaM(){
        //Recorrer las filas
        for (int i = 0; i < fila; i++) {
            //Recorrer las columnas
            for (int j = 0; j < columna; j++) {
                //Suma de la matriz
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
            System.out.println(Arrays.toString(matriz3[j]));
            }
        }
    }
}
