package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConsultaMoneda {

    //private String apiKey = "a01e768d2257ae3db3dfddcd";
    private String apiKey = System.getenv("API_KEY");

    public double obtenerTasa(String monedaOrigen, String monedaDestino)
            throws IOException, InterruptedException {

        String url = "https://v6.exchangerate-api.com/v6/"
                + apiKey
                + "/pair/"
                + monedaOrigen
                + "/"
                + monedaDestino;

        // Cliente HTTP
        HttpClient cliente = HttpClient.newHttpClient();

        // Solicitud HTTP
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // Respuesta HTTP
        HttpResponse<String> respuesta = cliente.send(
                solicitud,
                HttpResponse.BodyHandlers.ofString()
        );

        // JSON → Gson
        JsonElement elemento = JsonParser.parseString(respuesta.body());
        JsonObject objectRoot = elemento.getAsJsonObject();

        String resultado = objectRoot.get("result").getAsString();

        if (!resultado.equals("success")) {
            throw new RuntimeException("Error consultando la API");
        }

        // Obtener tasa
        double tasa = objectRoot.get("conversion_rate").getAsDouble();

        return tasa;
    }
}