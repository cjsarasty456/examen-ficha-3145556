/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frecuencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Aprendiz
 */
public class Frecuencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  


/*public class Main {*/
/*public static void main(String[] args) {*/

  
        int[] arr = {9, 5, 13, 20, 8, 2, 3};

        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int n : arr) frecuencia.put(n, frecuencia.getOrDefault(n, 0) + 1);

        List<Integer> lista = new ArrayList<>();
        for (int n : arr) lista.add(n);

        lista.sort((a, b) -> {
            int fa = frecuencia.get(a);
            int fb = frecuencia.get(b);

            if (fa != fb) return fb - fa;
            return a - b;
        });

        System.out.println(lista);
    }
}
