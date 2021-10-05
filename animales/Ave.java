package com.adaysoft.animales;

public class Ave extends Animal {
    private double altitudMaxima;
    private String colorPlumaje;
    private String[] tipoPata = {"palmípeda", "garra"};

    public Ave(String nombre, int edad, String genero, double altitudMaxima, String colorPlumaje, String[] tipoPata) {
        super(nombre, edad, genero);
        this.altitudMaxima = altitudMaxima;
        this.colorPlumaje = colorPlumaje;
        this.tipoPata = tipoPata;
    }

    @Override
    void mostrarInformacion() {

    }
}
