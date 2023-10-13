
package Terceiraaulaemjava;

import java.util.Scanner;

public class Atvd2matriz {

	public static void main(String[] args) {
		//multiplicação da matriz
		Scanner leia = new Scanner(System.in);
		int [][] m = new int [2][3];
		int mult = 1;
		
		for (int i = 0; i <=1; i++) {
			for (int j = 0; j <=2; j++) {
				if (j!=2) {
					System.out.println("Informe o numero: ");
					m[i][j] = leia.nextInt();
					mult *= m[i][j];
				}
				else {
					m[i][j] = mult;
				}
			}
			mult = 1;
		}
		for (int i = 0; i <=1; i++) {
			for (int j = 0; j <=2; j++) {
				System.out.print("["+m[i][j]+"]"+" ");
			}
			System.out.println();
		}
	}

}
