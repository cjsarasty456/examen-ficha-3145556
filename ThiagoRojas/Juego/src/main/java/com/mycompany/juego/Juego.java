/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thiag
 */


public class Juego {

    public static void main(String[] args) {

        Scanner elegir = new Scanner(System.in);
        Random ramdom = new Random();
        
        //Creamos un scanner y un ramdom para que el usuario pueda interactuar con el sistema y el ramdom para que el sistema elija una opcion de las 3 aleatoriamente
        
        System.out.println("1 piedra, 2 papel, 3 tijera");
        int jugador = elegir.nextInt(); 
        int maquinaEleccion = ramdom.nextInt(3) + 1;
        //Aqui hacemos que el usuario elija el y ademas el sistema elija tambien aleatoriamnete
        
        System.out.println("elegiste " + jugador);
        System.out.println("La maquina eligio " + maquinaEleccion);

      
        switch(jugador) {
            case 1: 
                if(maquinaEleccion == 3){ 
                    System.out.println("Ganaste");
                }else if(maquinaEleccion == 2){
                    System.out.println("Perdiste, gano la maquina");
                }else
                    System.out.println("Empate");
                break;

            case 2: 
                if(maquinaEleccion == 1){
                    System.out.println("Ganaste");
                }else if(maquinaEleccion == 3){
                    System.out.println("Perdiste, gano la maquina");
                }else 
                    System.out.println("Empate");
                break;

            case 3:
                if(maquinaEleccion == 2){
                    System.out.println("Ganaste");
                }else if(maquinaEleccion == 1){
                    System.out.println("Perdiste, gano la maquina");
                }else 
                    System.out.println("Empate");
                break;
        }
        //Creamos un switch con los casos que pueden pasar dependiendo de la eleccion del usuario y la del sistema e imprimimos resultados
    }
}
