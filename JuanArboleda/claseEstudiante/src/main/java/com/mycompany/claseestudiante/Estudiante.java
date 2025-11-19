/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseestudiante;

/**
 *
 * @author Arvol
 */
public class Estudiante { //parametros basicos solicitados por el ejercicio
    private static String nombre;
    private static double nota1;
    private static double nota2;
    public static double promedio;
    
    public Estudiante(String name, double n1, double n2){ //constructor con parametros
        this.nombre=name;
        this.nota1=n1;
        this.nota2=n2;
    }
    
    public Estudiante(){            //constructor sin parametros
    }
    
    public static double promedio(){    //metodo que calcula el metodo del estudiante
        double nPromedio;
        nPromedio = (nota1+nota2)/2;
        
        return nPromedio;
    }
    
    public static String aprobo(double promedio){ //metodo que verifica si el estudiante aprobo
        String msj;
        if(promedio >=3.0){
            msj="aprobo!";
            return msj;
        } else{
            msj="no aprobo";
            return msj;
        }
    }
    
    public static String getN(){ //getter del nombre
        return nombre;
    }

    public static void setN(String name){ //setter del nombre
        nombre=name;
    }
    
    public static double getGrad1(){    //getter nota uno
        return nota1;
    }
    
    public static void setGrad1(double n){  //setter nota uno
        nota1=n;
    }
    
    public static double getGrad2(){    //getter nota dos
        return nota2;
    }
    
    public static void setGrad2(double n){ //setter nota dos
        nota2=n;
    }
}