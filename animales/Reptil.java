package com.adaysoft.animales;

public class Reptil extends Animal{
    private final static double tempCorpo = 47;
    private final static String[] colorEscama = {"Amarillo", "gris", "negro"};
    private final static double velocidadDesplaz = 127.5;

    public Reptil(String nombre, int edad, String genero, double tempCorpo) {
        super(nombre, edad, genero);
    }

    @Override
    void mostrarInformacion() {

    }
}
