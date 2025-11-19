/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author DIEGO
 */
public class ConversorCelsiusAFarenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en grados Celsius:");
        int temperaturaCelsius = sc.nextInt();
        // Pedimos que el usuario ingrese la temperatura en grados Celsius.
        
        double temperaturaFarenheit = (double) temperaturaCelsius * 9 / 5 + 32;
        // Se realiza la conversión de grados Celsius a grados Farenheit.
        
        System.out.println("La temperatura ingresada es: "+temperaturaCelsius+ "°C");
        System.out.println("La temperatura en grados Farenheit es: "+temperaturaFarenheit);
    }
}
