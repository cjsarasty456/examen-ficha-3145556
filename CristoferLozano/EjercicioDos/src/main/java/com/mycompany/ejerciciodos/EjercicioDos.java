/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class EjercicioDos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tu fecha de nacimiento:");
        //Dia de nacimiento
        System.out.print("ingrese su dia de nacimiento (1-31): ");
        int dia = scanner.nextInt();
        //Mes de nacimiento
        System.out.print("ingrese su mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();
        //Año de nacimiento
        System.out.print("ingrese su año de nacimiento (ejemplo: 1979): ");
        int anio = scanner.nextInt();
        
        //Convertir a una fecha de nacimiento valida
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        
        //Obtener fecha actual del dispositivo
        LocalDate fechaActual = LocalDate.now();

        //Calcular período entre fechas para obtener el calculo final
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        
        //Mostrar edad
        System.out.println("Tienes:");
        System.out.println(periodo.getYears() + " años");
        System.out.println(periodo.getMonths() + " meses");
        System.out.println(periodo.getDays() + " dias");
    }
}
