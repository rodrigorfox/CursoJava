package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 5.6;
		
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);
	}
}
