/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocuatro;

import java.util.*;

/**
Ordenar por frecuencia
Dado un arreglo, ordénalo por frecuencia de aparición (de mayor a menor).
Si dos números tienen la misma frecuencia, ordénalos de menor a mayor.
Entrada:
[4,4,1,2,2,2,3]
Salida:
[2,2,2,4,4,3,1]
Conceptos:
Ordenamientos compuestos
Construcción de nuevo arreglo
 * Autor: Jhampier Santos Ortiz
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 2, 2, 2, 3};
        int[] resultado = ordenarPorFrecuencia(arr);

        System.out.println(Arrays.toString(resultado));
    }

    public static int[] ordenarPorFrecuencia(int[] arr) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : arr) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        List<Integer> lista = new ArrayList<>();
        for (int num : arr) {
            lista.add(num);
        }

        // Ordenar lista usando frecuencia descendente y valor ascendente si hay empate
        lista.sort((a, b) -> {
            int freqCompare = frecuencia.get(b) - frecuencia.get(a); 
            if (freqCompare != 0) {
                return freqCompare;
            } else {
                return a - b; 
            }
        });
        int[] resultado = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultado[i] = lista.get(i);
        }

        return resultado;
    }
}
