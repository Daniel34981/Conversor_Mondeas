# Conversor de Monedas en Java

Este proyecto es un **Conversor de Monedas desarrollado en Java** que consume una API de tasas de cambio para convertir valores entre distintas monedas en tiempo real.

Fue desarrollado como parte del **Challenge de Java del programa Oracle Next Education (ONE) - Alura Latam**.

---

## Funcionalidades

El programa permite convertir entre las siguientes monedas:

- USD → ARS (Dólar a Peso argentino)
- ARS → USD
- USD → BRL (Dólar a Real brasileño)
- BRL → USD
- USD → COP (Dólar a Peso colombiano)
- COP → USD

El usuario puede seleccionar la opción deseada desde un menú interactivo en consola e ingresar el valor que desea convertir.

---

## Tecnologías utilizadas

- Java 23
- HttpClient (Java HTTP API)
- Gson
- Gradle
- ExchangeRate API

---

## Estructura del proyecto

```json
src
 └─ main
     └─ java
         └─ org.example
             ├─ ConsultaMoneda.java
             ├─ Conversor.java
             ├─ Menu.java
             └─ Principal.java
```

## API utilizada

Este proyecto utiliza la API pública:

https://www.exchangerate-api.com/

Endpoint utilizado:


La API devuelve una respuesta en formato JSON con la tasa de conversión.

Ejemplo:

```json
{
 "result":"success",
 "base_code":"USD",
 "target_code":"COP",
 "conversion_rate":4020.53
}
```

