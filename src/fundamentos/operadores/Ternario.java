package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 5.6;
		
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recupera��o.";
		System.out.println("O aluno est� " + resultadoFinal);
	}
}
