/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JUSTINDANIELA
 */
 
// bueno primero creamos la clase ahorcado
public class Ahorcado{
     public static void main(String[]args){
         Scanner Sc = new Scanner(System.in);
         
         String [] palabra = {"clases" , "mañana" , "feo" , "horrible" }; // aqui ponemos las palabras que vamos a utilizar en nuestro ahorcardo
         Random random = new Random();
         String palabrasSecreta = palabra [random.nextInt(palabra.length)];
         
         char[] progreso = new char [palabrasSecreta.length()];
         
         for (int counter = 0; counter < progreso.length; counter++){
             progreso[counter]= '.';
         }
         
         int oportunidad = 6; // el numero de oportunidad que la persona tiene para que acierte la letra
         
        boolean gano = false;
        
        while (oportunidad > 0 && !gano){
            
          System.out.println("palabra " + String.valueOf (progreso)); 
          System.out.print("oportunidades que te quedan " + oportunidad); // te muestra las oportunidades que tienes 
          System.out.print ("ingrese la letra: ");// ingresa la letra que piensa que es
          
          char letra = Sc.next().toLowerCase().charAt (0);
          
          boolean acierto = false;
          
          for ( int counter = 0;counter < palabrasSecreta.length(); counter++){
              if (palabrasSecreta.charAt(counter) == letra ){
                  progreso [counter]= letra;
                  
                  acierto = true;             
              }   
        }
          
          if (!acierto){
              
              oportunidad--;
              System.out.print("la letra no se encuentra: "); // si pone algo que no es letra pues te sale que no se encuentra
                            
          }else {
              System.out.print("la letra esta correcta" ); // la letra es correcta 
          }
              
            if (String.valueOf(progreso).equals(palabrasSecreta)) {
                gano = true;
            }
        }
     
      if (gano) {
            System.out.println("Ganó. La palabra era: " + palabrasSecreta);
        } else {
            System.out.println("Perdió. La palabra era: " + palabrasSecreta);
        }
 }
}
       
           
         
     



  

        


















