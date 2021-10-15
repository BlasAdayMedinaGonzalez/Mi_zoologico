package com.adaysoft;

import com.adaysoft.zoo.Zoologico;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero Espacios");
        int numeroEspacios = sc.nextInt();
        System.out.println("Introduce numero Animales");
        int numeroAnimales = sc.nextInt();
        Zoologico zoo = new Zoologico(numeroEspacios,numeroAnimales);
    }
}
