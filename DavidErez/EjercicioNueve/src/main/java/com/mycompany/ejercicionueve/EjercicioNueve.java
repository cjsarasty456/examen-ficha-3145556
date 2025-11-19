/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicionueve;

import java.util.Scanner;

/**
 *
 * @author nox
 */
public class EjercicioNueve {

//  9. Descripción del Ejercicio: Piedra, Papel o Tijera
//El aprendiz debe desarrollar un programa en Java que simule el clásico juego
//“Piedra, Papel o Tijera”. El programa debe permitir que el usuario seleccione una
//de las tres opciones posibles y, de manera aleatoria, el sistema debe generar la
//opción de la máquina. Luego, el programa debe comparar ambas elecciones y
//determinar el resultado de la partida, indicando si el jugador gana, pierde o
//empata.
//• El ejercicio requiere que el aprendiz implemente:
//• Lectura de datos desde teclado.
//• Generación de valores aleatorios.
//• Uso de condicionales para determinar el ganador.
//• Un método adicional que permita convertir los valores numéricos en nombres
//(piedra, papel o tijera).
//• Buena organización del código, siguiendo principios básicos de programación.
//• El propósito del ejercicio es reforzar la lógica de decisión, el manejo de entradas
//del usuario, el uso de funciones y la estructura general de un programa
//interactivo en Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vida= 3;
        int vidaMaquina =3;
        String[] maquina= {"tijeras","papel","piedra"};
        int indice = maquina.length;
        int random = (int)(Math.random() * indice); 
        int value = 0;
        
        System.out.println(random);
        
        System.out.println("-------------piedra__papel__tijeras----------");
        
        do{
            System.out.println("1. tijeras \n 2.papel \n 3.piedra");
            value = sc.nextInt();
        switch(value){


        case 1:           
             System.out.println(" usuario tijeras");

            if(random == 0){
                System.out.println("maquina saca tiejeraras \n empate");
                System.out.println(vida);
            }
            if(random == 1){
                System.out.println("maquina saca papel \n maquina pierde una vida");
                vidaMaquina -= 1;
                System.out.println(vida);
                System.out.println(vidaMaquina);
            }
               if(random == 2){
                System.out.println("maquina saca piedra \n usuario pierde una vida");
                vida -= 1;
                System.out.println("vida user: "+vida);
                System.out.println("vida maquina: "+vidaMaquina);
            }
           System.out.println("-----------------------------------------------------");
        break;
        case 2:
                   System.out.println(" usuario tira papel");
             if(random == 0){
                System.out.println("maquina saca tiejeraras \n usuario pierde una vida ");
                vida -= 1;
                System.out.println("vida user: "+vida);
                System.out.println("vida maquina: "+vidaMaquina);
            }
            if(random == 1){
                System.out.println("maquina saca papel \nempate");
                 System.out.println("vida user: "+vida);
                System.out.println("vida maquina: "+vidaMaquina);
            }
               if(random == 2){
                System.out.println("maquina saca piedra \n maquina pierda una vida");
               vidaMaquina -= 1;
                System.out.println("vida user: "+vida);
                System.out.println("vida maquina: "+vidaMaquina);
            }
            System.out.println("------------------------------------------------------");
               
             
            System.out.println("------------------------------------------------------");
        break;
        case 3:
              
            System.out.println(" usuario tira piedra");
             if(random == 0){
                System.out.println("maquina saca tiejeraras \n maquina pierde una vida ");
                vidaMaquina -= 1;
                System.out.println("vida user: "+vida);
                System.out.println("vida maquina: "+vidaMaquina);
            }
            if(random == 1){
                System.out.println("maquina saca papel \nusuario pierde una vida");
                vida -= 1;
                  System.out.println("vida user: "+vida);
                System.out.println("vida maquina: "+vidaMaquina);
            }
               if(random == 2){
                System.out.println("maquina saca piedra \n empate");
                System.out.println("vida user: "+vida);
                System.out.println("vida maquina: "+vidaMaquina);
            }

            break;
        default:
        }
        }while(vida != 0 && vidaMaquina != 0);


        
        
        if(vida > vidaMaquina){
        System.out.println("el ganador es usuario");
            System.out.println(vida);
            System.out.println("el perdedor es maquina");
        }
        else{
             
        System.out.println("el ganador es maquina");
            System.out.println(vidaMaquina);
            System.out.println("el perdedor es usuario");
        }
}
}