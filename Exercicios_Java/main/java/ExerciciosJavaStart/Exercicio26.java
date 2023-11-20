
package ExerciciosJavaStart;

import java.util.Scanner;

public class Exercicio26 {

    /*26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
    Caso o usuário digite um número que não esteja neste intervalo, exibir a 
    seguinte mensagem: número inválido;*/
 
    public static void main(String[] args) {
   
        
        char desejaContinuar = 'S';
    
        Scanner leitor = new Scanner (System.in);
    
        while(desejaContinuar=='S' || desejaContinuar=='s'){
                
                int numero;
                System.out.println("Digite um numero de 1 a 5 ");
                numero = leitor.nextInt();

                    switch (numero){

                        case 1: 
                            System.out.println("um");
                            break;
                        case 2:
                            System.out.println("dois");
                            break;
                        case 3:
                            System.out.println("três");
                            break;
                        case 4:
                            System.out.println("quatro");
                            break;
                        case 5:
                            System.out.println("cinco");
                            break;
                        default:
                            System.out.println("Número inválido!");
                    }
            System.out.println("Digite S para continuar ou N para sair");
            desejaContinuar = leitor.next().charAt(0);
        }
        
    }
            
}
