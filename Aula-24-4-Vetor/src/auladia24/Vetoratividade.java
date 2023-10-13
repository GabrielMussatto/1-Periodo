package auladia24;

public class Vetoratividade {

	public static void main(String[] args) {
		//a partir do vetor2, faça um programa que imprima um vetor sem valores repetidos
		Integer [] vetor2 = {1,3,3,5,7,7,9};
		boolean existe = false;
		int posicao = 0;
		
		Integer [] novo = new Integer[vetor2.length];
		
		for (int i = 0; i < vetor2.length; i++) {
			//inicializar a cada laço de repetiçao
			existe = false;
			for (int j = 0; j < novo.length; j++) {
				if (novo[j] != null) {
					if(vetor2[i] == novo[j]) {
						existe = true;
					}
				}
			}
			if (existe == false) {
				novo[posicao] = vetor2[i];
				posicao++;
				System.out.println(vetor2[i]);
			}
		}
	}

}
