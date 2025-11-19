/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.ejercicio7;

/**
 *
 * @author DIEGO
 */
public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    
    public Estudiante() {}
    // Constructor sin parámetros.
    
    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    // Constructor con parámetros.
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Método set del nombre.
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    //Método set de la nota 1.
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    //Método set de la nota 2.
    //Setter hechos.
    
    public String getNombre() {
        return nombre;
    }
    //Método get del nombre.
    public double getNota1() {
        return nota1;
    }
    //Método get de la nota 1.
    public double getNota2() {
        return nota2;
    }
    //Método get de la nota 2.
    //Getter hechos.
    
    public double promedio() {
        double promedio = (double) (nota1 + nota2) / 2;
        return promedio;
    }
    
    public String aprobo() {
        if (promedio() >= 3.0) {
            return "Aprobó";
        } else {
            return "Reprobó";
        }
    }
}
