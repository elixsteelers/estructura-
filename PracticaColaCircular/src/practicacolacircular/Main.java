package practicacolacircular;

import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tam de la cola circular: ");
        int capacidad = sc.nextInt();
        ColaCircular cola = new ColaCircular(capacidad);

        int opcion;
        do {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Agregar elemento (Punto)");
            System.out.println("2. Retirar elemento");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Verificar si la cola esta vacia");
            System.out.println("5. Verificar si la cola esta llena");
            System.out.println("6. Mostrar ultimo elemento");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la coordenada x del punto: ");
                    int x = sc.nextInt();
                    System.out.print("Ingrese la coordenada y del punto: ");
                    int y = sc.nextInt();
                    Punto punto = new Punto(x, y);
                    cola.agregar(punto);
                    break;
                case 2:
                    cola.retirar();
                    break;
                case 3:
                    cola.imprimirCola();
                    break;
                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("La cola esta vacia.");
                    } else {
                        System.out.println("La cola no esta vacia.");
                    }
                    break;
                case 5:
                    if (cola.estaLlena()) {
                        System.out.println("La cola esta llena.");
                    } else {
                        System.out.println("La cola no esta llena.");
                    }
                    break;
                case 6:
                    cola.mostrarUltimoElemento();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                   
            }
        } while (opcion != 7);
    }
}