/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ejerciciouno.models;

import java.util.Random;

/**
 *
 * @author Cristofer Lozano (lozano2303)
 */
public class Palabras {

    // Lista de palabras para el juego
    private static final String[] PALABRAS = {
        "HOLA", "MUCHO", "GUSTO", "BIENVENIDO", "EXAMEN",
        "QUE", "MIEDO", "GATO", "PERRO", "ANIMAL", "MUNDO"
    };

    /**
     * Selecciona una palabra aleatoria de la lista
     * @return palabra secreta en mayúsculas
     */
    public static String PalabraRandom() {
        Random random = new Random();
        int indice = random.nextInt(PALABRAS.length);
        return PALABRAS[indice];
    }
}
