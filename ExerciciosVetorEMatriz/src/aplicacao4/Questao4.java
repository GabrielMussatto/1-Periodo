package aplicacao4;

import java.util.Arrays;

public class Questao4 {

	public static void main(String[] args) {
		//Faça um programa em Java para ordenar os valores de um vetor de inteiros. O 
		//programa deve imprimir os valores iniciais e os valores ordenados.
		
		int[] vetor = {5, 10, 2, 8, 15, 7, 3, 12, 9, 6};
		
		System.out.println("Valores iniciais do vetor:");
			for (int i = 0; i < vetor.length; i++) {
		        System.out.print(vetor[i] + " ");
	        }
		// Ordenação do vetor
        Arrays.sort(vetor);
        
        System.out.println("\n\nValores ordenados do vetor:");
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print(vetor[i] + " ");
	        }
	}

}
