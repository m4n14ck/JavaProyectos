package com.main;

public class CLIDisplay {

    public static void printBanner() {
        System.out.println("======================================================================================");
        System.out.println(" ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ██████╗  ██████╗ ██████╗  █████╗ ");
        System.out.println("██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗██╔══██╗██╔═══██╗██╔══██╗██╔══██╗");
        System.out.println("██║     ███████║██║     ██║     ██║   ██║██║     ███████║██║  ██║██║   ██║██████╔╝███████║");
        System.out.println("██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║██║  ██║██║   ██║██╔══██╗██╔══██║");
        System.out.println("╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║██████╔╝╚██████╔╝██║  ██║██║  ██║");
        System.out.println(" ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝");
        System.out.println("                                                                                      ");
        System.out.println("            ██████╗██╗███████╗███╗   ██╗████████╗██╗███████╗██╗ ██████╗ █████╗        ");
        System.out.println("           ██╔════╝██║██╔════╝████╗  ██║╚══██╔══╝██║██╔════╝██║██╔════╝██╔══██╗       ");
        System.out.println("           ██║     ██║█████╗  ██╔██╗ ██║   ██║   ██║█████╗  ██║██║     ███████║       ");
        System.out.println("           ██║     ██║██╔══╝  ██║╚██╗██║   ██║   ██║██╔══╝  ██║██║     ██╔══██║       ");
        System.out.println("           ╚██████╗██║███████╗██║ ╚████║   ██║   ██║██║     ██║╚██████╗██║  ██║       ");
        System.out.println("            ╚═════╝╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚═╝╚═╝     ╚═╝ ╚═════╝╚═╝  ╚═╝       ");
        System.out.println("======================================================================================");
    }
    
    public static void printMenu() {
        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║            Seleccione una operación                ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║  1. Sumar              │  2. Restar                ║");
        System.out.println("║  3. Multiplicar        │  4. Dividir               ║");
        System.out.println("║  5. Potencia           │  6. Raíz Cuadrada         ║");
        System.out.println("║  7. Seno               │  8. Coseno                ║");
        System.out.println("║  9. Tangente           │ 10. Logaritmo             ║");
        System.out.println("║ 11. Logaritmo Natural  │  0. Salir                 ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
        System.out.print("Opción: ");
    }
    
}
