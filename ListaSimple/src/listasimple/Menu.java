/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Menu {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        Scanner sc = new Scanner(System.in);
        int opcion, dato;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Agregar elementos al Frente");
            System.out.println("2. Agregar elementos al Final");
            System.out.println("3. Mostrar Frente");
            System.out.println("4. Mostrar Fin");
            System.out.println("5. Mostrar todos los elementos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a agregar al frente: ");
                    dato = sc.nextInt();
                    lista.insertaDato(dato);
                    break;
                case 2:
                    System.out.print("Ingrese el dato a agregar al final: ");
                    dato = sc.nextInt();
                    lista.insertaFin(dato);
                    break;
                case 3:
                    lista.mostrarFrente();
                    break;
                case 4:
                    lista.mostrarFin();
                    break;
                case 5:
                    lista.estadoActual();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);

        sc.close();
    }

}
