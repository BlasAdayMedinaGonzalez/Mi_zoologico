package com.adaysoft.zoo;

import com.adaysoft.animales.Animal;
import com.adaysoft.animales.Aves.Canario;
import com.adaysoft.animales.Mamiferos.Perro;
import com.adaysoft.animales.Reptiles.Lagarto;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {

    private ArrayList<Animal> animales  = new ArrayList<>();
    private ArrayList<String> areas = new ArrayList<String>();

    private int numeroEspacios;
    private int numeroAnimales;

    public Zoologico(int numeroEspacios, int numeroAnimales) {
        this.numeroEspacios = numeroEspacios;
        this.numeroAnimales = numeroAnimales;
    }
    public int getNumeroEspacios() {
        return numeroEspacios;
    }

    public void setNumeroEspacios(int numeroEspacios) {
        this.numeroEspacios = numeroEspacios;
    }

    public int getNumeroAnimales() {
        return numeroAnimales;
    }

    public void setNumeroAnimales(int numeroAnimales) {
        this.numeroAnimales = numeroAnimales;
    }

    public void creacionZoo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Numero de espacio?");
        this.numeroEspacios = sc.nextInt();
        System.out.println("¿Cuantos animales?");
        this.numeroAnimales = sc.nextInt();

        try {
            creacionAnimales();
            mostrarInformacion();
        }catch(IndexOutOfBoundsException e ) {
            System.out.println("Error: los valores introducidos son erróneos");
        }
        
        sc.close();
    }

    public String getTipoAnimal(Animal animal) {
        if (animal instanceof Lagarto) {
            return "Lagarto";
        } else if (animal instanceof Perro) {
            return "Perro";
        } else if (animal instanceof Canario) {
            return "Canario";
        } else {
            return null;
        }
    }

    private void creacionAnimales() {


    }






}
