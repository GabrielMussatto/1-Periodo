package aplicacao;

import java.util.Scanner;

public class Matriztransposta {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][2];
        int [] vetor = new int [6];
        
        System.out.println("valores do vetor: ");
        
        for (int k = 0; k < vetor.length; k++) {
			System.out.println("digite um valor para a posição [" + k + "]");
			vetor[k] = scanner.nextInt();
		}
        for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
        
        
        System.out.println("Digite os valores da matriz 3x2:");
        
        // Leitura da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatriz original:");
        
        // Impressão da matriz original
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz transposta:");
        
        // Impressão da matriz transposta
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

