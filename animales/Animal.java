package com.adaysoft.animales;

public class Animal {
    private String nombre;
    private int edad;
    private String genero;

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String generarGenero() {
        String[] arrGenero = {"Macho", "Hembra"};
        int num = (int) (Math.random()*arrGenero.length);
        return arrGenero[num];
    };

    public double generarNumeroAleatorio(double Min, double Max){
        double numero = Math.random() * Max + Min;
        return numero;
    };


    public String generarNombre(){
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
