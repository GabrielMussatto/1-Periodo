package aplicacao2;

import java.util.Scanner;

import modelo1.Carro;

public class PrincipalQ2 {

	public static void main(String[] args) {
		Carro [][] matriz = new Carro [3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = PrincipalQ2.lerDados();;
			}
		}
		PrincipalQ2.imprimir(matriz);
	}
	
	public static void imprimir(Carro[][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.println("Dados do carro na posição [" +(i)+"] ["+(j) + "] da matriz ");
				System.out.println("Nome: " + m[i][j].nome);
				System.out.println("Quantidade: " + m[i][j].quantidade);
				System.out.println("Quilometragem: " + m[i][j].quilometragem);
				System.out.println("Valor: " + m[i][j].valor);
				System.out.println("É usado? " + m[i][j].ehUsado);
				System.out.println();
			}
		}
		
	}
	
	public static Carro lerDados() {
		Scanner scan = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		System.out.println("Informe o nome do carro: ");
		carro.nome = scan.next();
		
		System.out.println("Informe a quantidade de carros: ");
		carro.quantidade = scan.nextInt();
		
		System.out.println("Informe a quilometragem do carro: ");
		carro.quilometragem = scan.nextFloat();
		
		System.out.println("Informe o valor do carro: ");
		carro.valor = scan.nextFloat();		
		
		System.out.println("O carro foi comprado usado? Digite 1 - Sim ou 2 - Não ");
		int resultado = scan.nextInt();
		if(resultado == 1) {
			carro.ehUsado = true;
		}else {
			carro.ehUsado = false;
		}
		return carro;
	}
}
