package classe.DesafioComida;

public class Jantar {
	public static void main(String[] args) {
		
		Comida f = new Comida ("Feijão preto", 0.300);
		Comida b = new Comida ("Bolo", 0.100);
		
		Pessoa p = new Pessoa ("Pedro", 64.500);
		
		System.out.printf("\nO peso atual de %s está em %.2f.", p.nome, p.peso );
		
		p.comer(b);
		System.out.printf("\nO peso atual de %s está em %.2f.", p.nome, p.peso );
		
		p.comer(f);
		System.out.printf("\nO peso atual de %s está em %.2f.", p.nome, p.peso );
	}
}
