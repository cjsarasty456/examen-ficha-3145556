/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioocho;

import com.mycompany.ejercicioocho.models.Estudiante;

/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class EjercicioOcho {

    public static void main(String[] args) {
        // Crear instancia del estudiante (ejemplo)
        Estudiante estudiante1 = new Estudiante("Cristofer David Lozano Contreras", 4.5, 5);

        // Mostrar información del estudiante en consola
        System.out.println("Estudiante creado:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Nota 1: " + estudiante1.getNota1());
        System.out.println("Nota 2: " + estudiante1.getNota2());
        System.out.println("Promedio: " + String.format("%.2f", estudiante1.CalcularProm()));
        System.out.println("Estado: " + estudiante1.aprobo());

    }
}
