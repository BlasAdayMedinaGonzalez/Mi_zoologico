package com.adaysoft.animales;

import static java.lang.System.out;

public class Mamifero extends Animal{
    private final static double peso = (Math.random()*50) + 1;
    private final static double velocidad = (Math.random()*100) + 1;
    public enum habito {
        NOCTURNO,
        DIURNO
    }
    public enum dieta {
        CARNIVORO,
        HERBIVORO,
        OMNIVORO
    }
    public Mamifero(String nombre, int edad, String genero) {
        super(nombre, edad);
    }

}
