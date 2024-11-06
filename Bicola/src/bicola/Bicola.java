package bicola;

import java.util.ArrayDeque;
import java.util.Deque;

public class Bicola {
    public static void main(String[] args) {
        // se crea una Bbicola utilizando arrayDeque
        Deque<String> biCola = new ArrayDeque<>();

        // se insertan los datos de la cola
        biCola.addFirst("Elemento 1"); //  frente
        biCola.addLast("Elemento 2"); // final
        biCola.addFirst("Elemento 3");// frente
        biCola.addLast("Elemento 4");// final

        //mostrar los elemetos de la bicoal
        System.out.println("Elementos en la BiCola: " + biCola);

        // quitar elementos de la cola
        String retiradoFrente = biCola.removeFirst();  // quita frente
        System.out.println("Retirado del frente: " + retiradoFrente);

        String retiradoFinal = biCola.removeLast();     // quita final
        System.out.println("Retirado del final: " + retiradoFinal);

        // mostrar los elementos que quedan en la cola
        System.out.println("Elementos restantes en la BiCola: " + biCola);
    }
}

