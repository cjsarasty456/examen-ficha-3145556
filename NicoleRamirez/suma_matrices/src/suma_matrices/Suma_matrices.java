/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_matrices;
import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class Suma_matrices {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // se determina el tamaño de las matrices
        System.out.println("Ingrese la cantidad de filas");
        int filas = sc.nextInt();
         System.out.println("Ingrese la cantidad de columanas");
        int colum = sc.nextInt();
        int [][] matriz1 = new int[filas][colum];
        int [][] matriz2 =new int [filas][colum];
        int [][] suma =new int [filas][colum];
        
        // se llenan las matrices
        System.out.println("LLenar la primera matriz");
        for(int i= 0; i< filas; i++){
            for(int e= 0; e< colum; e++){
                System.out.println("Ingrese el numero");
                matriz1 [i][e]  = sc.nextInt();
                
            }
        }
        
        System.out.println("Llenar la segunda matriz");
        for( int i= 0; i < filas; i++){
            for(int e=0; e<colum; e++){
              System.out.println("Ingrese el numero");
             matriz2 [i][e]  = sc.nextInt();
            }
        }
        
        // se suman las matrices
        for( int i= 0; i < filas; i++){
            for(int e=0; e<colum; e++){
             suma [i][e]  = matriz1 [i][e] +  matriz2 [i][e];
            }
        }
        
      
        // se muestra en consola el resultado de la suma de las dos matrices
       System.out.println("Matriz resultante: ");
         for ( int i= 0; i < filas; i++){
             for (int e=0; e<colum; e++){
                 System.out.print(suma[i][e]);
             }
             System.out.println();
         }
    }
    
}
