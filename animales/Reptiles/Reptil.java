package com.adaysoft.animales.Reptiles;

import com.adaysoft.animales.Animal;

public class Reptil extends Animal {
    private static double tempCorpo = (Math.random()*50) + 1;
    private static double velocidadDesplaz = (Math.random()*100) + 1;

    public enum colorEscama{
        AMARILLO,
        GRIS,
        NEGRO
    }

    public Reptil(String nombre, int edad, double tempCorpo, double velocidadDesplaz) {
        super(nombre, edad);
        this.tempCorpo = tempCorpo;
        this.velocidadDesplaz = velocidadDesplaz;
    }
}
