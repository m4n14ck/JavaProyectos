package com.calculadora_app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            mostrarMenu();

            try {
                int opcion = Integer.parseInt(sc.nextLine());

                if (opcion == 0) {
                    limpiarPantalla();
                    System.out.println("Fin del programa");
                    sc.close();
                    break; // Sale del while
                }

                ejecutarOperacion(opcion, sc);

            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }

            System.out.println(); // Espacio entre operaciones
        }
    }

    private static void mostrarMenu() {
        System.out.println("Aplicación Calculadora :D\n");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                0. Salir
                """);
        System.out.print("Elija una opción: ");
    }

    private static void ejecutarOperacion(int opcion, Scanner consola) {
        switch (opcion) {
            case 1:
                limpiarPantalla();
                System.out.print("\nDigite un valor para Sumar: ");
                int suma1 = Integer.parseInt(consola.nextLine());
                System.out.print("\nDigite otro valor para Sumar: ");
                int suma2 = Integer.parseInt(consola.nextLine());
                System.out.println("\nResultado: " + (suma1 + suma2));
                break;

            case 2:
                limpiarPantalla();
                System.out.print("\nDigite un valor para Restar: ");
                int resta1 = Integer.parseInt(consola.nextLine());
                System.out.print("\nDigite otro valor para Restar: ");
                int resta2 = Integer.parseInt(consola.nextLine());
                System.out.println("\nResultado: " + (resta1 - resta2));
                break;

            case 3:
                limpiarPantalla();
                System.out.print("\nDigite un valor para Multiplicar: ");
                int multi1 = Integer.parseInt(consola.nextLine());
                System.out.print("\nDigite otro valor para Multiplicar: ");
                int multi2 = Integer.parseInt(consola.nextLine());
                System.out.println("\nResultado: " + (multi1 * multi2));
                break;

            case 4:
                limpiarPantalla();
                System.out.print("\nDigite un valor para Dividir: ");
                int div1 = Integer.parseInt(consola.nextLine());
                System.out.print("\nDigite otro valor para Dividir: ");
                int div2 = Integer.parseInt(consola.nextLine());

                if (div2 == 0) {
                    System.out.println("¡Error! No se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + (div1 / div2));
                }
                break;

            default:
                System.out.println("Por favor, digite un número dentro del rango válido.");
        }
    }

    private static void limpiarPantalla() {
        try {
            // Limpiar pantall si el SO es windows y si se esta en cmd o powershell
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
            // Por si se utiliza alguna distro de Linux
                System.out.print("\033[H\033[2J");  
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla.");
        }
    }

}
