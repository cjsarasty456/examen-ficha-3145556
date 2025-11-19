/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.punto2;

import java.util.*;
import java.time.*;

/**
 *
 * @author Jonattan Rizo
 */
public class Punto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento (día mes año) de manera separada y en ese mismo orden: ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int año = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);

        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);

        System.out.println("Tu edad es: " + periodo.getYears() + " años, " + periodo.getMonths() + " meses, " + periodo.getDays() + " dias.");
    }
}
