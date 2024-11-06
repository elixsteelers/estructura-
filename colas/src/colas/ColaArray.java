package colas;

public class ColaArray <E> implements Colas<E>{
	private static final int CAPACITY = 5;
	// variables de instancia
	private E[ ] data; // arreglo generico
	private int f = 0; // indice para el elemento del frente
	private int sz = 0; // numero de elementos
	
	// constructores
	// construye una cola con una capacidad default
	public ColaArray( ) {
		this(CAPACITY);
	} 
	// constructor que recibe el tamano
	public ColaArray(int capacity) { 
		data = (E[ ]) new Object[capacity]; 
		// conversión segura; el compilador puede dar una advertencia
	}
	// metodos
	/** Returna el número de elementos de la cola */
	public int size( ) { 
		return sz; 
	}
	/** Evalua si la cola esya vacia */
	public boolean isEmpty( ) { 
		return (sz == 0); 
	} 
	/** Inserta un elemento al final de la cola */
	public void enqueue(E e) throws IllegalStateException { 
		if (sz == data.length) throw new IllegalStateException("Cola Llena");
		// calcular el inidce para insertar
		int avail = (f + sz) % data.length; 
		data[avail] = e;
		sz++;
	} 
	/** Devuelve, pero no elimina, el primer elemento de la cola (nulo si está vacío)  */
	public E first( ) { 
		if (isEmpty( )) 
			return null;
		return data[f];
	} 
	/** Elimina y devuelve el primer elemento de la cola (nulo si está vacío) */
/** Elimina y devuelve el primer elemento de la cola (nulo si está vacío) */
public E dequeue( ) { 
    if (isEmpty( )) 
        return null;
    E answer = data[f];
    data[f] = null; 
    f = (f + 1) % data.length;
    sz--;
    return answer;
}
}
