/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

/**
 *
 * @author Niki
 */
public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;

    //Constructor sin parametros
    public Estudiante(){
     this.nombre = "Victoria";
     this.nota1 = 3.4;
     this.nota2= 4.5;
    
    }
    
    //constructor con parametros
    public  Estudiante(String nombre, double nota1, double nota2){
    this.nombre= nombre;
    this.nota1= nota1;
    this.nota2 = nota2;
    }
     //metodos
    public double promedio(){
        double promedio = (nota1 + nota2)/2;
        return promedio;
    }
    
    public String aprobo(){
        if( promedio() > 3.0){
            return "Aprobo";
        }else{
          return "Reprobo";
        }
        
        
        
    }
    // en esta sesccion se instancian las clases  y crea el objeto estudiante
    public static void main(String[] args) {
             /* se muestra salida de datos en consola tomando 
           en cuenta los datos del constructor con parametros*/
           Estudiante estu1 = new Estudiante("nicole", 2.4, 1.5);
           System.out.println("El estudiante: " + estu1.aprobo());
           System.out.println("Su promedio fue de: " + estu1.promedio());
           
           /* se muestra salida de datos en consola tomando 
           en cuenta los datos del constructor sin parametros*/
           Estudiante estu2 = new Estudiante();
           System.out.println("El estudiante: " + estu2.aprobo());
           System.out.println("Su promedio fue de: " + estu2.promedio());
           
    }
    
    
    
    
    
    
}
    
    

