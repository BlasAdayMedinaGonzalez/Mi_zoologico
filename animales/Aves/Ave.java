package com.adaysoft.animales.Aves;

import com.adaysoft.animales.Animal;

public class Ave extends Animal {
    private double altitudMaxima;
    private String colorPlumaje;
    private String tipoPata;

    public Ave(String nombre, int edad, double altitudMaxima, String colorPlumaje, String tipoPata) {
        super(nombre, edad);
        this.altitudMaxima = altitudMaxima;
        this.colorPlumaje = colorPlumaje;
        this.tipoPata = tipoPata;
    }
    public Ave () {

    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPata() {
        return tipoPata;
    }

    public void setTipoPata(String tipoPata) {
        this.tipoPata = tipoPata;
    }

    public String generarColorAleatorio() {
        String [] arrColores = {"Rojo", "Verde", "Azul"};
        Animal color = new Animal();
        int numeroAleatorio = (int) color.generarNumeroAleatorio(0,arrColores.length);
        return arrColores[numeroAleatorio];
    }
    public String generartipoPataAleatorio() {
        String [] arrtipoPata = {"Palmípeda", "Garra"};
        Animal tipoPata = new Animal();
        int numeroAleatorio = (int) tipoPata.generarNumeroAleatorio(0,arrtipoPata.length);
        return arrtipoPata[numeroAleatorio];
    }

    public Ave generarAve(int i) {
        Animal animal = new Animal();
        Ave ave = new Ave();
        double numeroRandom = animal.generarNumeroAleatorio(1,2);
        switch ()
    }
}
