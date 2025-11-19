/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotacion_matriz_90º;
import java.util.Scanner;
/**
 *
 * @author Niki
 */
public class Rotacion_Matriz_90º {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         //se ingresa el tamaño de la matriz
          System.out.println("Ingrese la cantidad de filas");
        int filas = sc.nextInt();
         System.out.println("Ingrese la cantidad de columanas");
        int colum = sc.nextInt();
         int [][] matriz = new int [filas][colum];
         
         // se llena la matriz
         for( int i=0;  i< filas; i++){
            for (int e = 0 ; e < colum; e++){
             System.out.println("Ingrese el numero");
             matriz[i][e] = sc.nextInt();
         
               }
         
         }
         
         
         // se rotan los elementos de la matriz
         int [][] rotada = new int[filas][colum];
         for( int i = 0; i <filas ; i++){
           for( int e=0; e < colum; e++){
            rotada[e][ filas- 1 - i] = matriz[i][e];
           }
         }
         
         // se muestra el resultado en consola
         System.out.println("Matriz rotada");
         for ( int i= 0; i < filas; i++){
             for (int e=0; e<colum; e++){
                 System.out.print(rotada[i][e]);
             }
             System.out.println();
         }

    }
}
         
     



