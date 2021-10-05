package com.adaysoft.Animales;

public class Mamifero extends Animal{
    private double peso;
    private double velocidad;
    private String[] habito = {"diurno", "nocturno"};
    private String[] dieta = {"carnivoro", "herbivoro", "omnivoro"};

    public Mamifero(String nombre, int edad, String genero, double peso, double velocidad, String[] habito, String[] dieta) {
        super(nombre, edad, genero);
        this.peso = peso;
        this.velocidad = velocidad;
        this.habito = habito;
        this.dieta = dieta;
    }

    @Override
    void mostrarInformacion() {

    }
}
