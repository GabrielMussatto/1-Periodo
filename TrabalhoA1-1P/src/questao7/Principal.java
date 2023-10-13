package questao7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int valor, fatorial = 1;
		System.out.println("Informe um valor inteiro para saber o seu fatorial: ");
		valor = scan.nextInt();
		while(valor>0) {
			fatorial = fatorial * valor;
			valor--;
		}
		System.out.println("O fatorial do numero informado é: " + fatorial);
	}

}
