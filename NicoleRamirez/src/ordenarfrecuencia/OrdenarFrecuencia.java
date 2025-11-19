/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenarfrecuencia;

import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class OrdenarFrecuencia {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         // se obtiene el tamaño de la matriz
         System.out.println("Ingrese la cantidad de numeros");
         int num = sc.nextInt();
          int [] array = new int[num];
          
          
          // se llena el arreglo
         for( int i =0; i < num; i++){
             System.out.println("Ingrese el numero ");
             array[i]= sc.nextInt();
         }
         
         
         // se crea un arreglo para las frecuancias
         int[] frecuencia = new int[num];
         for (int i = 0; i < num ; i++) {
            int contador = 0;
            for (int e = 0; e < num; e++) {
                if (array[i] == array[e]) {
                    contador++;
                }
            }
            frecuencia[i] = contador;
        }    
         
         // se ordenan los numeros de acuerdo a su frecuencia
          for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num ; j++) {
                
                if (frecuencia[i] < frecuencia[j] || 
                 (frecuencia[i] == frecuencia[j] && array[i] > array[j])) {

                    int numeroTempo = array[i];
                    array[i] = array[j];
                    array[j] = numeroTempo;


                    int frequenciaTempo = frecuencia[i];
                    frecuencia[i] = frecuencia[j];
                    frecuencia[j] = frequenciaTempo;
                }
            }
        }
         
          
          // se muestran los numeros en orden de frecuencia
         System.out.println("Resultado ordenado:");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
          
        
         
     
     }
    
}
}