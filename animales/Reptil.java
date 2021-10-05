package com.adaysoft.animales;

public class Reptil extends  Animal{
    private double tempCorpo;
    private String colorEscama;
    private double velocidadDesplaz;

    public Reptil(String nombre, int edad, String genero, double tempCorpo, String colorEscama, double velocidadDesplaz) {
        super(nombre, edad, genero);
        this.tempCorpo = tempCorpo;
        this.colorEscama = colorEscama;
        this.velocidadDesplaz = velocidadDesplaz;
    }

    @Override
    void mostrarInformacion() {

    }
}
