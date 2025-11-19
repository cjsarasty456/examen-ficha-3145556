/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.piedrapapeltijera;
import java.util.Scanner;

/**
 *
 * @author Arvol
 */

public class PiedraPapelTijera {
    private static Scanner sc = new Scanner(System.in);
    private static int decision = 0;
    private static Game g ;
    private static String estado;
    private static int botDecision;
    
    public static void main(String[] args) {
        while(g.getPlayerLife() >1 | g.getBotLife() >1){
            
            System.out.println("Elige entre (|)piedra, (2)papel o (3)tijera");
            System.out.println("vida jugador:"+ g.getPlayerLife());
            System.out.println("vida bot:"+ g.getBotLife());
            
            g = new Game(decision = sc.nextInt());
            System.out.println("Jugador eligio:"+decision+" osea,"+g.getTraduccionN(decision));
            botDecision = g.getBotDecision();
            System.out.println("El bot eligio:"+botDecision+" osea,"+ g.getTraduccionN(botDecision));
            System.out.println(g.getResultadoCombate());
        }
        System.out.println(g.getResultadoFinal());
    }  
}