
public class ComandoForEach {

	public static void main(String[] args) {
		
		//criar um vetor e carregá-lo já inicializado
		//ler os elementos do vetor usando um ForEach
		
		int [] vetorNumeros = new int [] {1,2,3,4,5,6,7,8,9,10};
		
		//varrendo o vetor sem uso do For Each
		
		System.out.println("Varrendo o vetor sem For Each");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Nr : "+vetorNumeros[i]);			
		}
		
		System.out.println("Varrendo o vetor com For Each");
		//varrendo o vetor usando o For Each
		for (int listaNumeros : vetorNumeros) {
			System.out.println("NR : "+ listaNumeros);
			
		}
		
	}
}
