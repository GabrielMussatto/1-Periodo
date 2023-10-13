package questao6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Float area, pi = 3.14f , raio;
		System.out.println("Informe o tamanho do raio do circulo: ");
		raio = scan.nextFloat();
		area = pi * raio * raio;
		System.out.println("A area do circulo é: "+ area);
	}

}
