/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;
import java.util.*;
/**
 *
 * @author Asus
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {4, 4, 1, 2, 2, 2, 3};
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : numeros) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> lista = new ArrayList<>(freq.entrySet());
        lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        for (Map.Entry<Integer, Integer> entry : lista) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

