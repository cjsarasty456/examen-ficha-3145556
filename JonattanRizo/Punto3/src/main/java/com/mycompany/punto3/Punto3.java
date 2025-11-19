/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto3;

import java.util.Scanner;

/**
 *
 * @author Jonattan Rizo
 */
public class Punto3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese los grados en Celsius :");
        int Celsius = scanner.nextInt();
        
        int Fahrenheit = (Celsius * 9/5) + 32;
        
        System.out.println("Los Celsius pasados a Fahrenheit son: " + Fahrenheit);
    }
}
