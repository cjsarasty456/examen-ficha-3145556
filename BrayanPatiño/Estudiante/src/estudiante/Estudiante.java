/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

/**
 *
 * @author Aprendiz
 */
public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    
   
    public Estudiante(String nombre, double nota1, double nota2){
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        
    }
    public Estudiante(){
        nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String setNombre(){
        return "";
    }
    
   
    
    public double promedio(){
        return  (nota1 + nota2) / 2;
    }
    

public String aprobo(){
    if(promedio() >=3.0){
        return "Aprobó";
    }else{
        return "Reprobó";
    }
    
}
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Estudiante est = new Estudiante("Brayan",4,4);
        est.promedio();
        est.aprobo();
        System.out.println("El estudiante: " + est.nombre + " tiene un promedio de " + est.promedio() + " y su evaluacion final es de " + est.aprobo());
    }
    
}
