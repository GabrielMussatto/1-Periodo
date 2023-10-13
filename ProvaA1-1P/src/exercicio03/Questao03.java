package exercicio03;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Integer valor = 0, nota100 = 0 , nota50 = 0 , nota20 = 0 , nota10 = 0 , nota5 = 0 , nota2 = 0;
		System.out.println("Informe o valor:");
		Scanner leia = new Scanner(System.in);
		valor = leia.nextInt();
		while (valor>= 100) {
			valor = valor - 100;
			nota100++;
		}
		while(valor>=50) {
			valor = valor - 50;
			nota50++;
		}
		while(valor>=20) {
			valor = valor - 20;
			nota20++;
		}
		while(valor>=10) {
			valor = valor - 10;
			nota10++;
		}
		while(valor>=5) {
			valor = valor - 5;
			nota5++;
		}
		while(valor>=2) {
			valor = valor - 2;
			nota2++;
		}
		System.out.println("Notas de 100: "+ nota100 +"\nNotas de 50: " + nota50 + 
				"\nNotas de 20: "+ nota20 +"\nNotas de 10: "+ nota10 +"\nNotas de 5: "+ nota5 +"\nNotas de 2: "+ nota2);
		leia.close();
	}
	

}
