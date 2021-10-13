package com.adaysoft.animales;

public class Ave extends Animal {
    private static double altitudMaxima = (Math.random()*100);
    public enum colorPlumaje {
        ROJO,
        VERDE,
        AZUL
    };
    public enum tipoPata {
        PALMIPEDA,
        GARRA
    };
    public Ave(String nombre, int edad, String genero) {
        super(nombre, edad);
    };

}
