/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Estudiante {
    // Atributos
    private String nombre;
    private double nota1;
    private double nota2;
    
    // Constructor
    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    // Metodos get
    public String getNombre() {
        return this.nombre;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    // Metodos set
    public String setNombre(String nombre) {
        return this.nombre;
    }
    
    public double setNota1(double nota1) {
        return this.nota1;
    }
    
    public double setNota2(double nota2) {
        return this.nota2;
    }
    
    // Metodo que retorna el promedio
    public double promedio(double promedio) {
        return promedio;
    }
    
    // Metodo que retorna si el estudiante aprueba o no
    public String aprobo(double promedio) {
        if (promedio >= 3.0) {
            return "Aprobo";
        } else {
            return "Reprobo";
        }
    }
    
    public static void main(String[] args) {
        // Se crea el estudiante
        Estudiante e1 = new Estudiante("Juan", 3.4, 4.5);
        
        // Se calcula el promedio de las notas
        double promedio = (3.4 + 4.5) / 2;
        
        // Se imprime el resultado.
        System.out.println("Promedio: " + e1.promedio(promedio));
        System.out.println(e1.aprobo(promedio));
    }
}
