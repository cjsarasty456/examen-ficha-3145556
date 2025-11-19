/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotres;

import java.util.Scanner;
/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class EjercicioTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Convertir de Celcious a Farenheit\n");
        
        //Ingresar temperatura en Celcious
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Calcular temperatura en Fahrenheit
        // Fórmula: F = C × 9/5 + 32
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        
        System.out.println(celsius + " grados Celcious = " + fahrenheit + " grados Farenheit");

        scanner.close();
    }
}
