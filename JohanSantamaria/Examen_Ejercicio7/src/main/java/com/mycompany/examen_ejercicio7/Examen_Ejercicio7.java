/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_ejercicio7;

/**
 *
 * @author Smith
 */
public class Examen_Ejercicio7 {

    public static void main(String[] args) {

        // Crear un estudiante usando el constructor con parámetros
        Estudiante est = new Estudiante("Juan", 4.5, 3.8);

        // Imprimir promedio y si aprobó
        System.out.println("Nombre: " + est.getNombre());
        System.out.println("Promedio: " + est.promedio());
        System.out.println("Resultado: " + est.aprobo());
    }

    public static class Estudiante {

        // Atributos privados
        private String nombre;
        private double nota1;
        private double nota2;

        // Constructor sin parámetros
        public Estudiante() {
            this.nombre = "";
            this.nota1 = 0;
            this.nota2 = 0;
        }

        // Constructor con parámetros
        public Estudiante(String nombre, double nota1, double nota2) {
            this.nombre = nombre;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        // Getters y Setters
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

        // Método promedio
        public double promedio() {
            return (nota1 + nota2) / 2;
        }

        // Método aprobo
        public String aprobo() {
            if (promedio() >= 3.0) {
                return "Aprobó";
            } else {
                return "Reprobó";
            }
        }
    }
}
