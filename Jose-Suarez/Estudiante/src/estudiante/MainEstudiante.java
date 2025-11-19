/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class MainEstudiante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("nota 2: ");
        double n2 = sc.nextDouble();

        Estudiante e = new Estudiante(nombre, n1, n2);

        System.out.println("promedio: " + e.promedio());
        System.out.println("resultado: " + e.aprobo());

        sc.close();
    }
}