package org.example;

public class Principal {

    public static void main(String[] args) throws Exception {

        Menu menu = new Menu();
        menu.iniciar();
        Historial.mostrar();
    }
}