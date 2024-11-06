package listasimple;

class Nodo<T> {/*t generico, crea nodos que almacenan cualquier dato*/
    T dato;/*almacena el valor del nodo*/
    Nodo<T> siguiente;/*sirve para ir al siguiente nodo de la lista*/
    /*cuando se crea un nodo, se pasa un valor T dato que sera almacenado en dato y el noddo 
    "siguiente" se inicializa en null pq no hay otro elemento */
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class ListaSimple<T> {
    private Nodo<T> frente;//primer nodo de la lista
    private Nodo<T> fin;//ultimo nodo de la lista
    /*se inicializan en null pq no hay nodos*/
    public ListaSimple() {
        frente = null;
        fin = null;
    }

    public void insertaDato(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);/*se crea el nodo con valor dato*/
        if (frente == null) {/*se checa si el frente esta vacio*/
            frente = fin = nuevo;/*el nodo sera el primero en frente y en fin*/
        } else {/*si la lista no esta vacia, el nuevo nodo sera el frente*/
            nuevo.siguiente = frente;
            frente = nuevo;
        }
        System.out.println("Elemento agregado al frente.");
    }

    public void insertaFin(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);//se crea otro nodo
        if (fin == null) {/*si la lista esta vacia, el nuevo nodo sera el frente */
            frente = fin = nuevo;
        } else {/*si no esta vacia, el nodo actual en fin sera el nuevo nodo y el fin se aculiza para 
            ser el nuevo nodo*/
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        System.out.println("Elemento agregado al final.");
    }
    
    public void mostrarFrente() {
        if (frente != null) {/*si hay elementos en en frente, no esta vacia*/
            System.out.println("Frente: " + frente.dato);//se muestra
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    public void mostrarFin() {/*si hay elementos en el fin, no esta vacia */
        if (fin != null) {
            System.out.println("Fin: " + fin.dato);//se muestra
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    public void estadoActual() {
        if (frente == null) {//si esta vacia
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo<T> actual = frente;/*se crea un nodo para que nos ayude (apunta
        al frente de la lista)*/
        while (actual != null) {/*se imprime el valor almacenado en los nodso*/
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;//se avanza al siguiente nodo
        }
        System.out.println();
    }
}
