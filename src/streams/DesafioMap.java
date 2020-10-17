package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//nums.stream().map(m -> Integer.toBinaryString(m)).forEach(println);
		
		UnaryOperator<String> builder = n -> new StringBuilder(n).reverse().toString();
		
		Function<String, Integer> binaryToInt = n -> Integer.parseInt(n, 2);
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(builder)
		.map(binaryToInt)
		.forEach(System.out::println);
		
	}
}
