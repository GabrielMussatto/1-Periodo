package aplicacao;

public class Principal {

	public static void main(String[] args) {
		Integer valor1 = Principal.somar(10,20);
		Principal.imprimir(valor1);
		
		Integer valor2 = Principal.somar(20,20,20);
		Principal.imprimir(valor2);
		
		Integer valor3 = Principal.somar(30,20);
		Principal.imprimir(valor3);
		
		Integer[]vetor = {1,2,3,4,5,6};
		Integer valor4 = Principal.somar(vetor);
		Principal.imprimir(valor4);
		
		Principal.imprimir(Principal.somar(1, 2, 3, 4, 5, 6, 7, 8, 10));
	}

	public static Integer somar(Integer valor1, Integer valor2) {
		Integer soma = valor1 + valor2;
		
		return soma;
	}
	
	public static Integer somar(Integer valor1, Integer valor2, Integer valor3) {
		Integer soma = valor1 + valor2 + valor3;
		
		return soma;
	}
	
//	public static Integer somar(Integer[]valores) {
//		Integer soma = 0;
//		
//		for (int i = 0; i < valores.length; i++) {
//			soma += valores[i];
//		}
//		
//		return soma;
//	}
	
	public static Integer somar(Integer... valores) {
		Integer soma = 0;
		
		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
		
		return soma;
	}
	
	public static void imprimir(Integer valor) {
		System.out.println(valor);
	}
}
