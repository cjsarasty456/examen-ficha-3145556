/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Niki
 */

/**
 *
 * @author Niki
 */
public class Calculadora {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //se pide al usuario su fecha de nacimiento
    System.out.println("Ingrese el dia de su cumpleanos");
    byte dia= sc.nextByte();
    
    System.out.println("Ingrese el numero de su mes de su nacimiento");
    byte mes= sc.nextByte();
    
    System.out.println("Ingrese el año de su nacimiento");
    int year= sc.nextInt();
    
    //  se obtiene la fecha del usuario y la fecha actual
    LocalDate fechaNacimiento = LocalDate.of(year, mes, dia);
    LocalDate fechahoy = LocalDate.now();
    
    // se calcula la edad exacta
    Period edad= Period.between(fechaNacimiento, fechahoy);
    
    //sale el resultado esperado
    System.out.println(" tu edad exacta es: "+ 
            edad.getDays()+ " Dias " +
            edad.getMonths()+" meses "+
            edad.getYears()+ " years");
    
    }
    
}

