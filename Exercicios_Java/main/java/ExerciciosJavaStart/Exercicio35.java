package ExerciciosJavaStart;
import java.util.Scanner;

/*Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. 
 * Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.*/

public class Exercicio35 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int tipoDeCliente;
		float consumo;
		
		System.out.println("Digite a opção abaixo: ");
		System.out.println("1 para Cliente Residencial");
		System.out.println("2 para Cliente Comercial");
		System.out.println("3 para Cliente Industrial");
		tipoDeCliente = leitor.nextInt();
					
		switch (tipoDeCliente) {
		
		case 1: 
			System.out.println("Tarifa residencial: R$ 0,60 KW/h");
			System.out.println("Informe o consumo KW/h");
			consumo = leitor.nextFloat();
			System.out.println("Valor a pagar pelo consumo de "+consumo+" KW/h: R$ "+(consumo*0.6));
			break;
		
		case 2: 
			System.out.println("Tarifa comercial: R$ 0,48 KW/h");
			System.out.println("Informe o consumo KW/h");
			consumo = leitor.nextFloat();
			System.out.println("Valor a pagar pelo consumo de "+consumo+" KW/h: R$ "+(consumo*0.48));
			break;
		
		case 3:
			System.out.println("Tarifa comercial: R$ 1,29 KW/h");
			System.out.println("Informe o consumo KW/h");
			consumo = leitor.nextFloat();
			System.out.println("Valor a pagar pelo consumo de "+consumo+" KW/h: R$ "+(consumo*1.29));
			break;
		
			default:
				System.out.println("Número inválido");
				
		}
		
		
	}

}
