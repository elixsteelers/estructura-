package listasimple;


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
            System.out.println("La lista esta vacia.");
        }
    }

    public void mostrarFin() {/*si hay elementos en el fin, no esta vacia */
        if (fin != null) {
            System.out.println("Fin: " + fin.dato);//se muestra
        } else {
            System.out.println("La lista esta vacia.");
        }
    }

    public void estadoActual() {
        if (frente == null) {//si esta vacia
            System.out.println("La lista esta vacia.");
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
    ////////////////////////////////////////////////////////////////////////////
    public void eliminarPorNombre(String nombre) {
        if (frente == null) {//se comprueba si esta vacia
            System.out.println("La lista esta vacia.");
            return;
        }
        
        Nodo<T> actual = frente;// se va al frente 
        Nodo<T> anterior = null;//se va al nodo anteior

        while (actual != null) {/*Se recorre la lista nodo por nodo hasta que se 
            encuentre un cliente con el nombre del que se quiere eliminar. 
            La comparación se realiza con el método equals(), que compara cadenas de texto.*/
            Clientes cliente = (Clientes) actual.dato;
            if (cliente.nombre.equals(nombre)) {
                if (anterior == null) {/*si el nodo anterior es null significa que estamos en el 
                    primer elemento. Se actualiza el frente para que apunte al siguiente nodo, eliminando el primero*/
                    frente = actual.siguiente;
                } else {/*Si no es el primero, se despega de el nodo actual 
                    haciendo que el nodo anterior apunte al nodo que sigue a actual.*/
                    anterior.siguiente = actual.siguiente;
                }
                if (actual == fin) {/*si el nodo que se está eliminando es el 
                    último nodo, también se actualiza fin para que apunte al anterior.*/
                    fin = anterior;
                }
                System.out.println("Contacto eliminado: " + nombre);
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }

        System.out.println("Contacto no encontrado.");
    }

    // Mostrar todos los contactos
    public void mostrarTodos() {
        if (frente == null) {
            System.out.println("La lista esta vacia.");
            return;
        }

        Nodo<T> actual = frente;
        while (actual != null) {//Si la lista no esta vacia, se recorre nodo por nodo desde el frente hasta el ultimo nodo. 
            System.out.println(actual.dato.toString());
            System.out.println("-------------------------");
            actual = actual.siguiente;
        }
    }

    // Buscar por nombre
    public void buscarPorNombre(String nombre) {/*Si la lista tiene elementos, 
        se recorre nodo por nodo hasta encontrar un cliente cuyo nombre coincida con el nombre proporcionado.*/
        if (frente == null) {
            System.out.println("La lista esta vacia.");
            return;
        }

        Nodo<T> actual = frente;
        while (actual != null) {
            Clientes cliente = (Clientes) actual.dato;
            if (cliente.nombre.equals(nombre)) {
                System.out.println(cliente.toString());
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Contacto no encontrado.");
    }
}

