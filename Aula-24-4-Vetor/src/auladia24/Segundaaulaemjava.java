package auladia24;

public class Segundaaulaemjava {

	public static void main(String[] args) {
	
		//instancia(criar) de um vetor
		Integer[] vetor = new Integer [10];
		int [] vetor2 = {1,3,5,7,9};
		
		//inicialização
		vetor[0] = 10;
		vetor[1] = 15;
		vetor[2] = 20;
		
		System.out.println(vetor2.length);
		
		int soma = 0;
		
		System.out.println(vetor.length);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(i + " -> " + vetor[i]);
			if (vetor[i] != null)
				soma+=vetor[i];
		}
		System.out.println("Soma:" +soma );
	}

}
