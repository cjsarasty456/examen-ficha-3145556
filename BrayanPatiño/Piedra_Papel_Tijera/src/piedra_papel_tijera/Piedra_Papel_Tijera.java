/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedra_papel_tijera;

/**
 *
 * @author Aprendiz
 */
import java.util.Scanner;
public class Piedra_Papel_Tijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escoge una opcion. (Solo el numero de la opcion)");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
       
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Elegiste Piedra");
                break;
            case 2: 
                System.out.println("Elegiste Papel");
                break;
            case 3:
                System.out.println("Elegiste Tijera");
                break;
            default:
                System.out.println("Opcion incorrecta, vuelve a elegir");
        }
        
        int equipo = (int) (Math.random() * 3)+1; // EL sistema elige un numero aleatorio de 1 a 3
        System.out.println("Equipo eligio " + equipo);
        switch(equipo){
            case 1:
                System.out.println("Piedra");
                break;
            case 2: 
                System.out.println(" Papel");
                break;
            case 3:
                System.out.println(" Tijera");
                break;
            default:
                System.out.println("Opcion incorrecta, vuelve a elegir");
        }
        if(opcion == equipo){
            System.out.println("Empate");
        }else if(opcion ==1 && equipo ==3){
            System.out.println("Ganaste");
        }else if(opcion == 2 && equipo ==1){
            System.out.println("Ganaste");
        }else if(opcion ==3 && equipo ==2){
            System.out.println("Ganaste");
        }else{
            System.out.println("Perdiste");
        }
        }
}
    
