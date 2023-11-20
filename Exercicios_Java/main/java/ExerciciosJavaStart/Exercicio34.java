package ExerciciosJavaStart;

import java.util.Scanner;

/*34. Elabore um algoritmo que, dada a idade de um nadador. 
 * Classifique-o em uma das seguintes categorias:
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. Sênior = 18 - 25 anos.
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;*/

public class Exercicio34 {
	public static void main(String[] args) {
		
	int idade;
	Scanner leitor = new Scanner (System.in);


	System.out.println("Informe a sua idade");
	idade = leitor.nextInt();
		
	
		if(idade >=5 && idade <=7) {
			System.out.println("Infantil A = 5 - 7 anos");
		}else {
			if(idade >=8 && idade <=10) {
				System.out.println("Infantil B = 8 - 10 anos");
			}else {
				if(idade >=11 && idade <=13) {
					System.out.println("Juvenil A = 11- 13 anos");
				}else {
					if(idade >=14 && idade <=17) {
						System.out.println("Juvenil B = 14 - 17 anos");
					}else {
						if(idade >=18 && idade <=25) {
							System.out.println("Sênior = 18 - 25 anos");
						}else {
							System.out.println("idade fora da faixa etária");
						}
					}
				}
			}
		}
	
	}
}
