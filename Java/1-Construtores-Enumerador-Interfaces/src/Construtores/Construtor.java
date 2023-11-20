package Construtores;

import java.util.Scanner;

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;


public class Construtor{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
						
		System.out.println("digite nota 1:");
		int nota1 = sc.nextInt();
		
		while(nota1<0 || nota1>10) {
			System.out.println("Nota inválida. Digite novamente: ");
			nota1 = sc.nextInt();
		}
		
		System.out.println("digite nota 2:");
		int nota2 = sc.nextInt();
		
		while(nota2<0 || nota2>10) {
			System.out.println("Nota inválida. Digite novamente: ");
			nota2 = sc.nextInt();
		}
		
		System.out.println("digite nota 3:");
		int nota3 = sc.nextInt();
		
		while(nota3<0 || nota3>10) {
			System.out.println("Nota inválida. Digite novamente: ");
			nota3 = sc.nextInt();
		}
		
		sc.close();
		
		//passando os dados através do construtor com sobrecarga
		Aluno alu = new Aluno (nota1, nota2, nota3);
		
		//calculando a média
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		//definindo situação do aluno
		if (mediaAlunoFinal < 6) {
			alu.situacaoAluno = STATUS.REPROVADO;
		}else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		//imprimindo a situação do aluno
		System.out.println("A média do aluno é: "+ alu.calcularMediaAluno()+ " e o aluno foi "+alu.situacaoAluno);
		
		//usa ENUM matrícula
		alu.situacaoMatricula = MATRICULA.MATRICULADO;
		System.out.println("O aluno está : "+ alu.situacaoMatricula);
		
	}
}
