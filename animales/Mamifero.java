package com.adaysoft.animales;

import static java.lang.System.out;

public class Mamifero extends Animal{
    private double peso;
    private double velocidad;
    private final static String[] habito = {"diurno", "nocturno"};
    private final static String[] dieta = {"carnivoro", "herbivoro", "omnivoro"};

    public Mamifero(String nombre, int edad, String genero, double peso, double velocidad) {
        super(nombre, edad, genero);
        this.peso = peso;
        this.velocidad = velocidad;
    }

    @Override
    void mostrarInformacion() {
        out.println("");
    }
}
