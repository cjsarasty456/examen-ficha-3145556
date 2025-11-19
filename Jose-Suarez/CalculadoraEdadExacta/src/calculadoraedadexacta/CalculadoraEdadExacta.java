/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraedadexacta;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculadoraEdadExacta {

    public static void main(String[] args) {
// Pedir datos al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa el dia de nacimiento: ");
        int dia = sc.nextInt();
        
        System.out.print("Ingresa el mes de nacimiento: ");
        int mes= sc.nextInt();

        System.out.print("Ingresa el año de nacimiento: ");
        int ano = sc.nextInt();
// Crear objeto localdate con la fecha de nacimiento
        LocalDate nacimiento = LocalDate.of(ano,mes,dia);
        // Obtener fecha actual
        LocalDate hoy = LocalDate.now();
// Calcular la diferencia entre la fecha actual y la de nacimiento
        Period edad = Period.between(nacimiento,hoy);
// Mostrar resultado al usuario
        System.out.println("Tu edad exacta es: " +
                           edad.getYears() + "años, " +
                           edad.getMonths() + " meses y " +
                           edad.getDays() + " dias.");

        sc.close();
    }
}

