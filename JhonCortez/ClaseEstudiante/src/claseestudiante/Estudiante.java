/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseestudiante;

/**
 *
 * @author LENOVO
 */
public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    
    //Este es un metodo constructor sin parametros
//    public Estudiante(){
//        
//    }
    public Estudiante(String nombre, double nota1, double nota2){
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getNota1(){
        return nota1;
    }
    public void setNota1(double nota1){
        this.nota1  = nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }    
    
    
    
    
    
    public double promedio(){
        double prom = (nota1 + nota2)/2;
        return prom;
    }
    public void aprobo(){
        promedio();
        if (promedio()>=3) {
            System.out.println(nombre+ " Aprobo con: " + promedio());
        }else{
            System.out.println(nombre+" No aprobo con: "+promedio());
        }
    }
}
