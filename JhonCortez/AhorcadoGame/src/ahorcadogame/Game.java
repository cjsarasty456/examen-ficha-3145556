/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcadogame;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import java.util.Arrays;
public class Game {
    Scanner entrada = new Scanner(System.in);
    //Metodo para elegir la palabra secreta entre 3
    public double random(){
        double random = Math.random()*3; //Un numero random del 0 al 2
        return random = Math.floor(random);// aca es para el numero random no sea decimal
    }
    public void palabra(){
        String[] palabra1 ={"c","a","r","r","o"};
        String[] palabra2 ={"s","i","l","l","a"};
        String[] palabra3 ={"l","e","o","n"};
        switch (random()) {
            case 0.0:
                break;
            case 1.0:
                break;
            case 2.0:
                break;
            default:
        }
    }
    public void contadorLetras(){
        //Aca lo dejo por si me acuerdo como se contaban letras
    }
    // En este metodo es donde se ejecutara gran parte del juego
    public void juego(){
        String[] palabra = {"l","e","o","n"};
        int vidas = 8;
        System.out.println("Tiene 8 intentos para encontrar la palabra");
        System.out.println("");
        System.out.println("Digite la primera letra:");
        String letra = entrada.nextLine();
        while(vidas>0){
            for (int i = 0; i < palabra.length; i++) {
                //Se hace un recorrido para saber si le acerto a una letra
                //System.out.println(prueba);
            }
            System.out.println("Digite otra letra");
            letra = entrada.nextLine();
        }
        //Mensaje de que termino el juego
        System.out.println("Se acabo el juego, vuelve a jugar");
    }
}
