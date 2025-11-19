/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiante;

import java.util.*;

/**
 *
 * @author USUARIO
 */
public class Estudiante {

    // atributos privados
    private String nombre;
    private double nota1;
    private double nota2;

    // constructor sin parametros
    public Estudiante() {
        this.nombre = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    // constructor con parametros
    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    // metodo promedio
    public double promedio() {
        return (nota1 + nota2) / 2;
    }

    // metodo aprobo
    public String aprobo() {
        return promedio() >= 3.0 ? "aprobo" : "reprobo";
    
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // crear estudiante
        Estudiante est = new Estudiante();

        System.out.print("ingrese el nombre del estudiante: ");
        est.setNombre(sc.nextLine());

        System.out.print("ingrese la nota 1: ");
        est.setNota1(sc.nextDouble());

        System.out.print("ingrese la nota 2: ");
        est.setNota2(sc.nextDouble());
                    //resultados
        System.out.println("nombre: " + est.getNombre());
        System.out.println("promedio: " + est.promedio());
        System.out.println("estado: " + est.aprobo());
    }
}
