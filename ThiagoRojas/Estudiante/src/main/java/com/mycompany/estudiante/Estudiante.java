/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiante;

/**
 *
 * @author thiag
 */
public class Estudiante {
    private String name;
    private double nota1; //Definimos nuestros atributos como privados
    private double nota2;
    
    public Estudiante(){
        this.name = "";
        this.nota1 = 0; //Creamos el constructor sin parametros
        this.nota2 = 0;
    }
    public Estudiante(String name, double nota1, double nota2){
        this.name = name;
        this.nota1 = nota1; //Cramos el constructor con parametros
        this.nota2 = nota2;
        }
    
    public String GetName(){
        return this.name;
    }
    
    public String SetName(){
        return name;
    }
    public double GetNota1(){
        return this.nota1;
    }
    
    public double SetNota1(){
        return nota1;
    }
    public double GetNota2(){
        return this.nota2;
    }
    
    public double SetNota2(){
        return nota2;
    }
    
    //Hacemos metodos getters y setters de nuestra clase
    
    
    
    double promedio = 0;
    
    public void Promedio(){
        promedio = (nota1 + nota2) / 2;
       System.out.println("el promedio es " + promedio);

    }
    //Aqui creamos estos metodos que necesitamos para definir el promedio y si aprueban o no aprueban
    
    public void Aprobo(){
        if(promedio >= 3.0){
        System.out.println("Aprobo ");
    }else
            System.out.println("No aprobo");
        
    }
    
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Thiago", 2.0, 2.0);
        estudiante.Promedio();
        estudiante.Aprobo();
         
        //Creamos nuestra isntancia y llamamos los metodos 
    }
}
