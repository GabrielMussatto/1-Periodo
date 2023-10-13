package exercicio01;

public class Questao01 {

	public static void main(String[] args) {
		Integer valorA = -17; Integer valorB = 25;
		Integer valorC = 5; Integer valorD = 12;
		Boolean resultado = false;
		resultado = (valorA - valorB) > 0 || (valorD != 0);
		System.out.println (resultado);
		resultado = (valorB * -1) <= 0 && valorA % 2 == 0;
		System.out.println (resultado);
		resultado = !((valorC * valorA) > 0 || (valorB + valorD) < 0);
		System.out.println (resultado);
		resultado = ((valorC % 2 == 1)&& (valorA > valorB)) || valorD > 10;
		System.out.println (resultado);
	}

}
