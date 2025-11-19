/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto4;

/**
 *
 * @author Juan Gomez
 */
import java.util.*;

public class Punto4 {

    public static void main(String[] args) {

        int[] nums = {4, 4, 1, 2, 2, 2, 3};

        //  Contar frecuencias
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int n : nums) {
            frecuencia.put(n, frecuencia.getOrDefault(n, 0) + 1);
        }

        //  Convertir a lista para ordenar
        List<Integer> lista = new ArrayList<>();
        for (int n : nums) lista.add(n);

        //  Ordenamiento compuesto
        lista.sort((a, b) -> {
            int fa = frecuencia.get(a);
            int fb = frecuencia.get(b);

            // Ordenar por frecuencia (descendente)
            if (fa != fb) {
                return Integer.compare(fb, fa);
            }

            // Si tienen misma frecuencia → ordenar por valor (ascendente)
            return Integer.compare(a, b);
        });

        //  Construir arreglo final
        int[] resultado = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }

        //  Mostrar salida
        System.out.println("Resultado: " + Arrays.toString(resultado));
    }
}
