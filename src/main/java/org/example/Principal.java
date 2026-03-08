package org.example;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {

        Gson gson = new Gson();

        String json = "{\"nombre\":\"Daniel\",\"edad\":25}";

        Persona persona = gson.fromJson(json, Persona.class);

        System.out.println(persona.nombre);
    }
}

class Persona {
    String nombre;
    int edad;
}