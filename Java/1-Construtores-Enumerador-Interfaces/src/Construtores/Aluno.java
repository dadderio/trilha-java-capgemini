package Construtores;

public class Aluno {
		private double nota1;
		private double nota2;
		private double nota3;
		STATUS situacaoAluno;
		MATRICULA situacaoMatricula;
		
		//CONSTRUTOR com sobrecarga porque tem 3 parâmetros
		public Aluno(double nota1, double nota2, double nota3) {
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
		}
		
		public enum MATRICULA{
			MATRICULADO,
			PENDENTE,
			RECUSADO
		}
		
		//DEFININDO UM ENUMERADOR
		public enum STATUS {
			APROVADO,
			REPROVADO
		}
		
		//MÉTODO PARA CALCULAR MÉDIA DO ALUNO
		public double calcularMediaAluno() {
			double mediaAluno = 0;
			//cálculo da média
			mediaAluno = ((this.nota1+this.nota2+this.nota3)/3);
			//System.out.println("A média do aluno é: "+ mediaAluno + " e o aluno foi "+ );
			return mediaAluno;
			
		}
}
