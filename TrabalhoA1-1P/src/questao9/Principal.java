package questao9;

public class Principal {

	public static void main(String[] args) {
		Float habPalmas = 265000f , habGo = 1200000f;
		Float aumentoPalmas = 0f, aumentoGo = 0f , anos = 0f;
		while(habPalmas<habGo) {
			aumentoGo = (habGo/100) * 0.3f;//crescimento populacional de 0,3%
			habGo = habGo + aumentoGo;
			aumentoPalmas = (habPalmas/100) * 0.8f;//crescimento populacional de 0,8%
			habPalmas = habPalmas + aumentoPalmas;
			anos++;
		}
		System.out.println("Para Palmas ultrapassar a população de Goiânia levará " + anos + " anos");
	}

}
