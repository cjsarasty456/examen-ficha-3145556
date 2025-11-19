/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoppt;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Logica {
    Scanner entrada = new Scanner(System.in);
    int vidas = 3;
    int vidasPc = 3;
    double op = 0;
    double oppc = 0;
    public double random(){
        double random = Math.floor(Math.random()*3+1);
        return random;
    }
    public void comprobacion(){
        if (op == oppc) {
                System.out.println("Empate, no pierdes vidas");
            }else if (op == 1 && oppc == 3 || op == 2 && oppc == 1 || op == 3 && oppc == 2) {
                System.out.println("Gano, el enemigo pierde una vida");
                vidasPc--;
            }else{
                System.out.println("Perdio, pierdes una vida");
                vidas--;
            }
    }
    public void game(){
        while (vidas>0) {
            oppc = random();
            System.out.println("Vidas: "+vidas);
            System.out.println("Vidas enemigo: "+vidasPc);
            System.out.println("Escoje que usar: \n1.piedra\n2.papel\n3.tijeras");
            op = entrada.nextInt();
            switch (oppc) {
                case 1.0:
                    System.out.println("El enemigo uso piedra");
                    break;
                case 2.0:
                    System.out.println("El enemigo uso papel");
                    break;
                case 3.0:
                    System.out.println("El enemigo uso tijera");
                    break;
                default:
                    throw new AssertionError();
            }
            switch (op) {
                case 1.0:
                    System.out.println("Usaste piedra");
                    break;
                case 2.0:
                    System.out.println("Usaste papel");
                    break;
                case 3.0:
                    System.out.println("Usaste tijera");
                    break;
                default:
                    throw new AssertionError();
            }
            comprobacion();
            if (vidasPc == 0 || vidas == 0) {
                System.out.println("Se acabo el juego");
                vidas = 0;
            }
        }
    }
}
