/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Asus
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("mete tu fecha de nacimiento (dia/mes/anio): ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        
        Period edad = Period.between(fechaNacimiento, fechaActual);
        
        System.out.println("Edad: " + edad.getYears() + " anios, " + edad.getMonths() + " meses, " + edad.getDays() + " dias.");
    }
}

