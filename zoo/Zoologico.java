package com.adaysoft.zoo;

import com.adaysoft.animales.Animal;
import com.adaysoft.animales.Aves.Aguila;
import com.adaysoft.animales.Aves.Ave;
import com.adaysoft.animales.Aves.Canario;
import com.adaysoft.animales.Mamiferos.Gato;
import com.adaysoft.animales.Mamiferos.Mamifero;
import com.adaysoft.animales.Mamiferos.Perro;
import com.adaysoft.animales.Reptiles.Dragon;
import com.adaysoft.animales.Reptiles.Lagarto;
import com.adaysoft.animales.Reptiles.Reptil;

import java.util.ArrayList;

public class Zoologico {

    final static int NUMERO_ANIMALES = 6;

    public Zoologico(int numeroEspacios, int numeroAnimales) {
        ArrayList<Animal> animales = new ArrayList<>();
        String tipoAnimal = "";
        if (comprobacionEspacios(numeroEspacios, numeroAnimales)) {
            System.out.println("Animales del Zoo:");
            animales=crearAnimales(numeroEspacios, numeroAnimales);
            for (int i = 0; i < animales.size(); i++) {
                if(animales.get(i) instanceof Aguila){
                    tipoAnimal="Aguila";
                }else if (animales.get(i) instanceof Canario){
                    tipoAnimal="Canario";
                }else if (animales.get(i) instanceof Gato){
                    tipoAnimal="Gato";
                }else if (animales.get(i) instanceof Perro){
                    tipoAnimal="Perro";
                }else if(animales.get(i) instanceof Dragon){
                    tipoAnimal="Dragon";
                }else if(animales.get(i) instanceof Lagarto){
                    tipoAnimal="Lagarto";
                }
                System.out.println(tipoAnimal + " Nombre: " + animales.get(i).getNombre()
                        + " Edad: " + animales.get(i).getEdad()
                        + " Género: " + animales.get(i).getGenero()
                        + " " + animales.get(i).toString()

                );
            }

        } else {
            System.out.println("El número de espacios es escaso para los animales");
        };



    }

    public static boolean comprobacionEspacios(int numeroEspacios, int numeroAnimales) {
        if (numeroAnimales> numeroEspacios*2) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<Animal> crearAnimales(int numeroEspacios, int numeroAnimales) {
        ArrayList <Animal> animal = new ArrayList<>();
        Ave ave = new Ave();
        Mamifero ma = new Mamifero();
        Reptil rep = new Reptil();
        Animal ani = new Animal();
        for (int i = 0; i < numeroEspacios ; i++) {
            int numAleatorio = (int) ani.generarNumeroAleatorio(1, NUMERO_ANIMALES);
            int numAleatorio2 = (int) ani.generarNumeroAleatorio(1, 3);
            int animalesSobrantes = numeroAnimales-numeroEspacios;
            if(i< animalesSobrantes){
                switch (numAleatorio) {
                    case 1:
                        Aguila aguila = new Aguila(ave.generarNombre(),
                                (int) ave.generarNumeroAleatorio(1, 15),
                                "Macho",
                                ave.generarNumeroAleatorio(1,2000),
                                ave.generarColorAleatorio(),
                                ave.getTipoPata()
                        );
                        Aguila aguilaH = new Aguila(ave.generarNombre(),
                                (int) ave.generarNumeroAleatorio(1, 100),
                                "Hembra",
                                ave.generarNumeroAleatorio(1,2000),
                                ave.generarColorAleatorio(),
                                ave.getTipoPata()
                        );
                        animal.add(aguila);
                        animal.add(aguilaH);
                        break;
                    case 2:
                        Canario canario = new Canario(ave.generarNombre(), (
                                int) ave.generarNumeroAleatorio(1, 15),
                                "Macho",
                                ave.generarNumeroAleatorio(1,220),
                                ave.generarColorAleatorio(),
                                ave.generartipoPataAleatorio()
                        );
                        Canario canarioH = new Canario(ave.generarNombre(), (
                                int) ave.generarNumeroAleatorio(1, 15),
                                "Hembra",
                                ave.generarNumeroAleatorio(1,220),
                                ave.generarColorAleatorio(),
                                ave.generartipoPataAleatorio()
                        );
                        animal.add(canario);
                        animal.add(canarioH);
                        break;
                    case 3:
                        Dragon dragon = new Dragon(
                                rep.generarNombre(), (int)rep.generarNumeroAleatorio(1,5000),"Macho", rep.generarNumeroAleatorio(1,4500),
                                rep.generarNumeroAleatorio(1,1000), rep.generarColorEscama()
                        );
                        Dragon dragonH = new Dragon(
                                rep.generarNombre(), (int)rep.generarNumeroAleatorio(1,5000),"Hembra", rep.generarNumeroAleatorio(1,4500),
                                rep.generarNumeroAleatorio(1,1000), rep.generarColorEscama()
                        );
                        animal.add(dragon);
                        animal.add(dragonH);

                        break;
                    case 4:
                        Lagarto lagarto = new Lagarto(
                                rep.generarNombre(), (int)rep.generarNumeroAleatorio(1,5000),"Macho", rep.generarNumeroAleatorio(1,4500),
                                rep.generarNumeroAleatorio(1,1000), rep.generarColorEscama()
                        );
                        Lagarto lagartoH = new Lagarto(
                                rep.generarNombre(), (int)rep.generarNumeroAleatorio(1,5000),"Macho", rep.generarNumeroAleatorio(1,4500),
                                rep.generarNumeroAleatorio(1,1000), rep.generarColorEscama()
                        );
                        animal.add(lagarto);
                        animal.add(lagartoH);
                        break;
                    case 5:
                        Perro perro = new Perro(
                                ma.generarNombre(), (int)ma.generarNumeroAleatorio(1,15),"Macho" ,ma.generarNumeroAleatorio(1,25),
                                ma.generarNumeroAleatorio(1,30), ma.generardietaAleatorio(), ma.generarhabitoAleatorio()
                        );
                        Perro perroH = new Perro(
                                ma.generarNombre(), (int)ma.generarNumeroAleatorio(1,15),"Hembra" ,ma.generarNumeroAleatorio(1,25),
                                ma.generarNumeroAleatorio(1,30), ma.generardietaAleatorio(), ma.generarhabitoAleatorio()
                        );
                        break;
                    case 6:
                        Gato gato = new Gato(
                                ma.generarNombre(), (int)ma.generarNumeroAleatorio(1,15),"Macho" ,ma.generarNumeroAleatorio(1,25),
                                ma.generarNumeroAleatorio(1,30), ma.generardietaAleatorio(), ma.generarhabitoAleatorio()
                        );
                        Gato gatoH = new Gato(
                                ma.generarNombre(), (int)ma.generarNumeroAleatorio(1,15),"Hembra" ,ma.generarNumeroAleatorio(1,25),
                                ma.generarNumeroAleatorio(1,30), ma.generardietaAleatorio(), ma.generarhabitoAleatorio()
                        );
                        break;

                }
            } else {
                switch (numAleatorio2) {
                    case 1:
                        Mamifero mam = ma.generarMamifero(i);
                        animal.add(mam);
                        break;
                    case 2:
                        Ave a = ave.generarAve(i);
                        animal.add(a);
                        break;
                    case 3:
                        Reptil re = rep.generarReptil(i);
                        animal.add(re);
                        break;
                }
            }

        }
        return animal;
    }
}
