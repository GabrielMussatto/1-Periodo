package aplicacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int operacao;
		Integer valor1, valor2;
		
		System.out.println("Qual operação você deseja fazer");
		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		System.out.println("Digite 4 para dividir");
		operacao = leia.nextInt();
		
		System.out.println("Informe o primeiro valor:");
		valor1 = leia.nextInt();
		System.out.println("Informe o segundo valor:");
		valor2 = leia.nextInt();
		
		
		if(operacao <=4) {
			if (operacao == 1) {
				Principal.somar(valor1, valor2);
				System.out.println(Principal.somar(valor1, valor2));
			}else if(operacao == 2){
				Principal.sub(valor1, valor2);
				System.out.println(Principal.sub(valor1, valor2));
			}else if(operacao == 3){
				Principal.mult(valor1, valor2);
				System.out.println(Principal.mult(valor1, valor2));
			}else if(operacao == 4){
				Principal.div(valor1, valor2);
				System.out.println(Principal.div(valor1, valor2));
			}
			
		}
		
		
		leia.close();
	}

	public static Integer somar(Integer valor1, Integer valor2) {
		Integer soma = valor1 + valor2;
		
		return soma;
	}
	
	public static Integer sub(Integer valor1, Integer valor2) {
		Integer sub = valor1 - valor2;
		
		return sub;
	}
	
	public static Integer mult(Integer valor1, Integer valor2) {
		Integer mult = valor1 * valor2;
		
		return mult;
	}
	
	public static Integer div(Integer valor1, Integer valor2) {
		Integer div = valor1 / valor2;
		
		return div;
	}
	
	public static Integer exponencial(Integer base, Integer exp) {
		Integer resultado =1;
		if(exp>=0) {
				for (Integer i = 0; i < exp; i++) {
					resultado *= base;
					return resultado;
				}
				
			
		}
		
	}
	
}
