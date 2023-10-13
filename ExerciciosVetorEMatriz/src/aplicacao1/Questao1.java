package aplicacao1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		//faça um programa em java para verificar se existe um elemento em um vetor de inteiros. 
		//O programa deve solicitar o valor a ser verificado e retornar se existe ou não, bem como o indice do vetor
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = {5, 10, 15, 20, 25, 30, 35};
		
		// Solicitando o valor a ser verificado
        System.out.print("Digite o valor a ser verificado: ");
        int valor = leia.nextInt();

        // Verificando se o valor existe no vetor
        boolean encontrado = false;
        int indice = -1;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
            	encontrado = true;
		        indice = i;
                break;
            }
        }

        // Exibindo o resultado
        if (encontrado) {
            System.out.println("O valor " + valor + " foi encontrado no índice " + indice + " do vetor.");
        } else {
          	System.out.println("O valor " + valor + " não foi encontrado no vetor.");
        }
        leia.close();
	}
}

