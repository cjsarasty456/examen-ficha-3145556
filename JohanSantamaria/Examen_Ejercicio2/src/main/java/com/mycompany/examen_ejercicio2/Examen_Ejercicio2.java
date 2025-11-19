/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ejercicio2;import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *
 * @author Smith
 */
public class Examen_Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate fechaHoy = LocalDate.now();
        
        // El usuario ingresa los datos de su fecha de cumpleaños
        System.out.println("Ingrese su año de nacimiento:");
        int anno = scanner.nextInt();         
        System.out.println("Ingrese su mes de nacimiento:");
        int mes = scanner.nextInt();        
        System.out.println("Ingrese su dia de nacimiento:");
        int dia = scanner.nextInt();
        
        //Se usan las librerias importadas
        LocalDate Birthday = LocalDate.of(anno, mes, dia);
        Period edadHoy = Period.between(Birthday, fechaHoy);
        
        System.out.println("La edad de esta persona es: "+edadHoy.getYears()+" años, "+edadHoy.getMonths()+" meses y "+edadHoy.getDays()+" días.");
    }
    
}