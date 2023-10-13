package questao4;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {	
		Scanner scan = new Scanner (System.in);
		Float valor , desconto , valorDesconto = 0f , pagar = 0f;
		int qntd;
		String produto;
		System.out.println("Informe o nome do produto: ");
		produto = scan.next();
		System.out.println("Informe o valor unitário do produto: ");
		valor = scan.nextFloat();
		System.out.println("Informe a quantidade desejada: ");
		qntd = scan.nextInt();
		if(qntd <=10) {
			desconto = (valor/100)*0;
			valorDesconto = valor - desconto;
			pagar = valorDesconto * qntd;
		}else if(qntd>=11 && qntd<=20) {
			desconto = (valor/100)*10;
			valorDesconto = valor - desconto;
			pagar = valorDesconto * qntd;
		}else if(qntd>=21 && qntd<=30) {
			desconto = (valor/100)*15;
			valorDesconto = valor - desconto;
			pagar = valorDesconto * qntd;
		}else if(qntd>=31) {
			desconto = (valor/100)*20;
			valorDesconto = valor - desconto;
			pagar = valorDesconto * qntd;
		}
		System.out.println("O valor unitário com desconto é: " + valorDesconto);
		System.out.println("O valor a ser pago é: " + pagar);
	}
}
