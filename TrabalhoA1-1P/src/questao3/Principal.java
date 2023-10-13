package questao3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String aluno, melhorAluno = null, piorAluno = null;
		Float nota, melhorNota = 0f, piorNota = 0f;
		for (int cont = 1; cont <= 4; cont++) {
			System.out.println("Informe o nome do " + cont + "º aluno: ");
			aluno = scan.next();
			System.out.println("Informe a nota do " + cont + "º aluno: ");
			nota = scan.nextFloat();
			if(cont==1) {
				melhorAluno = aluno;
				piorAluno = aluno;
				melhorNota = nota;
				piorNota = nota;
			}else{if(nota > melhorNota) {
					melhorNota = nota;
					melhorAluno = aluno;
				}if(nota < piorNota) {
					piorNota = nota;
					piorAluno = aluno;
				}
			}
		}
		System.out.println("O(A) aluno(a) " + melhorAluno + " tirou " + melhorNota + " sendo a melhor nota");
		System.out.println("O(A) aluno(a) " + piorAluno + " tirou " + piorNota + " sendo a pior nota");
	
	}

}
