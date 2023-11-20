import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
  /*
 addFirst()
 addLast()
 removeFirst()
 getFirst()
 getLast() 
  */
	LinkedList<String> cars = new LinkedList<>();
	cars.add("Volvo");
	cars.add("BMW");
	cars.add("Ford");
	System.out.println(cars);
	
	//incluindo Mazda no início OBS.: no arrayList só insere no final!
	cars.addFirst("Mazda");
	System.out.println(cars);
	
	
	//incluindo Bugatti no fim
	cars.addLast("Bugatti");
	System.out.println(cars);
	String carro = cars.get(3);
	System.out.println(carro);
	System.out.println(cars);
		
	//removendo o primeiro item
	String removeuOPrimeiro = cars.removeFirst();
	System.out.println("removeFirst() retirou o primeiro item "+ removeuOPrimeiro + " :");
	System.out.println(cars);
	
	//removendo o último item
	cars.removeLast();
	System.out.println("removeLast() retirou o último item e resultou em: "); 
	System.out.println(cars);
	
	
	//pega o primeiro getFirst()
	System.out.println(cars.getFirst());
	System.out.println(cars);
	
	//pega o último getLast()
	System.out.println(cars.getLast());
	System.out.println(cars);
	
	
	cars.clear();
	}

}
