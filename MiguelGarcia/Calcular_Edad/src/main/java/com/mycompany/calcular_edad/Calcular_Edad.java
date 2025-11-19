/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcular_edad;

/**
 *
 * @author USUARIO
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calcular_Edad {

    public static void main(String[] args) {

        // Instanciamos un objet de scaner para por tomar los datos ingresados por el ususario
        Scanner sc = new Scanner(System.in);

        // Le pedimos el día de nacimiento
        System.out.print("Digite el dia de nacimiento: ");
        int dia = sc.nextInt();

        // Le pedimos el mes de nacimiento
        System.out.print("Digite el mes de nacimiento: ");
        int mes = sc.nextInt();

        // y por ultimo el año de nacimiento
        System.out.print("Digit el ano de nacimiento: ");
        int anio = sc.nextInt();

        try {
            // Crear un objeto LocalDate con la fecha ingresada
            // Si la fecha es invalida, LocalDate mostrara una excepción
            LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

            // tenemos la fecha actual 
            LocalDate hoy = LocalDate.now();

            // Validamos que la fecha ingresada no sea posterior a la actual
            if (fechaNacimiento.isAfter(hoy)) {
                System.out.println("La fecha de nacimiento no puede ser futura.");
            } else {

                // Calculamos la diferencia entre fechas 
                Period edad = Period.between(fechaNacimiento, hoy);

                // mostramos la edad
                System.out.println("Su edad actual es:");
                System.out.println(edad.getYears() + " anos, "
                        + edad.getMonths() + " meses, "
                        + edad.getDays() + " dias.");
            }

       } catch (Exception e) {
            // Si la fecha no valida
            System.out.println("La fecha ingresada no es valida.");
        }

        sc.close(); 
    }
}

