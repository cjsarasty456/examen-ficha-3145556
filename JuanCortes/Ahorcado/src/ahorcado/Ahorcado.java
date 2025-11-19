import java.util.Scanner;
import java.util.Random;


public class Ahorcado {
    
    
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       String [] palabras= new String[]{"Jugar", "Pensar", "Banana", "Persona", "Clase"};
       
       Random random= new Random();
       String palabraSecreta= palabras[random.nextInt(palabras.length)];
       
       char [] progreso= new char[palabraSecreta.length()];
       
       for(int i=0; i<progreso.length; i++){
           progreso[i]= '_';
           
       }
       
       
       int intentos=6; 
       boolean acertarPalabra=false;
       
        System.out.println("Juego del ahorcado!");
        System.out.println("Adivina la palabra secreta");
        
        System.out.println();
        System.out.print("Introduce una letra: ");
        String letra= sc.nextLine();
        
       
        
      
       
       
    }
    
}

