/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
  

        /* public class Main {*/ 
        /*    public static void main(String[] args) {*/  
        Scanner sc = new Scanner(System.in);

        System.out.print("Día: ");
        int d = sc.nextInt();
        System.out.print("Mes: ");
        int m = sc.nextInt();
        System.out.print("Año: ");
        int a = sc.nextInt();

        LocalDate nacimiento = LocalDate.of(a, m, d);
        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(nacimiento, hoy);

        System.out.println("Edad precisa nenita:");
        System.out.println(edad.getYears() + " años, " + edad.getMonths() + " meses, " + edad.getDays() + " días.");
    }
}
