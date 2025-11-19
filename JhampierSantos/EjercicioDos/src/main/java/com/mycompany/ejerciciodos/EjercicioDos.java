

package com.mycompany.ejerciciodos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Pide al usuario su fecha de nacimiento (día, mes, año) y calcula su edad actual exacta (años,
 * meses y días). Estructuras: manejo de fechas, condicionales, operaciones aritméticas.
 * Autor: Jhampier Santos Ortiz
 */
public class EjercicioDos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la fecha de nacimiento
        System.out.print("Hola? Ingrese su día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese su mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese su año de nacimiento (ej 2007): ");
        int anio = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        LocalDate fechaActual = LocalDate.now();

        // Calcular la edad usando Period
        Period edad = Period.between(fechaNacimiento, fechaActual);

        System.out.println("Su edad exacta es: " 
                + edad.getYears() + " anios, "
                + edad.getMonths() + " meses y "
                + edad.getDays() + " dias");
        
        scanner.close();
    }
}
