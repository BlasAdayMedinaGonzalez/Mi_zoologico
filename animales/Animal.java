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

    public Animal() {
    }

    public static genero generarGenero() {
        genero[] generoGenerado = {genero.Macho, genero.Hembra};
        int num = (int) (Math.random()*generoGenerado.length);
        return generoGenerado[num];
    };

    public double generarNumeroAleatorio(double Min, double Max){
        double numero = Math.random() * Max + Min;
        return numero;
    };


    public static String generarNombre(){
        String[] names = {"Tifón",
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
        int num = (int) (Math.random()*names.length);
        return names[num];
    }


}
