package aplicacao2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		//faça um programa em java para calcular a media de um vetor de inteiros. 
		//Leia os numeros do vetor (tamanho 5) e, apos a leitura, apresente a media
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		System.out.println("Informe os números do vetor");

        for (int i = 0; i < vetor.length; i++) {
        	System.out.print("Número " + (i + 1) + ": ");
        	vetor[i] = leia.nextInt();
	    }
        
        int soma = 0;
        	for (int i = 0; i < vetor.length; i++) {
		        soma += vetor[i];
	        }
        
        double media = (double) soma / vetor.length;
        
        System.out.println("A média dos números do vetor é: " + media);
        leia.close();
	}

}
