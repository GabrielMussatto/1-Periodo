package Terceiraaulaemjava;

import java.util.Scanner;

public class Correcaoatvd2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int m [][] = new int [2][3];
		
		//inicialização da matriz
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println("Informe um valor:");
				m[l][c] = leia.nextInt();
			}
		}
		
		for (int l = 0; l < m.length; l++) {
			m[l][2] = m [l][0]* m[l][1];
		}
		
	}

}
