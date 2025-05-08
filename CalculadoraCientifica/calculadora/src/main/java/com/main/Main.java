package com.main;

import com.main.CalculadoraCientifica;
import com.main.CLIDisplay;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraCientifica calc = new CalculadoraCientifica();
        CLIDisplay.printBanner();

        while (true) {
            CLIDisplay.printMenu();
            int choice;
            
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                clearScreen();
                System.out.println("Por favor, introduzca un número válido.");
                continue;
            }

            if (choice == 0) {
                clearScreen();
                System.out.println("Finalizando el programa... ¡Gracias por utilizar la calculadora!");
                break;
            }

            double a, b, result = 0;
            boolean error = false;

            try {
                switch (choice) {
                    case 1: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca el primer número: ");
                                a = scanner.nextDouble();
                                System.out.print("Por favor, introduzca el segundo número: ");
                                b = scanner.nextDouble();
                                result = calc.add(a, b);
                                
                                System.out.println("\nEl resultado es: " + result);
                                System.out.print("¿Desea volver a hacer una suma? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                } 
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                clearScreen();
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }

                    case 2: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca el primer número: ");
                                a = scanner.nextDouble();
                                System.out.print("Por favor, introduzca el segundo número: ");
                                b = scanner.nextDouble();
                                result = calc.subtract(a, b);
                                
                                System.out.println("\nEl resultado es: " + result);
                                System.out.print("¿Desea volver a hacer una resta? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                clearScreen();
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    case 3: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca el primer número: ");
                                a = scanner.nextDouble();
                                System.out.print("Por favor, introduzca el segundo número: ");
                                b = scanner.nextDouble();
                                result = calc.multiply(a, b);
                                
                                System.out.println("\nEl resultado es: " + result);
                                System.out.print("¿Desea volver a hacer una multiplicación? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    case 4: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca el dividendo: ");
                                a = scanner.nextDouble();
                                System.out.print("Por favor, introduzca el divisor: ");
                                b = scanner.nextDouble();
                                result = calc.divide(a, b);
                                
                                System.out.println("\nEl resultado es: " + result);
                                System.out.print("¿Desea volver a hacer una división? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            } catch (ArithmeticException e) {
                                System.out.println("Error matemático: " + e.getMessage());
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    case 5: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca la base: ");
                                a = scanner.nextDouble();
                                System.out.print("Por favor, introduzca el exponente: ");
                                b = scanner.nextDouble();
                                result = calc.power(a, b);
                                
                                System.out.println("\nEl resultado es: " + result);
                                System.out.print("¿Desea volver a calcular una potencia? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            } catch (ArithmeticException e) {
                                System.out.println("Error matemático: " + e.getMessage());
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    case 6: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca el número para calcular su raíz cuadrada: ");
                                a = scanner.nextDouble();
                                result = calc.sqrt(a);
                                
                                System.out.println("\nEl resultado es: " + result);
                                System.out.print("¿Desea volver a calcular una raíz cuadrada? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            } catch (ArithmeticException e) {
                                System.out.println("Error matemático: " + e.getMessage());
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    case 7: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca los grados para calcular el seno: ");
                                a = scanner.nextDouble();
                                result = calc.sin(a);
                                
                                System.out.printf("El seno de %.2f° es: %.2f\n", a, result); 
                                System.out.print("¿Desea volver a calcular un seno? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    case 8: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca los grados para calcular el coseno: ");
                                a = scanner.nextDouble();
                                result = calc.cos(a);
                                
                                System.out.printf("El coseno de %.2f° es: %.2f\n", a, result); // ✅ Correcto
                                System.out.print("¿Desea volver a calcular un coseno? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    case 9: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca los grados para calcular la tangente: ");
                                a = scanner.nextDouble();
                                result = calc.tan(a);
                                
                                System.out.printf("\nEl resultado es %.3f\n ", result);
                                System.out.print("¿Desea volver a calcular una tangente? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            } catch (ArithmeticException e) {
                                System.out.println("Error matemático: " + e.getMessage());
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    case 10: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca el número para calcular su logaritmo base 10: ");
                                a = scanner.nextDouble();
                                result = calc.log(a);
                                
                                System.out.printf("\nEl resultado es %.3f\n " , result);
                                System.out.print("\n¿Desea volver a calcular un logaritmo base 10? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            } catch (ArithmeticException e) {
                                System.out.println("Error matemático: " + e.getMessage());
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    case 11: {
                        while(true) {
                            clearScreen();
                            try {
                                System.out.print("Por favor, introduzca el número para calcular su logaritmo natural: ");
                                a = scanner.nextDouble();
                                result = calc.ln(a);
                                
                                System.out.printf("\nEl resultado es %.3f\n ", result);
                                System.out.print("\n¿Desea volver a calcular un logaritmo natural? (s/n): ");
                                char continuar = scanner.next().toLowerCase().charAt(0);
                                
                                if(continuar != 's') {
                                    break;
                                }
                            } catch (InputMismatchException e) {
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("Error: Debe ingresar un número válido.");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            } catch (ArithmeticException e) {
                                System.out.println("Error matemático: " + e.getMessage());
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                            }
                        }
                        break;
                    }
                    default: {
                        clearScreen();
                        System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                        error = true;
                    }
                }

                clearScreen();
                CLIDisplay.printBanner();
                    
            } catch (ArithmeticException e) {
                System.out.println("Se ha producido un error: " + e.getMessage());
                System.out.println("Presione Enter para continuar...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}