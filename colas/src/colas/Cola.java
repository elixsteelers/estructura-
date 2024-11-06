/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author LENOVO
 */
class Cola<T> {
	private int Frente;
	private int Fin;
	private int Max;
	public T Dr;
	private T[] C;

	public Cola() {
		this(5);
	}

	public Cola(int Tam) {
		Max = Tam;
		Frente = Fin = -1;
		C = (T[]) new Object[Tam];
	}

	public boolean Inserta(T Dato) {
		if (Llena())
			return false;
		Fin++;
		C[Fin] = Dato;
		if (Frente == -1)
			Frente = 0;
		return true;
	}

	public boolean Retira() {
		if (Vacia())
			return false;
		Dr = C[Frente];
		C[Frente] = null;
		if (Frente == Fin)
			Frente = Fin = -1;
		else
			Frente++;
		return true;
	}

	public boolean Llena() {
		return Fin == Max - 1;
	}

	public boolean Vacia() {
		return Frente == -1;
	}
// aqui se crea un nuevo metodo para imprimir los datos de la cola sin eliminarlo
	public void ImprimirCola() {
		if (Vacia()) {//si esta vacia notifica
			System.out.println("La cola está vacía.");
			return;
		}
                /*Ciclo donde los elementos se recorren del frente hasata el fin
                y despues se imprimen los elementos que quedan o hay*/
		System.out.print("Estado actual de la cola: ");
		for (int i = Frente; i <= Fin; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println(); 
	}
}

