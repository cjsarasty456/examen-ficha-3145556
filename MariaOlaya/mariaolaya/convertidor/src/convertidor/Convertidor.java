/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidor;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Convertidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  

        /* public class Main {*/ 
        
        /*    public static void main(String[] args) {*/      
        
        Scanner sc = new Scanner(System.in);

        System.out.print("La Temperatura en grados Celsius: ");
        double c = sc.nextDouble();

        double f = c * 9.0 / 5.0 + 32;

        System.out.println("Fahrenheit: " + f);
        }
    }


