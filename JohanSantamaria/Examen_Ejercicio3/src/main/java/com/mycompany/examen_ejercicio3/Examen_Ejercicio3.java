/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Smith
 */
public class Examen_Ejercicio3 {
/*
Conversion de grados Celsius a Fahrenheit
Formula: F = C x(9/5)+32
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en Celcius");
        int Celcius = scanner.nextInt();
        
        int Fahrenheit = (Celcius * (9/5))+32;
        
        System.out.println("La temperatura "+Celcius+" en Celcius es equivalente a "+Fahrenheit+" en grados Fahrenheit");
    }
}
