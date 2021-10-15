package com.adaysoft.animales.Aves;

import com.adaysoft.animales.Animal;

public class Ave extends Animal {
    private double altitudMaxima;
    private String colorPlumaje;
    private String tipoPata;

    public Ave(String nombre, int edad,String genero, double altitudMaxima, String colorPlumaje, String tipoPata) {
        super(nombre, edad,genero);
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
        Animal animal = new Animal();
        int numeroAleatorio = (int) animal.generarNumeroAleatorio(0,arrColores.length);
        return arrColores[numeroAleatorio];
    }
    public String generartipoPataAleatorio() {
        String [] arrtipoPata = {"Palmípeda", "Garra"};
        Animal animal = new Animal();
        int numeroAleatorio = (int) animal.generarNumeroAleatorio(0,arrtipoPata.length);
        return arrtipoPata[numeroAleatorio];
    }

    public Ave generarAve(int i) {
        Animal animal = new Animal();
        Ave ave = new Ave();
        double numeroRandom = animal.generarNumeroAleatorio(1,2);
        switch ((int)numeroRandom) {
            case 1:
                Canario canario = new Canario(
                        animal.generarNombre(), (int)animal.generarNumeroAleatorio(1,25),animal.generarGenero(), animal.generarNumeroAleatorio(1,200),
                        ave.generarColorAleatorio(), ave.generartipoPataAleatorio()
                );
                return canario;
            case 2:
                Aguila aguila = new Aguila(
                        animal.generarNombre(), (int)animal.generarNumeroAleatorio(1,30), animal.generarGenero(),animal.generarNumeroAleatorio(1,500),
                        ave.generarColorAleatorio(), ave.generartipoPataAleatorio());
                return aguila;
            default:
                return ave;
        }
    }

    public String toString(){
        return    " altitudMaxima= " + getAltitudMaxima()
                + ", colorPlumaje = " + getColorPlumaje() + '\''
                + ", tipoGarra = " + getTipoPata() + '\''
                + "Tipo animal: AVE";
    }
}
