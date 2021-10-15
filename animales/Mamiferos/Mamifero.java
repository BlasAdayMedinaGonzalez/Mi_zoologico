package com.adaysoft.animales.Mamiferos;

import com.adaysoft.animales.Animal;
import com.adaysoft.animales.Aves.Aguila;
import com.adaysoft.animales.Aves.Ave;
import com.adaysoft.animales.Aves.Canario;

public class Mamifero extends Animal {
    private double peso;
    private double velocidad;
    private String dieta;
    private String habito;

    public Mamifero(String nombre, int edad,String genero, double peso, double velocidad, String dieta, String habito) {
        super(nombre, edad,genero);
        this.peso = peso;
        this.velocidad = velocidad;
        this.dieta = dieta;
        this.habito = habito;
    }
    public Mamifero () {

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getHabito() {
        return habito;
    }

    public void setHabito(String habito) {
        this.habito = habito;
    }

    public String generardietaAleatorio() {
        String [] arrDieta = {"Nocturno", "Diurno"};
        Animal animal = new Animal();
        int numeroAleatorio = (int) animal.generarNumeroAleatorio(0,arrDieta.length);
        return arrDieta[numeroAleatorio];
    }
    public String generarhabitoAleatorio() {
        String [] arrtipohabito = {"Carnivoro", "Herbivoro", "Omnivoro"};
        Animal animal = new Animal();
        int numeroAleatorio = (int) animal.generarNumeroAleatorio(0,arrtipohabito.length);
        return arrtipohabito[numeroAleatorio];
    }

    public Mamifero generarMamifero(int i) {
        Animal animal = new Animal();
        Mamifero mamifero = new Mamifero();
        double numeroRandom = animal.generarNumeroAleatorio(1,2);
        switch ((int)numeroRandom) {
            case 1:
                Gato gato = new Gato(
                        animal.generarNombre(), (int)animal.generarNumeroAleatorio(1,15),animal.generarGenero() ,animal.generarNumeroAleatorio(1,25),
                        animal.generarNumeroAleatorio(1,30), mamifero.generardietaAleatorio(), mamifero.generarhabitoAleatorio()
                );
                return gato;
            case 2:
                Perro perro = new Perro(
                        animal.generarNombre(), (int)animal.generarNumeroAleatorio(1,15),animal.generarGenero() ,animal.generarNumeroAleatorio(1,25),
                        animal.generarNumeroAleatorio(1,30), mamifero.generardietaAleatorio(), mamifero.generarhabitoAleatorio()
                );
                return perro;
            default:
                return mamifero;
        }
    }

    public String toString(){
        return    " peso= " + getPeso()
                + ", velocidad = " + getVelocidad()
                + ", dieta = " + getDieta()
                + "Tipo animal: Mamífero";
    }

}
