/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto2;

/**
 *
 * @author Juan Gomez
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora de Edad Exacta ===");

        // Pedir fecha de nacimiento
        System.out.print("Ingresa tu dia de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Ingresa tu mes de nacimiento (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Ingresa tu año de nacimiento: ");
        int anio = sc.nextInt();

        // Crear fecha de nacimiento
        LocalDate fechaNacimiento;
        try {
            fechaNacimiento = LocalDate.of(anio, mes, dia);
        } catch (Exception e) {
            System.out.println("Fecha inválida. Verifica los datos.");
            return;
        }

        LocalDate hoy = LocalDate.now();

        // Verificar si la fecha es posterior al día actual
        if (fechaNacimiento.isAfter(hoy)) {
            System.out.println("La fecha de nacimiento no puede ser futura.");
            return;
        }

        // Calcular edad exacta
        Period edad = Period.between(fechaNacimiento, hoy);

        // Mostrar resultados
        System.out.println("\nTu edad exacta es:");
        System.out.println(edad.getYears() + " años");
        System.out.println(edad.getMonths() + " meses");
        System.out.println(edad.getDays() + " dias");
    }
}
