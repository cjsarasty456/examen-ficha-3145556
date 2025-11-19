/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto3;

/**
 *
 * @author Juan Gomez 
 */
import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor de Celsius a Fahrenheit ===");

        // Pedir temperatura al usuario
        System.out.print("Ingresa la temperatura en °C: ");
        double celsius = sc.nextDouble();

        // Conversión
        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        // Mostrar resultado
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit + " °F");
    }
}
