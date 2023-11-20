import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {

	public static void main(String[] args) {
		
		//construindo um arraylist para os carros
		ArrayList<String> carros = new ArrayList<>();
				
		//adicionando Carros ao arraylist
		carros.add("FLUENCE");
		carros.add("KOMBI");
		carros.add("JAGUAR");
		carros.add("BMW");
		carros.add("MERCEDES");
		carros.add("FUSCA");
		carros.add("VECTRA");
		carros.add("SANDERO");
		//mostra array
		System.out.println(carros);
		
		//SET para substituir MERCEDES por MITSUBISHI
		carros.set(4, "MITSUBISHI");
		//mostra array
		System.out.println(carros);
		
		//remover VECTRA
		carros.remove("VECTRA");
		//mostra array
		System.out.println(carros);
		
		//adicionando Carros ao arraylist com JOPtionPane
		carros.add(JOptionPane.showInputDialog("Infome a marca do carro a incluir"));
		//mostra array
		System.out.println(carros);
		/*
		//esvaziando o array;
		carros.clear();
		//mostra array
		System.out.println(carros);
				
		//verificar se o array está vazio
		if (carros.isEmpty()) {
			System.out.println("O vetor está vazio");
			*/
		
		/*System.out.println(carros.size());*/
		
		String carroPesquisado = JOptionPane.showInputDialog("Informe carro a ser pesquisado");
		
		//String carroInformado = JOptionPane.showInputDialog("Informe o carro");
	
		if(carros.contains(carroPesquisado)) {//entrou aqui, porque é verdadeiro e encontrou o carro
			//substituindo quando não se sabe a posição
			for (int i = 0; i < carros.size(); i++) {//como encontrou, vai substituir
				
				if (carroPesquisado.equals(carros.get(i))) {
					System.out.println("Encontramos o carro "+carroPesquisado+" na posição "+ carros.indexOf(carroPesquisado));
					carros.set(i, "Bugatti");
					break;//já que encontrou o item, para (break) para não continuar a pesquisa
				}
			}//for termina aqui
			
			//mostra array
			
			System.out.println(carros);
		} else { //caso contrário (não encontrou o carro, essa será a resposta do primeiro "if")
			System.out.println("não encontrei o carro " + carroPesquisado + " na lista.");
		}
	}

}
