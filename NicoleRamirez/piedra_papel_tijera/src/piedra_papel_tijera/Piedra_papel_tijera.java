/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedra_papel_tijera;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Niki
 */
public class Piedra_papel_tijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione un numero: " );
        System.out.println("1. piedra ");
         System.out.println("2. papel ");
          System.out.println("3. tijera  ");
          int usuario= sc.nextInt();
          int maquina =(int)(Math.random()* 3) +1;
          
          // se le dice al usuario que escogio y que escogio la maquina
          switch(usuario){
              case 1: System.out.println("Esocgiste piedra");break;
              case 2: System.out.println("Esocgiste papel"); break;
              case 3: System.out.println("Esocgiste tijeras"); break;
             
                             
          }   
           
          switch(maquina){
              case 1: System.out.println("La maquina escogio piedra");break;
              case 2: System.out.println("La maquina escogio papel"); break;
              case 3: System.out.println("La maquina escogio tijeras");break;
              
                  
          }
          
          // se define que pasa en cada caso
          switch(usuario){
              case 1:
                  switch(maquina){
                      case 1: System.out.println("empate"); break;
                      case 2 : System.out.println("perdiste"); break;
                      case 3: System.out.println("perdiste"); break;
  
                  
                  }
                break;
              
          
          case 2: 
              switch(maquina){
                      case 1: System.out.println("Ganaste"); break;
                      case 2 : System.out.println("empate"); break;
                      case 3: System.out.println("perdiste");break;
                  

              }
              
              break;
          case 3:
              
              switch(maquina){
                      case 1: System.out.println("perdiste");break;
                      case 2 : System.out.println("ganaste");break;
                      case 3: System.out.println("empate");break;

              }
             break;   
                  
          }

        
    }
    
}
