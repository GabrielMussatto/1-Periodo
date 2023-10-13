package Terceiraaulaemjava;

public class Matrizesatividade {

	public static void main(String[] args) {
		//vetores
		int[] v = new int [3];
		int v2 [] = new int[3];
		
		//matrizes
		int[][]m = new int [3][3];
		//inicializando a matriz
		m[0][0] = 1;
		m[0][1] = 2;
		m[0][2] = 3;
		m[1][0] = 4;
		m[1][1] = 5;
		m[1][2] = 6;
		m[2][0] = 7;
		m[2][1] = 8;
		m[2][2] = 9;
		
		//tamanho da linha
		System.out.println();
		
		//tamanho da coluna
		System.out.println();
		
		// imprimindo uma matriz
		for (int l = 0; l < m.length; l++) {
			System.out.print(" | ");
			for (int c = 0; c < m.length; c++) {
				System.out.print(m[l][c]+" | ");
			}
			System.out.println();//quebra de linha
		}
	}
}
