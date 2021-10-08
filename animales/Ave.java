package com.adaysoft.animales;

public class Ave extends Animal {
    private static float altitudMaxima = 1000.0f;
    private final static String[] colorPlumaje = {"Rojo", "verde", "azul"};
    private final static String[] tipoPata = {"palmípeda", "garra"};

    public Ave(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
    }

    @Override
    void mostrarInformacion() {

    }
}
