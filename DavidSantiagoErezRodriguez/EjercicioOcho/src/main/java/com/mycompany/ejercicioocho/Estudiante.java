/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioocho;

/**
 *
 * @author nox
 */
public class Estudiante {
    private String nombre;
    private Double notal;
    private Double nota2;
    
public Estudiante(){}


public void setNombre(String nombre){
    this.nombre = nombre;
}
public String getNombre(){
    return nombre;
}
public void setNotal(Double notal){
    this.notal = notal;
}
public Double getNotal(){
    return notal;
}
public void setNotaDos(Double nota2){
    this.nota2 = nota2;
}
public Double getNotaDos(){
    return nota2;
}
public Double promedio(){
Double prom;
prom = (notal + nota2) / 2;
return prom;
}
public void aprobo(){
if(promedio() >= 3.0){
    System.out.println("aprobo");
}else{
    System.out.println("reprobo");
}
}
}