import java.util.Scanner;
public class Ahorcado {

    public static void main(String[] args) {

        // Palabras del juego
        String[] palabras = {"computadora", "programacion", "java", "netbeans", "teclado", "monitor"};
        
        // palabra aleatoria
        String palabraSecreta = palabras[(int)(Math.random() * palabras.length)];
        
        // simplemete creamos las lineas donde van a ir las letras
        char[] progreso = new char[palabraSecreta.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        int intentos = 6; // Intentos permitidos
        boolean palabraAdivinada = false;
        Scanner sc = new Scanner(System.in);

        System.out.println(" JUEGO DEL AHORCADO ");
        System.out.println("Adivina la palabra secreta.");

        while (intentos > 0 && !palabraAdivinada) {
            System.out.print("\nPalabra: ");
            System.out.println(progreso);
            System.out.println("Intentos restantes: " + intentos);

            System.out.print("Ingresa una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);

            boolean acierto = false;

            // Verificar si la letra está en la palabra
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra && progreso[i] == '_') {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                System.out.println("Letra incorrecta");
            } else {
                System.out.println("Bien");
            }

            // Revisar si ya no quedan guiones
            palabraAdivinada = true;
            for (char c : progreso) {
                if (c == '_') {
                    palabraAdivinada = false;
                    break;
                }
            }
        }

        System.out.println("\n FIN DEL JUEGO ");
        if (palabraAdivinada) {
            System.out.println("Bien manito: le atinaste a la palabra " + palabraSecreta);
        } else {
            System.out.println("Se quedo sin intentos malardo. La palabra era: " + palabraSecreta);
        }

        sc.close();
    }
}
