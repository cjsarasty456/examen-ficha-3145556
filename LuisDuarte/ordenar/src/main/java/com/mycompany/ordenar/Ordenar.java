/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenar;
import java.util.*;

/**
 *
 * @author USUARIO
 */

public class Ordenar {
    public static void main(String[] args) {

        // Arreglo inicial
        int[] arr = {4, 4, 1, 2, 2, 2, 3};
        //calcular la frecuencia de cada numero
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : arr)
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        //convertir el arreglo en una lista
        List<Integer> lista = new ArrayList<>();
        for (int n : arr)
            lista.add(n);
        // 3) Ordenar con un comparador personalizado
        Collections.sort(lista, (a, b) -> {
            // comparar frecuencias
            if (!freq.get(a).equals(freq.get(b)))
                return freq.get(b) - freq.get(a); // mayor frecuencia primero

            // si las frecuencias son iguales comparar valores
            return a - b; // menor valor primero
        });
        System.out.println(lista);
    }
}

