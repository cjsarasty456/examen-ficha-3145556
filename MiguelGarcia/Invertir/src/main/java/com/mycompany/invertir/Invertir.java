/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertir;

/**
 *
 * @author USUARIO
 */
import java.util.*;

public class Invertir {

    public static void main(String[] args) {

        int[] Array = {4, 4, 1, 2, 2, 2, 3};

        // Identificamos la frecuencia
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int num : Array) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        // Organizamos la lista
        List<Integer> lista = new ArrayList<>();
        for (int num : Array) {
            lista.add(num);
        }

        // Reorganizmos las listas
        Collections.sort(lista, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int A = frecuencia.get(a);
                int B = frecuencia.get(b);

                // Organizamos de manera descendente
                if (A != B) {
                    return Integer.compare(B, A); // De mayor a menor
                }

                // Organizamos de manera ascendente
                return Integer.compare(a, b);
            }
        });

        // Imprimimos el resultado
        System.out.println(lista);
    }
}
