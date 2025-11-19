/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.ejercicio2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author DIEGO
 */
public class EdadExacta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su año de nacimiento:");
        int año = sc.nextInt();
        // La línea anterior lee el año de nacimiento.
        
        System.out.println("Ingrese su mes de nacimiento (01-12):");
        int mes = sc.nextInt();
        // La línea anterior lee el mes de nacimiento.
        
        System.out.println("Ingrese su dia de nacimiento:");
        int dia = sc.nextInt();
        // La línea anterior lee el dia de nacimiento.
        
        LocalDate fechaActual = LocalDate.now();
        // Con esta línea obtenemos la fecha actual.
        
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        // Con esta linea y el uso de la libreria, convertimos los datos pedidos a una fecha.
        
        Period edadExacta = Period.between(fechaNacimiento, fechaActual);
        // Con esta función exigimos que se mida el periodo de tiempo entre las 2 fechas.
        
        System.out.println("La edad exacta de la persona es: "+edadExacta.getYears()+" años, "+edadExacta.getMonths()+" meses y "+edadExacta.getDays()+" días!");
    }
}
