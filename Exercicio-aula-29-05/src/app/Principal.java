package app;

import java.util.Scanner;

import modelo.Porta;

public class Principal {

	public static void main(String[] args) {
		
		Porta[] vetor = new Porta [2];
		
		for (int i = 0; i < vetor.length; i++) {
			Porta p = Principal.lerDados();
			vetor[i] = p;
			//vetor[i] = Principal.lerDados(); (mesma coisa)
		}
		
		Principal.imprimir(vetor);
	}
	
	public static void imprimir(Porta[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Nome: " + v[i].nome);
			System.out.println("Quantidade: " + v[i].quantidade);
			System.out.println("Largura: " + v[i].largura);
			System.out.println("Altura: " + v[i].altura);
			System.out.println("É de Madeira: " + v[i].ehMadeira);
			System.out.println(" ");
		}
	}

	public static Porta lerDados() {
		Scanner scan = new Scanner (System.in);
		Porta porta = new Porta();
		
		System.out.println("Informe o nome da porta? ");
		porta.nome = scan.next();
		
		System.out.println("Informe a quatidade de portas? ");
		porta.quantidade = scan.nextInt();
		
		System.out.println("Informe a largura da porta? ");
		porta.largura = scan.nextFloat();
		
		System.out.println("Informe a altura da porta? ");
		porta.altura = scan.nextFloat();
		
		System.out.println("Informe se a porta é de madeira: " 
				+ "1 - sim, 2 - não");
		int resultado = scan.nextInt();
		if (resultado == 1) {
			porta.ehMadeira = true;
		}else {
			porta.ehMadeira = false;
		}
		
		return porta;
	}
}
