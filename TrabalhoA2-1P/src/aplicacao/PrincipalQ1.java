package aplicacao;

import java.util.Scanner;

import modelo1.Carro;

public class PrincipalQ1 {

	public static void main(String[] args) {
		Carro[] vetor = new Carro [5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = PrincipalQ1.lerDados();
			
		}
		PrincipalQ1.imprimir(vetor);
	}
	
	public static void imprimir(Carro[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("DADOS DO " + (i+1) + "º CARRO");
			System.out.println("Nome: " + v[i].nome);
			System.out.println("Quantidade: " + v[i].quantidade);
			System.out.println("Quilometragem: " + v[i].quilometragem);
			System.out.println("Valor: " + v[i].valor);
			System.out.println("É usado? " + v[i].ehUsado);
			System.out.println();
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
		if(resultado==1) {
			carro.ehUsado = true;
		}else {
			carro.ehUsado = false;
		}
		
		return carro;
	}
}
