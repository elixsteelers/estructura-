package colas;

public interface Colas<E> {
	/** Retura el número de elementos de la cola*/
	int size( );
	/** evalua si la pila esta vacia */
	boolean isEmpty( );
	/** Inserta un elemento en la pila */
	void enqueue(E e);
	/** retorna pero no remueve el primer elemento de la cola */
	E first( );
	/** elimina y retorna el primer elemeto de la cola (si no esta vacia). */
	E dequeue( );
}
