/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

public class Estudiante {

    private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante() {}

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double promedio() {
        return (nota1 + nota2) / 2;
    }

    public String aprobo() {
        return promedio() >= 3.0 ? "Aprobó" : "Reprobó";
    }

    @Override
    public String toString() {
        return "Estudiante{ nombre='" + nombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", promedio=" + promedio() +
                ", estado=" + aprobo() +
                " }";
    }
}



public class Estudiante {
    // ... código de la clase Estudiante ...
}

class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Mariangel", 5.0, 1.5);
        System.out.println(e);

        Estudiante x = new Estudiante("Jesús", 4.5, 4.2);
        System.out.println(x);
    }
}
