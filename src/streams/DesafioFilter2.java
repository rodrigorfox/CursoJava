package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook", 2560.89, 0.20, 0);
		Produto p2 = new Produto("Galaxy Watch", 1250.73, 0.35, 0);
		Produto p3 = new Produto("Playstation 5", 4465.99, 0.20, 0);
		Produto p4 = new Produto("Samsung Galaxy S10", 2689.40, 0.30, 0);
		Produto p5 = new Produto("Samsung Galaxy S9", 1689.40, 0.10, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		//Filter, Filter, Map
				
		Predicate<Produto> descontao = n -> n.desconto >= 0.3;

		Predicate<Produto> freteSuper = n -> n.frete == 0;
		
		Function<Produto, String > produtoBarato = n ->
				"Aproveite o " + n.nome +
				" com descontão de 30% e frete Grátis!!";
		
		produtos.stream()
		.filter(descontao)
		.filter(freteSuper)
		.map(produtoBarato)
		.forEach(System.out::println);
	}
}
