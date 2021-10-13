package com.adaysoft.animales;

public class Reptil extends Animal{
    private final static double tempCorpo = (Math.random()*50) + 1;
    private final static double velocidadDesplaz = (Math.random()*100) + 1;
    public enum colorEscama{
        AMARILLO,
        GRIS,
        NEGRO
    }

    public Reptil(String nombre, int edad, String genero) {
        super(nombre, edad);
    }
}
