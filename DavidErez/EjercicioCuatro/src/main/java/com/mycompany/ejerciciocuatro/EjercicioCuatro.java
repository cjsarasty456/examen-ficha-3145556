/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocuatro;

import java.util.Arrays;

/**
 *
 * @author nox
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
     
     int[] arreglo = {4,4,1,2,2,2,3};
     // en este egerccio decidi aplicar un metodo de ordenamiento que trae java
     Arrays.sort(arreglo);
     // aca imprimo el arreglo utilizando tambien un metodo integrado de java
     System.out.println("el arreglo ordenado por frecuencia es el siguiente: "+Arrays.toString(arreglo));
     System.out.println("-----------------------------------------------");
     // sin embargo aca dejo otro metodo para imprimir el arreglo utilizando un for each
     for(int num : arreglo){
        System.out.print(num);

     }   
    }
}
