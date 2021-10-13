package com.adaysoft.animales;

public class Animal {
    private String nombre;
    private int edad;

    public enum genero {
        Macho,
        Hembra
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static genero generarGenero() {
        genero[] generoGenerado = {genero.Macho, genero.Hembra};
        int num = (int) (Math.random()*generoGenerado.length);
        return generoGenerado[num];
    };


    public static String generarNombre(){
        String[] name = {"Tifón",
                "El bicho",
                "Mango",
                "Piña",
                "Juan",
                "Yasuo",
                "Misifú",
                "Bobon",
                "Rantanplán",
                "Harambe",
                "Chimuelo",
                "Yogu",
                "Petisuí",
                "Brego",
                "Eren YEGA",
                "Tora",
                "Yumeko",
                "Bley",
                "Marco",
                "Chiquito",
                "Carajito",
                "Iniesta",
                "Mikasa"
        };
        int num = (int) (Math.random()*name.length);
        return name[num];
    }


}
