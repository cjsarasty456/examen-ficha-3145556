/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Ejercicio3 {

    public static void main(String[] args) {
     Scanner scns = new Scanner(System.in);
     
        System.out.println("meta un valor celsiu");
    int celsius = scns.nextInt();   
    
    int farney = celsius *9/5 + 32;
            System.out.println("el numero  Fahrenheit es;" + farney);
     scns.close();
    }
}
