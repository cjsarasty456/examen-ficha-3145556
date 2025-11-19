/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto7;

/**
 *
 * @author Juan Gomez
 */
public class estudiante {

    private String nombre;
    private double nota1;
    private double nota2;

    public estudiante() {
        this.nombre = "";
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double promedio() {
        return (nota1 + nota2) / 2;
    }

    public String aprobo() {
        return promedio() >= 3.0 ? "Aprobó" : "Reprobó";
    }
}
