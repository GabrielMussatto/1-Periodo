package aplicacao3;

public class Questao3 {

	public static void main(String[] args) {
		//Faça um programa em Java para encontrar o maior valor em um vetor de inteiros. 
		//Crie um vetor com 10 números, imprima no console todos os valores e, em seguida, o 
		//maior valor.
		
		int[] vetor = {30, 10, 2, 8, 15, 7, 3, 12, 9, 6};
		
		System.out.println("Valores do vetor:");
			for (int i = 0; i < vetor.length; i++) {
				System.out.print(vetor[i] + " ");
		    }
		
		int maiorValor = vetor[0];
	        for (int i = 1; i < vetor.length; i++) {
	            if (vetor[i] > maiorValor) {
	            	maiorValor = vetor[i];
		        }
		    }
	    
	    System.out.println("\n\nMaior valor no vetor: " + maiorValor);

	}

}
