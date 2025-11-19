/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ejercicioocho.models;

/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class Estudiante {

    // Atributos privados de la clase estudiante
    private String nombre;
    private double nota1;
    private double nota2;
    
    //Constructor sin parametros (te extraño JPA)
    public Estudiante(){
        this.nombre = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }
    
    //Constructor con parametros
    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    //getters y setters

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
    
    //metodo para calcular el promedio
    public double CalcularProm(){
        return (nota1+nota2)/2;
    }
    
    //metodo para saber si aprobo o reprobo 
    //aprueba si el promedio calculado es mayor o igual a 3, en caso de que no, reprueba
    public String aprobo(){
        if (CalcularProm() >= 3){
            return "aprobo";
        }else{
            return "reprobo";
        }
    }
}
