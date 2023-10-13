package aplicacao6;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		//faça um programa em java que verifique se uma matriz quadrada é uma matriz
		//identidade, uma matriz identidade possui os elementos da diagonal principal
		//iguais a 1 e os demais igual a 0
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da matriz quadrada: ");
        int tamanho = leia.nextInt();
        
        int[][] matriz = new int[tamanho][tamanho];
        
        System.out.println("Digite os elementos da matriz:");
	        for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	            	System.out.print("Elemento [" + i + "][" + j + "]: ");
		            matriz[i][j] = leia.nextInt();
		        }
		    }
	        
	    boolean ehMatrizIdentidade = true;

        for (int i = 0; i < tamanho; i++) {
        	for (int j = 0; j < tamanho; j++) {
	            if (i == j && matriz[i][j] != 1) {
	            	ehMatrizIdentidade = false;
		            break;
	            } else if (i != j && matriz[i][j] != 0) {
		            ehMatrizIdentidade = false;
                    break;
                }
		    }
        }
        
        if (ehMatrizIdentidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }
        leia.close();
	}

}
