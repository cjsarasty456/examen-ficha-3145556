/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

/**
 *
 * @author Asus
 */
public class Ejercicio8 {
private String nombre;
private int nota1;
private int nota2;
    
  Ejercicio8(String nombre,int nota1,int nota2) {
  this.nombre = nombre;
  this.nota1 = nota1;
  this.nota2 = nota2;    
  }
   public String getnombre(){
       return nombre;
   }
   
  public void setnombre(String nombre){
         this.nombre = nombre;
  }
  
  public int getnota1(){
   return nota1;  
  } 
  
  public void setnota1(int nota1){
  this.nota1 = nota1;
  }
  
  public int getnota2(){
   return nota2;  
  } 
  public void setnota2(int nota2){
   this.nota2 = nota2;
  }
  public int promedio(){
  return (nota1 + nota2) / 2;
  }
  public String aprobo(){
  return promedio() <= 30 ? "desaprobo ": "aprobo";
  }
  
  
  
    public static void main(String[] args) {
       Ejercicio8 estudiante = new Ejercicio8("juan",50,10);
        System.out.println("el promedio es "+ estudiante.promedio());
        System.out.println("aprovo o no;"+ estudiante.aprobo());
    }
}
    