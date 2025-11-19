/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseestudiante;

/**
 *
 * @author Aprendiz
 */
public class Estudiantes{ 
    private String nombre;
    private Double nota1;
    private Double nota2;
    public double SumNotas;
    

    
    public void Estudiantes() {
        
    }

    
    public Estudiantes(String nombre, Double nota1, Double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1; 
        this.nota2 = nota2;
    }

    
    public String getNombre() {
        return this.nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getDota1() {
        return nota1;
    }

    public void setDota1(Double dota1) {
        this.nota1 = dota1;
    }

    public Double getDota2() {
        return nota2;
    }

    public void setDota2(Double dota2) {
        this.nota2 = dota2;
    }
    
    public void promedio(double nota1 , double nota2){
       
        SumNotas = (nota1 + nota2)/2;
                  
    } 
    
    public void  aprobo(){
        
        if(SumNotas>=3.0){
        System.out.println("el estudiante ha aprobadosu promedio es :"+SumNotas+"" );
        }else{
         System.out.println("el estudiante no ha aprobado");
        }
        
    }

 
    
}




