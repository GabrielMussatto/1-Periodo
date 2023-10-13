package exercicio02;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		int valor, n1 = 0, n2 = 1;
		
		System.out.println("Digite a quantidade de numeros desejados na sequência:");
		
		//criando variavel leia
		Scanner scan = new Scanner(System.in);
		valor = scan.nextInt();
		
		System.out.println(valor);
		
		if(valor == 1) {
			System.out.println("Fibonacci: "+ n1);
		}else if (valor == 2) {
			System.out.println("Fibonacci: "+ n1 + ", " + n2);
		}else {
			int aux=0;
			System.out.print("Fibonacci: "+ n1 + ", " + n2);
			for (int seq =3; seq <= valor; seq++) {
				//impressão dos dois ultimos numeros
				System.out.print(", "+(n1 + n2));
				aux = n1;
				n1 = n2;
				n2 = aux + n2;
			}
		}
		scan.close();
	}

}
