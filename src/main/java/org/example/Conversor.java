package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversor {

    public void convertir(int opcion, double valor) throws Exception {

        ConsultaMoneda consulta = new ConsultaMoneda();

        String origen = "";
        String destino = "";

        switch (opcion) {

            case 1 -> { origen = "USD"; destino = "ARS"; }
            case 2 -> { origen = "ARS"; destino = "USD"; }
            case 3 -> { origen = "USD"; destino = "BRL"; }
            case 4 -> { origen = "BRL"; destino = "USD"; }
            case 5 -> { origen = "USD"; destino = "COP"; }
            case 6 -> { origen = "COP"; destino = "USD"; }
            case 7 -> { origen = "USD"; destino = "CLP"; }
            case 8 -> { origen = "CLP"; destino = "USD"; }

            default -> {
                System.out.println("Opcion invalida");
                return;
            }
        }

        double tasa = consulta.obtenerTasa(origen, destino);

        double resultado = valor * tasa;

        System.out.printf("Resultado: %.2f %s%n", resultado, destino);

        // Timestamp
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String registro = formato.format(ahora) + " | "
                + valor + " " + origen + " -> "
                + resultado + " " + destino;

        Historial.agregar(registro);
    }
}