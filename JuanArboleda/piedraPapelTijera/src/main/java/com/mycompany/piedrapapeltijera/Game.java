/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piedrapapeltijera;
import java.util.Random;
/**
 *
 * @author Arvol
 */
public class Game {
    private static int decision;
    private static Random rand = new Random();
    private static int botDecision;
    
    private static int playerLife=3;
    private static int botLife=3;
    
    public Game(int n){
        if(n>3){
            System.out.println("p.eso no se puede");
            this.decision=3;
        }
        if(n<1){
            System.out.println("p.eso no se puede");
            this.decision=1;
        }
        this.decision=n;
    }
    
    public static void setBotDecision(){
        botDecision = rand.nextInt();
        if(botDecision<1){
            //System.out.println("b.Eso no se puede");
            botDecision=1;
        }
        if(botDecision>3){
            //System.out.println("b.Eso no se puede");
            botDecision=3;
        }
    }
    
    public static int getBotDecision(){
        return botDecision;
    }
    
    public static int getPlayerDecision(){
        return decision;
    }
    
    public static int getPlayerLife(){
        return playerLife;
    }
    
    public static int getBotLife(){
        return botLife;
    }
    public static void setBotLife(){
        botLife--;
    }
    public static void setPlayerLife(){
        playerLife--;
    }
    public static String getTraduccionN(int n){
        String msj;
        if(n==1){
            return msj="piedra";
        } else if(n==2){
            return msj="papel";
        } else{
            return msj="tijera";
        }
    }
    public static String getResultadoCombate(){        //Elige entre (|)piedra, (2)papel o (3)tijera
        String msj;
        if(decision!=botDecision){
            if(decision==1 && botDecision==3){
                setBotLife();
                return msj="jugador gana";
            }else if(decision==1 && botDecision==3){
                setBotLife();
                return msj="jugador gana";
            }else if(decision==2 && botDecision==1){
                setBotLife();
                return msj="jugador gana";
            }else if(decision==3 && botDecision==2){
                setBotLife();
                return msj="jugador gana";
            }else{
                setPlayerLife();
                return msj="bot gana";
            }
        }else{
                return msj="empate";
        }
    }
    
    public static String getResultadoFinal(){
        String msj;
        if(playerLife>botLife && botLife <=0){
            return msj="Ganasteeeeeee";
        }else{
            System.out.println("Jugador eligio:"+decision+" osea,"+getTraduccionN(decision));
            System.out.println("El bot eligio:"+ getBotDecision()+" osea,"+getTraduccionN(getBotDecision()));
            return msj="Perdiste mancoooo";
        }
    }
}