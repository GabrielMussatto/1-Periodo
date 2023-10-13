package aplicacao;

import modelo.Aluno;

public class Aula1505 {


	public static void main(String[] args) {
		
		Aluno[] vetAluno = new Aluno[3];
		
		//Aluno a1 = new Aluno();
		//a1.nome = "Joao";
		//a1.idade = 17;
		
		//vetAluno[0] = a1;
		
		
		vetAluno[0] = new Aluno();
		vetAluno[0].nome = "Silvano";
		vetAluno[0].idade = 32;
		
		vetAluno[1] = new Aluno();
		vetAluno[1].nome = "Leandra";
		vetAluno[1].idade = 17;
		
		vetAluno[2] = new Aluno();
		vetAluno[2].nome = "Fredson";
		vetAluno[2].idade = 25;
		
		System.out.println("Imprimindo todos os alunos.");
		for (int i = 0; i < vetAluno.length; i++) {
			System.out.println("Nome: " + vetAluno[i].nome);
			System.out.println("Idade: " + vetAluno[i].idade);
		}
		
		System.out.println("\nImprimindo somente os maiores de idade.");
		for (int i = 0; i < vetAluno.length; i++) {
			if (vetAluno[i].idade >= 18) {
				System.out.println("Nome: " + vetAluno[i].nome);
				System.out.println("Idade: " + vetAluno[i].idade);
			}
		}
	}

}
