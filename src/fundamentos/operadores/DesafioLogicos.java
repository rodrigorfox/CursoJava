package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("comprou TV 50\"? "+ comprouTv50);
		System.out.println("comprou TV 32\"? "+ comprouTv32);
		System.out.println("comprou TV sorvete\"? "+ comprouSorvete);
		
		System.out.println("Mais Saudável\"? "+ maisSaudavel);
		
		
	}
}
