/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.ejercicio7;

/**
 *
 * @author DIEGO
 */
public class EstudianteMain {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Andrés Gutiérrez", 3.5, 2.8);
        // El estudiante fue creado.
        
        System.out.println("El promedio del estudiante es: "+estudiante1.promedio());
        // Mostramos el promedio del estudiante.
        
        System.out.println(estudiante1.aprobo());
        // Llamamos el método aprobo() para verificar si el estudiante aprobó o reprobó.
    }
}
