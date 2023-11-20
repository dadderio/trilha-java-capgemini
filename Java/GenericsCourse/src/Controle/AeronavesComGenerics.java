package Controle;

import java.util.ArrayList;
import java.util.List;

public class AeronavesComGenerics<T> {
		private List<T> listaAeronaves = new ArrayList<>();
	
		public void addVoo(T nrVoo) {
			//listaAeronaves.add("3520")
			listaAeronaves.add(nrVoo);
		}
		
		public T primeiroVoo() {
			if (listaAeronaves.isEmpty()) {
				throw new IllegalStateException("List is empty");
			}
			return listaAeronaves.get(0);
		}
		
		public void listaVoos() {
			
			if (!listaAeronaves.isEmpty()) {
				System.out.println(listaAeronaves.get(0));
			}
			System.out.println("[");
			for (int i = 0; i < listaAeronaves.size(); i++) {
				System.out.println("  "+ listaAeronaves.get(i));
			}
			System.out.println("]");
		}
}
