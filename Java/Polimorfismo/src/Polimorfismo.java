
public class Polimorfismo {
	
	public static void main(String[] args) {
		
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diária leite do Elefante é "+ mamifero1.cotaDiariaLeite());
		
		Mamifero mamifero2 = new Rato();
		System.out.println("Cota diária leite do Rato é "+ mamifero2.cotaDiariaLeite());
	}

}
