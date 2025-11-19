/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.piedra;
import java.util.*;
/**
 *
 * @author USUARIO
 */
public class Piedra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // opciones del jugador
        String[] opciones = {"piedra", "papel", "tijeras"};

        System.out.print("elige (piedra, papel o tijeras): ");
        String jugador = sc.next().toLowerCase();

        // eleccion aleatoria de la pc
        String pc = opciones[(int)(Math.random() * 3)];

        System.out.println("maquina eligio: " + pc);

        // comparacion con condicionales
        if (jugador.equals(pc)) {
            System.out.println("empate!");
        } else if (
            (jugador.equals("piedra")  && pc.equals("tijeras")) ||
                
            (jugador.equals("papel")   && pc.equals("piedra")) ||
                
            (jugador.equals("tijeras") && pc.equals("papel"))
        ) {
            System.out.println("ganaste!");
        } else {
            System.out.println("perdiste tontito");
        }
    }
}
