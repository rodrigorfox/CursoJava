package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Hamburguer", 6, 0, 2);
		Produto p2 = new Produto("X Burguer", 7, 0.25, 0);
		Produto p3 = new Produto("Xtudo", 9.5, 0.20, 2);
		Produto p4 = new Produto("Batata Frita", 5.5, 0.10, 1.25);
		Produto p5 = new Produto("Pizza", 35.89, 0.15, 4);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> descontao = n -> n.desconto * n.valor >= 1;

		Predicate<Produto> valorTotal = n -> n.valor * (1 - n.desconto) <=7;
		
		Function<Produto, String > produtoBarato = n -> "O produto " + n.nome +
				" teve R$ mais de 1 real de desconto e custou menos de 7 reais";
		
		produtos.stream()
		.filter(descontao)
		.filter(valorTotal)
		.map(produtoBarato)
		.forEach(System.out::println);
	}
}
