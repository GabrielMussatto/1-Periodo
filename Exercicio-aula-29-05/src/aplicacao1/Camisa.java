package aplicacao1;

import java.util.Scanner;

public class Camisa {
	//Atributos da classe
	public Integer largura_camisa;
	public Float valor_camisa;
	public String marca_camisa;
	public String tecido_camisa;
	public Boolean possui_manga;
	
	// Métodos usados
	public static Camisa[] lerDados() {
		
		Camisa[] vetCamisa = new Camisa[2];
		Scanner leia = new Scanner (System.in);
		for (int i = 0; i < vetCamisa.length; i++) {
			vetCamisa[i] = new Camisa();
			System.out.println("Informe a marca da " + (i+1) + "º camisa: ");
			vetCamisa[i].marca_camisa = leia.next();
			
			System.out.println("Informe o tecido da " + (i+1) + "º camisa: ");
			vetCamisa[i].tecido_camisa = leia.next();
			
			System.out.println("Informe a largura da " + (i+1) + "º camisa: ");
			vetCamisa[i].largura_camisa = leia.nextInt();
			
			System.out.println("Informe o valor da " + (i+1) + "º camisa: ");
			vetCamisa[i].valor_camisa = leia.nextFloat();
			
			System.out.println("A camisa possui manga longa? Escreva true para verdadeiro e false para falso");
			vetCamisa[i].possui_manga = leia.nextBoolean();
		}
		leia.close();
		return vetCamisa;
	}
	public static void imprimir(Camisa...camisas) {
		System.out.println();
		for (int i = 0; i < camisas.length; i++) {
			System.out.println("Marca da " +(i+1)+ "º camisa ");
			System.out.println(camisas[i].marca_camisa);
			System.out.println("Tecido da " +(i+1)+ "º camisa ");
			System.out.println(camisas[i].tecido_camisa);
			System.out.println("Largura da " +(i+1)+ "º camisa ");
			System.out.println(camisas[i].largura_camisa);
			System.out.println("Valor da " +(i+1)+ "º camisa ");
			System.out.println(camisas[i].valor_camisa);
			System.out.println("A " +(i+1)+ "º camisa possui manga longa? ");
			System.out.println(camisas[i].possui_manga);
		}
	}
}
