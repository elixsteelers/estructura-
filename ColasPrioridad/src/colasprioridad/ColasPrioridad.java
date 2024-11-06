/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasprioridad;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ColasPrioridad {
// Clase interna para representar un elemento con prioridad
    static class Tarea implements Comparable<Tarea> {/*La clase Tarea implementa Comparable<Tarea>, 
        lo cual es necesario para que PriorityQueue pueda ordenar los elementos correctamente.*/
        String nombre;
        int prioridad;

        public Tarea(String nombre, int prioridad) {
            this.nombre = nombre;
            this.prioridad = prioridad;
        }

        /*El método compareTo está correctamente implementado para que una 
        prioridad más baja se considere mayor.*/ 
        @Override
        public int compareTo(Tarea otraTarea) {
            // La tarea con menor numero tiene mayor prioridad
             return Integer.compare(this.prioridad, otraTarea.prioridad);
        }

        @Override
        public String toString() {//imprimir la tarea de forma legible.
           return "Tarea: " + nombre + ", Prioridad: " + prioridad;
        }
    }

    public static void main(String[] args) {/*El uso de PriorityQueue garantiza que 
        las tareas se gestionen de acuerdo con su prioridad (orden natural).*/
        PriorityQueue<Tarea> colaPrioridades = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Cola con Prioridades");

        do {//menu
            System.out.println("Opciones disponibles:");
            System.out.println("1. Insertar - Agregar una tarea a la cola con prioridad");
            System.out.println("2. Retirar - Retirar la tarea de mayor prioridad");
            System.out.println("3. Mostrar - Mostrar todas las tareas en la cola");
            System.out.println("4. Salir - Salir del programa");
            System.out.print("Selecciona una opción (1-4): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Insertar
                System.out.print("Ingresa el nombre de la tarea: ");
                scanner.nextLine(); // consume linea antes de leer el nombre
                String nombre = scanner.nextLine();
                System.out.print("Ingresa la prioridad (número menor = mayor prioridad): ");
                int prioridad = scanner.nextInt();
                scanner.nextLine(); //consume linea antes de leer la prioridad

                colaPrioridades.add(new Tarea(nombre, prioridad)); // Añadir la tarea a la cola
                System.out.println("Tarea agregada: " + nombre + " con prioridad " + prioridad);
                break;
                case 2: // Retirar
                    if (!colaPrioridades.isEmpty()) {
                        Tarea tareaRetirada = colaPrioridades.poll(); /*retira y devueleve
                        la tarea con mayot prioridad*/ 
                        System.out.println("Tarea retirada: " + tareaRetirada);
                    } else {
                        System.out.println("La cola esta vacia, no hay tareas para retirar.");
                    }
                    break;

                case 3: // Mostrar
                      if (!colaPrioridades.isEmpty()) {/*garantiza el orden de prioridad
                          se muestre correctamente */
                        System.out.println("Elementos en la cola de prioridades (en orden):");
                        PriorityQueue<Tarea> colaTemporal = new PriorityQueue<>(colaPrioridades);
                        while (!colaTemporal.isEmpty()) {
                        System.out.println(colaTemporal.poll());
        
                        }
                    } else {
                        System.out.println("La cola esta vacia.");
                    }
                    break;

                case 4: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}


