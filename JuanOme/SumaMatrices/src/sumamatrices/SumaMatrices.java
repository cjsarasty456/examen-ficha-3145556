/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumamatrices;

/**
 *
 * @author juani
 */
import java.util.Scanner;
public class SumaMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Definir tamaño de matricez
        System.out.println("Ingrese la cantidad de filas");
        int m=sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int n=sc.nextInt();
        
        int[][] A=new int[m][n];
        int[][] B=new int[m][n];
        int[][] C=new int[m][n];
        
        
        //Registrar matriz A
        System.out.println("Ingrese los valores del arreglo A");
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                A[i][j]=sc.nextInt(); 
            }
        }
        
        //Registrar Matriz B
        System.out.println("Ingrese los valores del arreglo B");
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                B[i][j]=sc.nextInt(); 
            }
        }
        
        //Registrar matriz C con la suma entre A y B
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                C[i][j]=A[i][j]+B[i][j]; 
            }
        }
        
        //Mostrar ordenada A
        System.out.println("A");
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(" "+A[i][j]+" "); 
            }
            System.out.println(" ");
        }
        
        
        //mostrar ordenada B
         System.out.println("B");
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(" "+B[i][j]+" "); 
            }
            System.out.println(" ");
        }
        
        //Mostrar resultado ordenado
        System.out.println("El total es");
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(" "+C[i][j]+" "); 
            }
            System.out.println(" ");
        }
    }
    
}
