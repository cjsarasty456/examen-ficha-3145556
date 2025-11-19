/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.punto8;

/**
 *
 * @author Jonattan Rizo
 */

class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    
    // Constructor creado sin los parametros
    public Estudiante() {
        this.nombre = "Desconocido";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    // Constructor creado con los parámetros
    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Getters y Setters para los atributos creados
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

    public double promedio() {
        return (nota1 + nota2) / 2;
    }

    public String aprobo() {
        if (promedio() >= 3.0) {
            return "Aprobó";
        } else {
            return "Reprobó";
        }
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Jonattan Rizo", 2.5, 3.5);

        System.out.println("Promedio de " + estudiante.getNombre() + ": " + estudiante.promedio());
        System.out.println(estudiante.aprobo());
    }
}

