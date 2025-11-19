/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto7;

/**
 *
 * @author Juan Gomez
 */
import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = sc.nextDouble();

        // Crear el estudiante con los datos ingresados
        estudiante est = new estudiante(nombre, nota1, nota2);

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Nombre: " + est.getNombre());
        System.out.println("Promedio: " + est.promedio());
        System.out.println("Resultado: " + est.aprobo());

        sc.close();
    }
}
