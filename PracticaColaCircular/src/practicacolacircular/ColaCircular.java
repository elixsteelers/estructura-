
package practicacolacircular;

import java.util.Scanner;

public class ColaCircular {
    private Punto[] cola;/*carreglo de enteros que almacena los elemtentos de la cola circular*/
    private int frente, fin, tam;/*frente: es el indidice del primer elemento en la cola
    frente: es el indice del primer elemento de la cola
    fin: es el indice del ultimo elemento en la cola
    tam: es la capacidad maxima de la cola*/

    public ColaCircular(int capacidad) {/*este construcutor inicializa la cola con una capaidad dada 
        y ajusta los valores de frente y fin a-1, lo qu eindica que la cola esta vacia*/
        cola = new Punto[capacidad];
        frente = -1;
        fin = -1;
        tam= capacidad;
    }

    public boolean estaLlena() {/*si la cola esta llena, hay dos condiciones, que son, el frente esta en el indice 0
        y el fin en el ultimo indice del arreglo (significa que todoslso espacios eestan ocupados)
        el indice del frente es el siguiente al indidce del fin (en la estructura circular, el fin alcanzo al frente)*/
        return (frente == 0 && fin == tam - 1) || (frente == fin + 1);
    }

    public boolean estaVacia() {/*verifica si la cola esta vacia. esto sucede cuando frente esta en -1, ya que indica
        que no se ha agregado ningun elemento o qu etodos fueron eliminados*/
        return frente == -1;
    }

    public void agregar(Punto elemento) {/*este metodo arega un nuevo elemento a la cola. antes de que se agregue, verifica
        si la cola esta llena*/
        if (estaLlena()) {
            System.out.println("La cola esta llena, no se puede agregar el elemento.");
            return;
        }//si no esta llena hace lo siguiente 
        if (frente == -1) frente = 0;/*si la cola estaba vacia (frente==-1)
        ajsuta el indice del frente 0*/
        fin = (fin + 1) % tam;/**actualiza el indice del fin utilizando la operacion de modulo (%)
         para asegurarse de que sea circular, es decir, que vuela al inicio del arreglo cuando llegue al final*/
        cola[fin] = elemento;//coloca el nuevo elemento en el indice fin
        System.out.println("Elemento " + elemento + " agregado a la cola.");
    }

    public void retirar() {/*este metodo elimina el pirmer elemtno de la cola (el elemento en la posicion frente). Antes de retiraro, pide
        confirmacion*/
        if (estaVacia()) {
            System.out.println("La cola esta vacia, no se puede retirar ningun elemento.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Desea retirar el elemento " + cola[frente] + "? (S/N)");
        String confirmacion = sc.nextLine();

        if (confirmacion.equalsIgnoreCase("S")) {/*s eelimina el elemento y ajusta el indice del frente
            si el frente y el fin son iguales, significa qu la cola quedo vacia, po rlo que ambos se reinician a-1*/
            System.out.println("Elemento " + cola[frente] + " retirado de la cola.");
            if (frente == fin) {  // La cola queda vacía
                frente = -1;
                fin = -1;
            } else {
                frente = (frente + 1) % tam;
            }
        } else {/*si no, el frente se mueve al siguiente indicide usando la operacio modulo*/
            System.out.println("Operacion de retiro cancelada.");
        }
    }

    public void imprimirCola() {/*este metodo impirme todos los elementos presentes en la cola ciruclar, desde el indice frente hasta el indice fin
        utiliza un ciclo que avanza de forma cicular, respetando los limites dle arreglo mediante el uso de la opercacion de modulo*/
        if (estaVacia()) {
            System.out.println("La cola esta vacia.");
            return;
        }
        System.out.println("Elementos en la cola:");
        int i = frente;
        while (true) {
            System.out.print(cola[i] + " ");
            if (i == fin) break;
            i = (i + 1) % tam;
        }
        System.out.println();
    }

    public void mostrarUltimoElemento() {/*este metodo muetsra el ultimo elemento en la cola, el cual esta en la posicion del indice fin 
        si la cola esta vacia, notifica al usuario */
        if (estaVacia()) {
            System.out.println("La cola esta vacia.");
        } else {
            System.out.println("El ultimo elemento en la cola es: " + cola[fin]);
        }
    }
}
