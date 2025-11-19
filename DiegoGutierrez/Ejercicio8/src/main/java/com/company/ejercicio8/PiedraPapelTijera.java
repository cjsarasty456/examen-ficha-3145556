/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su elección:");
        System.out.println("Piedra - Papel - Tijera");
        String eleccion = sc.nextLine();
        // Acá ingresamos nuestra eleción, sea entre "Piedra", "Papel" o "Tijera".
        
        pelear(eleccion);
        // Hacemos un llamado al método pelear() y damos el parámetro de nuestra elección.
    }
    
    public static int eleccionMaquina() {
        int eleccionMaquina = (int) ((Math.random() + 1) * 3 - 2);
        // Esta es la operación para generar un número aleatorio entre 1 y 3.
        // Y también retornamos el número que haya generado el método.
        return eleccionMaquina;
    }
    
    public static String convertirEleccionMaquina() {
        // En este método transformamos el número aleatorio a una elección entre las mismas que tiene el usuario.
        int eleccionMaquina = eleccionMaquina();
        // Acá llamamos al método de número aleatorio para generarlo.
        String eleccionConvertida = "";
        
        switch (eleccionMaquina) {
            case (1):
                eleccionConvertida = "Piedra";
                break;
            case (2):
                eleccionConvertida = "Papel";
                break;
            case (3):
                eleccionConvertida = "Tijera";
                break;
        }
        // En esta secuencia swith, transformamos el número a una elección.
        
        return eleccionConvertida;
    }
    
    public static void pelear(String eleccion) {
        String eleccionMaquina = convertirEleccionMaquina();
        // Hacemos un llamado al método de la decisión de la máquina.
        
        if (eleccionMaquina.equals(eleccion)) {
            System.out.println("EMPATE!");
        }
        
        switch (eleccion) {
            case ("Piedra"):
                if (eleccionMaquina.equals("Papel")) {
                    System.out.println("PERDISTE!");
                }
                if (eleccionMaquina.equals("Tijera")) {
                    System.out.println("GANASTE!");
                }
                break;
            case ("Papel"):
                if (eleccionMaquina.equals("Tijera")) {
                    System.out.println("PERDISTE!");
                }
                if (eleccionMaquina.equals("Piedra")) {
                    System.out.println("GANASTE!");
                }
                break;
            case ("Tijera"):
                if (eleccionMaquina.equals("Piedra")) {
                    System.out.println("PERDISTE!");
                }
                if (eleccionMaquina.equals("Papel")) {
                    System.out.println("GANASTE!");
                }
                break;
        }
        // Acá se presentan todos los casos posibles de duelo para así mismo imprimir el resutlado de la pelea.
    }
}
