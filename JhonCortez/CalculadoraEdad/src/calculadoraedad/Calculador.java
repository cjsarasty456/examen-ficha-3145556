/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraedad;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Calculador {
    Scanner entrada = new Scanner(System.in);
    public void CalcularEdad(){
        System.out.println("Escriba su dia de nacimiento");
        int dia = entrada.nextInt();
        System.out.println("Escribe tu mes de nacimiento");
        int mes = entrada.nextInt();
        System.out.println("Escribe tu año de naciemiento");
        int ano = entrada.nextInt();
        
        
        int anoA = 2025; // No me acuerdo cual era la libreria ;c
        int mesA = 11;
        int diaA = 19;
       
        int edad = anoA - ano;
        if (mes == mesA && dia == diaA) {
            //Por si coloca la fecha de sus cumpleaños
            System.out.println("Felicidades esta cumpliendo años");
        }else if (mes > mesA) {
             // Por si aun no a cumplido año
            edad = edad - 1;
        }else if (mes == mesA && dia > diaA){
            edad = edad - 1;
        }
        
        System.out.println("Su edad es: " + edad);
    }
}
