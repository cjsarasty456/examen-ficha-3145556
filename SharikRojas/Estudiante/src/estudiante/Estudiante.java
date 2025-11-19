/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;
/**
 *
 * @author user
 */
public class Estudiante {  
    public static void main(String []args){
    Estudiante estudiante1 = new Estudiante("Sharik", 10, 10); 
    
    System.out.println(estudiante1);
    
    estudiante1.aprobo();        
    }
        
    private String nombre;
    private double nota1;
    private double nota2;
    private double prom;
    
    public Estudiante(String nombre, double nota1, double nota2 ){
    
    this.nombre=nombre;
    this.nota1=nota1;
    this.nota2=nota2;
    
    }
    
    public void getnombre(String nombre){}
    public void setnombre(){};
  
    public void getnota1(double nota1){}
    public void setnota1(){};
    
    public void getnota2(double nota2){}
    public void setnota2(){}
    
    // metodo para calcular el promedio de las notas
    public double Promedio(){
    prom=(nota1+nota2)/2;
    return prom;
    }
    
    // metodo para saber si el estudiante aprobo o no aprobo segun el promedio
    public void aprobo(){
        if (prom <= 3)
            System.out.println(" Aprobo ");
        else 
            System.out.println("Desaprobo");  
    }
    }
    

