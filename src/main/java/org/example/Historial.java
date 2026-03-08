package org.example;

import java.util.ArrayList;
import java.util.List;

public class Historial {

    private static List<String> historial = new ArrayList<>();

    public static void agregar(String registro) {
        historial.add(registro);
    }

    public static void mostrar() {

        if (historial.isEmpty()) {
            System.out.println("No hay conversiones registradas.");
            return;
        }

        System.out.println("\nHistorial de conversiones:");

        for (String registro : historial) {
            System.out.println(registro);
        }

        System.out.println();
    }
}