package juego;
import java.util.Scanner;

public class Juego {

    public static String ataques(int ataque){
        switch(ataque){
            case 1: return "Piedra";
            case 2: return "Papel";
            case 3: return "Tijeras";
            default: return "Ataque invalido";
        }
    }

    public static int batalla(int ataqueJugador, int ataquePC, int vidas){
        System.out.println("Tu has elegido: " + ataques(ataqueJugador));
        System.out.println("El enemigo eligio: " + ataques(ataquePC));
        if(ataqueJugador == ataquePC){
            System.out.println("HAS EMPATADO!");
        } else if((ataqueJugador == 1 && ataquePC == 2) ||
                  (ataqueJugador == 2 && ataquePC == 3) ||
                  (ataqueJugador == 3 && ataquePC == 1)){
            System.out.println("PERDISTE!");
            vidas--;
        } else {
            System.out.println("GANASTE!");
        }
        return vidas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Juego de Piedra, Papel o Tijera");
        System.out.println("Ingresa 1 para piedra, 2 para papel y 3 para tijera.");
        int vidas = 3;

        while(vidas > 0){
            int ataquePC = (int)(Math.random() * 3) + 1;
            System.out.print("Ingresa el numero del ataque: ");
            int ataqueJugador = sc.nextInt();
            if(ataqueJugador < 1 || ataqueJugador > 3){
                System.out.println("HAS INGRESADO UN VALOR INVÁLIDO. ¡PERDISTE!");
                break;
            }
            vidas = batalla(ataqueJugador, ataquePC, vidas);
            System.out.println("Te quedan " + vidas + " vidas");
        }
    }
}