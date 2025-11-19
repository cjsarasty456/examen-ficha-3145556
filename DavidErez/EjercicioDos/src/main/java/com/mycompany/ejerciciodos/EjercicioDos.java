/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author nox
 */
public class EjercicioDos {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir fecha de nacimiento
        System.out.print("ingrese el dia en que nacio ");
        int dia = sc.nextInt();

        System.out.print("Ingrese el mes en que nacio: ");
        int mes = sc.nextInt();

        System.out.print("ingrese el año año en que nacio: ");
        int anio = sc.nextInt();

        // se crea un  objeto LocalDate con la fecha de nacimiento 
        
        LocalDate fechaCompleta = LocalDate.of(anio, mes, dia);

        //creamos otro local LocalDate para que nos de un 
        LocalDate fechaActual = LocalDate.now();

        // con esto calculamos el tiempo exacto en tando a el periodo de tienpo que ha vivido la persona
        Period edad = Period.between(fechaCompleta, fechaActual);

        // se muuestra el resultado
        System.out.println("su edad exacta es: ");
        System.out.println(edad.getYears() +"años");
        System.out.println(edad.getMonths() +"meses");
        System.out.println(edad.getDays() +"dias");
}

}

