/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio02;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" ponga su fecha de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("ponga su mes de nacimiento: ");
        int mes = sc.nextInt();

        System.out.print("ponga su año de nacimiento: ");
        int año = sc.nextInt();

        
        LocalDate hoy = LocalDate.now();

        
        LocalDate nacimiento = LocalDate.of(año, mes, dia);

        
        if (nacimiento.isAfter(hoy)) {
            System.out.println("La fecha no puede ser mayor a la actual.");
            return;
        }

        Period edad = Period.between(nacimiento, hoy);

        System.out.println("edad que tiene");
        System.out.println("Años: " + edad.getYears());
        System.out.println("Meses: " + edad.getMonths());
        System.out.println("Días: " + edad.getDays());
    }
}
 



 
