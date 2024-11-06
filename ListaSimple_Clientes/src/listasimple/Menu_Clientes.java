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
public class Menu_Clientes {

    public static void main(String[] args) {
        ListaSimple<Clientes> lista = new ListaSimple<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu de contactos");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Buscar contacto por nombre");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre completo: ");
                    Object nombre = sc.nextLine();
                    System.out.print("Direccion: ");
                    Object direccion = sc.nextLine();
                    System.out.print("Telefono: ");
                    Object telefono = sc.nextLine();
                    System.out.print("Cumple: ");
                    Object fechaCumpleaños = sc.nextLine();
                    lista.insertaFin(new Clientes(nombre, direccion, telefono, fechaCumpleaños));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    Object nombreEliminar = sc.nextLine();
                    lista.eliminarPorNombre((String) nombreEliminar);
                    break;
                case 3:
                    System.out.println("Lista de contactos:");
                    lista.mostrarTodos();
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    lista.buscarPorNombre(nombreBuscar);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);

    }
}

