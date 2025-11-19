/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

/**
 *
 * @author juani
 */
public class Estudiante {

    // Atributos privados
    private String nombre;
    private double nota1;
    private double nota2;

    // Constructor sin parametros
    public Estudiante() {
        this.nombre = "";
        this.nota1 = 0;
        this.nota2 = 0;
    }

    // Constructor con parametros
    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    // Metodo que calcula el promedio
    public double promedio() {
        return (nota1 + nota2) / 2;
    }

    // Metodo que indica si aprobo
    public String aprobo() {
        if (promedio() >= 3.0) {
            return "Aprobo";
        } 
        return "Reprobo";
        
    }
    
    public static void main(String[] args) {
        // Crear estudiante usando el constructor con parametros
        Estudiante e = new Estudiante("Esteban", 4, 2.5);

        // Mostrar datos
        System.out.println("Estudiante: " + e.getNombre());
        System.out.println("Promedio: " + e.promedio());
        System.out.println("Resultado: " + e.aprobo());
    }
}


