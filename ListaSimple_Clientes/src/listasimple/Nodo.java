/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author LENOVO
 */

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

