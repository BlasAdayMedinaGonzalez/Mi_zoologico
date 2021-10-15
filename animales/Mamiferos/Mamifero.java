package com.adaysoft.animales.Mamiferos;

import com.adaysoft.animales.Animal;

public class Mamifero extends Animal {
    private static double peso = (Math.random()*50) + 1;
    private static double velocidad = (Math.random()*100) + 1;
    public enum habito {
        NOCTURNO,
        DIURNO
    }
    public enum dieta {
        CARNIVORO,
        HERBIVORO,
        OMNIVORO
    }
    public Mamifero(String nombre, int edad, double peso, double velocidad) {
        super(nombre, edad);
        this.peso = peso;
        this.velocidad = velocidad;
    }

}
