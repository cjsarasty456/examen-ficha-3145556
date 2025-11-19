/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiantes;

/**
 *
 * @author JUSTINDANIELA
 */

// creamos la tabla estudiante en cual tiene unos atributos privados que son nombre, nota1, nota2
public class Estudiantes {
    
    private String nombre;
    private double nota1;
    private double nota2;
     
    

    public Estudiantes(String nombre, double nota1,double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;  
    }
    
    
    public Estudiantes() {
        this.nombre = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }


    public String getNombre() {
        return nombre;
    }

     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public double getNota1() {
        return nota1;
    }

    public void setnota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public void setnota2(double nota2){
        this.nota2 = nota2;
    }
   
    public  double promedio(){
        return (nota1 + nota2)/2:
    }
    
    public String aprobo(){
        if (promedio()>=3.0){
            return "Aprobo";
        }else {
            return "perdio";
        }
    }
   
    public static void main(String[] args) {
        
        Estudiantes estudiante1 = new Estudiantes ("Juan", 4.0, 2.5);

        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Promedio: " + estudiante1.promedio());
        System.out.println("Estado: " + estudiante1.aprobo());
    }
}

