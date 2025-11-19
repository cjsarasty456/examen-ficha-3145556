/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;
/**
 *
 * @author JUAN CAMILO
 */

// PUNTO 8
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    
    // atributos privados
    private String nombre;
    private double nota1;
    private double nota2;
    double suma = 0;
    double promedio = 0;
    
    // constructor sin parametros
    public Estudiante(){
    }
    
    // constructor con parametros
    public Estudiante(String nombre, double nota1, double nota2 ){
        this.nombre=nombre;
        this.nota1= nota1;
        this.nota2 = nota2;
    }
 
    // metodos Getter y Setter
     public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombres){
        nombre = nombres;
    }
    
    public double getNota1(){
        return nota1;
    }
    public void setNota1(double notas1){
        nota1 = notas1;
    }
    
    public double getNota2(){
        return nota2;
    }
    public void setNota2(double notas2){
        nota2 = notas2;
    }
    
    // metodo para calcular el promedio que tiene
    public double calcularPromedio() {
        suma = nota1+nota2;
        promedio = suma / 2;
        
        return promedio;
        }
       
    // metodo para calcular si aprobo o no
    public boolean aprobo() {
        return calcularPromedio() >= 3.0;  
    }
       
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // instancia
       Estudiante e1 = new Estudiante("camilo", 4, 3);
       
       // prueba
        System.out.println("el estudiante "+ e1.nombre +" tiene como promedio "+ e1.calcularPromedio());
        
     if (e1.aprobo()){
         System.out.println("muy bien aprobo");
     }
     else{
         System.out.println("que mal, desaprobo");
     }
    }

 
}
    
    
