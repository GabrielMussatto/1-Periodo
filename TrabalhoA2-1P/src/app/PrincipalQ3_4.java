package app;

import java.util.Scanner;

import modelo3.Aluno;

public class PrincipalQ3_4 {

	public static void main(String[] args) {
		Aluno [] vetor = new Aluno [10];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = PrincipalQ3_4.lerDados();
		}

		for (int i = 0; i < vetor.length; i++) {
			PrincipalQ3_4.imprimir(vetor[i]);
		}
		
		//Imprimindo a media da turma
		System.out.println("Media da turma: " + PrincipalQ3_4.mediaTurma(vetor));
	}
	

	public static Aluno lerDados() {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno ();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = scan.next();
		
		System.out.println("Informe a disciplina: ");
		aluno.disciplina = scan.next();
		
		System.out.println("Informe a nota da A1 desse aluno: ");
		aluno.notaA1 = scan.nextFloat();
		
		System.out.println("Informe a nota da A2 desse aluno: ");
		aluno.notaA2 = scan.nextFloat();
		
		return aluno;
	
	}
	
	public static Float media (Aluno aluno) {
		return (aluno.notaA1 + aluno.notaA2)/2;
	}
	
	public static String aprovado(Aluno aluno) {
        float media = media(aluno);
        if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
	
	public static void imprimir (Aluno aluno) {
			System.out.println("DADOS DO ALUNO");
			System.out.println("Nome: " + aluno.nome);
			System.out.println("Disciplina: " + aluno.disciplina);
			System.out.println("Nota A1: " + aluno.notaA1);
			System.out.println("Nota A2: " + aluno.notaA2);
			System.out.println("Média do aluno: " + media(aluno));
			System.out.println("O aluno esta: " + aprovado(aluno));
			System.out.println();
	}
	
	//QUESTÃO 4
	public static Float mediaTurma (Aluno[] alunos) {
		float soma=0;
		for (int i = 0; i < alunos.length; i++) {
			soma+=media(alunos[i]);
		}
		return soma / alunos.length;
	}
}
