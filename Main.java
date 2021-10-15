package com.adaysoft;

import com.adaysoft.zoo.Zoologico;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroEspacios = sc.nextInt();
        int numeroAnimales = sc.nextInt();
        Zoologico zoo = new Zoologico(numeroEspacios,numeroAnimales);
    }
}
