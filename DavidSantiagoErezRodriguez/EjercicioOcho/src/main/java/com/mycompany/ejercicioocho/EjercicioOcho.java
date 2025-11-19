/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioocho;

/**
 *
 * @author nox
 */
public class EjercicioOcho {

    public static void main(String[] args) {
        Estudiante carlos = new Estudiante();
        carlos.setNombre("carlos");
        carlos.setNotal(2.5);
        carlos.setNotaDos(3.0);
        System.out.println(carlos.getNombre()+":");
        System.out.println("con un promedio de : "+carlos.promedio());

        carlos.aprobo();

    }
}
