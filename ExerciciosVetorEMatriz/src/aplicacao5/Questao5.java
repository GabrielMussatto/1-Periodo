package aplicacao5;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		//Faça um programa em Java para verificar se existe um elemento em uma matriz de 
		//inteiros. O programa deve solicitar o valor a ser verificado e retornar se existe ou não, 
		//bem como o índice da matriz.
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = {
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}
		};
		
		System.out.print("Digite o valor a ser verificado: ");
	        int valor = leia.nextInt();
	        
	        boolean encontrado = false;
		    int linha = -1;
	        int coluna = -1;

	        for (int i = 0; i < matriz.length; i++) {
	        	for (int j = 0; j < matriz[i].length; j++) {
	        		if (matriz[i][j] == valor) {
	        			encontrado = true;
		                linha = i;
		                coluna = j;
		                break;
		            }
	        	}
		    }
	        
	        if (encontrado) {
	        	System.out.println("O valor " + valor + " foi encontrado na posição [" + linha + "][" + coluna + "] da matriz.");
		    } else {
		        System.out.println("O valor " + valor + " não foi encontrado na matriz.");
		    }
	        leia.close();
	}

}
