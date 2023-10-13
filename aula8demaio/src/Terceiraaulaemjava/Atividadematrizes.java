package Terceiraaulaemjava;

import java.text.DecimalFormat;

public class Atividadematrizes {

	public static void main(String[] args) {
		
		
		//soma das matrizes
		int[][]m1 = new int [3][3];
		int[][]m2 = new int [3][3];
		int[][]mSoma = new int [3][3];
		
		//inicializando a matriz m1
		m1[0][0] = 1;
		m1[0][1] = 2;
		m1[0][2] = 3;
		m1[1][0] = 2;
		m1[1][1] = 3;
		m1[1][2] = 1;
		m1[2][0] = 3;
		m1[2][1] = 1;
		m1[2][2] = 2;
		
		//inicializando a matriz m2
		m2[0][0] = 3;
		m2[0][1] = 2;
		m2[0][2] = 1;
		m2[1][0] = 2;
		m2[1][1] = 1;
		m2[1][2] = 3;
		m2[2][0] = 1;
		m2[2][1] = 3;
		m2[2][2] = 2;
		
		//somar
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				mSoma[l][c] = m1[l][c] + m2[l][c];
			}
		}
		// imprimindo soma matriz
		DecimalFormat df = new DecimalFormat("00");
		for (int l = 0; l < 3; l++) {
			System.out.print(" | ");
			for (int c = 0; c < 3; c++) {
				//System.out.print(mSoma[l][c]+" | ");
				String valorFormatado = df.format(mSoma[l][c]);
				System.out.print(valorFormatado+" | ");
			}
			System.out.println();//quebra de linha
		}
		
	}

}
