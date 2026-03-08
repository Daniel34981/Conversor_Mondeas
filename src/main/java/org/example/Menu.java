package org.example;

import java.util.Scanner;

public class Menu {

    public void iniciar() throws Exception {

        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        int opcion = 0;

        while (opcion != 7) {

            System.out.println("""
*************************************************
Sea bienvenido/a al Conversor de Moneda

1) Dolar ==> Peso argentino
2) Peso argentino ==> Dolar
3) Dolar ==> Real brasileno
4) Real brasileno ==> Dolar
5) Dolar ==> Peso colombiano
6) Peso colombiano ==> Dolar
7) Salir

Elija una opcion valida:
*************************************************
""");

            opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.println("Ingrese el valor que desea convertir:");
            double valor = scanner.nextDouble();

            conversor.convertir(opcion, valor);
        }

    }
}
