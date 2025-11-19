/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author SoporteSENA
 */
import java.util.*;

public class OrdenarPorFrecuencia {
    public static void main(String[] args) {

        int[] arr = {4, 4, 1, 2, 2, 2, 3};

        // contamos las frecuencias
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int n : arr) {
            if (frecuencia.containsKey(n)) {
                frecuencia.put(n, frecuencia.get(n) + 1);
            } else {
                frecuencia.put(n, 1);
            }
        }

        // pasamos el arreglo a una lista 
        List<Integer> lista = new ArrayList<>();
        for (int n : arr) {
            lista.add(n);
        }

        // ordenamos
        Collections.sort(lista, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int fa = frecuencia.get(a);
                int fb = frecuencia.get(b);

                if (fa != fb) {
                    return fb - fa;   // mayor frecuencia primero
                } else {
                    return a - b;     // si empatan se ordena por número
                }
            }
        });

        // resultado
        System.out.println(lista);
    }
}
