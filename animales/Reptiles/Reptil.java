package com.adaysoft.animales.Reptiles;

import com.adaysoft.animales.Animal;
import com.adaysoft.animales.Mamiferos.Gato;
import com.adaysoft.animales.Mamiferos.Perro;

public class Reptil extends Animal {
    private double tempCorpo;
    private double velocidadDesplaz;
    private String colorEscama;


    public Reptil(String nombre, int edad, String genero, double tempCorpo, double velocidadDesplaz, String colorEscama) {
        super(nombre, edad, genero);
        this.tempCorpo = tempCorpo;
        this.velocidadDesplaz = velocidadDesplaz;
        this.colorEscama = colorEscama;
    }

    public Reptil() {

    }

    public double getTempCorpo() {
        return tempCorpo;
    }

    public void setTempCorpo(double tempCorpo) {
        this.tempCorpo = tempCorpo;
    }

    public double getVelocidadDesplaz() {
        return velocidadDesplaz;
    }

    public void setVelocidadDesplaz(double velocidadDesplaz) {
        this.velocidadDesplaz = velocidadDesplaz;
    }

    public String getColorEscama() {
        return colorEscama;
    }

    public void setColorEscama(String colorEscama) {
        this.colorEscama = colorEscama;
    }

    public String generarColorEscama(){
        String [] arrColorEscamas = {"Amarillo", "Negro", "Verde"};
        Animal animal = new Animal();
        int numeroRandom = (int)animal.generarNumeroAleatorio(0, arrColorEscamas.length);
        return arrColorEscamas[numeroRandom];
    }
    public Reptil generarReptil(int i) {
        Animal animal = new Animal();
        Reptil reptil = new Reptil();
        double numeroRandom = animal.generarNumeroAleatorio(1,2);
        switch ((int)numeroRandom) {
            case 1:
                Dragon dragon = new Dragon(
                        animal.generarNombre(), (int)animal.generarNumeroAleatorio(1,5000),animal.generarGenero(), animal.generarNumeroAleatorio(1,4500),
                        animal.generarNumeroAleatorio(1,1000), reptil.generarColorEscama()
                );
                return dragon;
            case 2:
                Lagarto lagarto = new Lagarto(
                        animal.generarNombre(), (int)animal.generarNumeroAleatorio(1,10),animal.generarGenero(), animal.generarNumeroAleatorio(1,25),
                        animal.generarNumeroAleatorio(1,10), reptil.generarColorEscama()
                );
                return lagarto;
            default:
                return reptil;
        }
    }
    public String toString(){
        return    " temperatura corporal = " + getTempCorpo()
                + ", velocidad desplazamiento = " + getVelocidadDesplaz()
                + ", color Escama = " + getColorEscama()
                + "Tipo animal: Mamífero";
    }
}
