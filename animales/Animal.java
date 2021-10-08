package com.adaysoft.animales;

abstract class Animal {
    private String nombre;
    private int edad;
    private String genero;

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public  Animal (){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    abstract void mostrarInformacion();

    public static  String generarNombre(){
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
        int num = (int) (Math.random()*23);
        return name[num];
    }

}
