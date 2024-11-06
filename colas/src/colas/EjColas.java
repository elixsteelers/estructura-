package colas;

public class EjColas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola<String> c1 = new Cola<>();
		System.out.println(c1.Llena());
		System.out.println(c1.Vacia());
		c1.Inserta("Ana");
		c1.Inserta("Pedro");
		c1.Inserta("Rosa");
		c1.Inserta("Maria");
		System.out.println(c1.Llena());
		System.out.println(c1.Vacia());
		c1.Inserta("Luis");
		System.out.println(c1.Llena());
		c1.Inserta("Tania");
		String r="";
		if(c1.Retira()) 
			r="se retiro el primer dato de  cola";
		System.out.println(r);
		System.out.println("-----------------");
		// ejemplo cola 2
		try {
			ColaArray <String> ca=new ColaArray<String>(4);
			System.out.println(ca.first());
			ca.enqueue("Ana");
			ca.enqueue("Luis");
			ca.enqueue("Nora");
			System.out.println("La cola esta vacia " +ca.isEmpty());
			ca.enqueue("Luis");		
			System.out.println("Primer elemento " +ca.first());
			System.out.println("tam " +ca.size());
			System.out.println("Sacar elemento " +ca.dequeue());
			ca.enqueue("Nora"); // cola llena
                        c1.ImprimirCola();
		} catch(Exception e){
			System.out.print(e.getMessage());
                        
		}
		
	}

}