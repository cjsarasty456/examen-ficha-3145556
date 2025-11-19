/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cumpleanos;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *
 * @author thiag
 */

public class Cumpleanos {
    
    public static void main(String[] args) {
        Scanner fecha = new Scanner(System.in);
        //Se crea el scanner para que el usuario pueda interactuar con el sistema 
        System.out.println("Ingresa el dia de nacimiento: ");
        int dia = fecha.nextInt();

        System.out.println("Ingresa el mes de nacimiento: ");
        int mes = fecha.nextInt();

        System.out.println("Ingresa el ano de nacimiento: ");
        int ano = fecha.nextInt();
        //El usuariio pone las fechas de su nacimiento y se guardan en su respectivas variables 
        
        LocalDate fechaNacimiento = LocalDate.of(ano, mes, dia);
        //Aca se usa la libreria que importamos que nos da la fecha local ( creo que la del equipo que estamos trabajando) 
        
        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(fechaNacimiento, hoy);
        //Aqui se usa la otra libreria para ver la edad exacta 
        System.out.println("Tu edad es:");
        System.out.println(edad.getYears() + " anos " + edad.getMonths() + " meses y " + edad.getDays() + " dias.");
    }   //Imprimimos resultados
    
}
