package org.example;

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

            default -> {
                System.out.println("Opcion invalida");
                return;
            }
        }

        double tasa = consulta.obtenerTasa(origen, destino);

        double resultado = valor * tasa;

        System.out.printf("Resultado: %.2f %s%n", resultado, destino);
        System.out.println();
    }
}