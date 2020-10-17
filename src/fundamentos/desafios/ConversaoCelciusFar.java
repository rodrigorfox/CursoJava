package fundamentos.desafios;

import java.util.Scanner;

public class ConversaoCelciusFar {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 =°C
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual tipo de temperatura deseja converter?\n"
				+ "Farhrenheit x Celsius = 1\n" + "Celsius x Farhrenheit = 2:\n"
				+ "Insira o valor correspondente: ");
		String temperatura = entrada.next();
		System.out.println("Qual o valor a ser convertido?");
		double valor = entrada.nextDouble();
			
		final int AJUSTE = 32;
		double resultado = 	"1".equals(temperatura) ? (valor - AJUSTE) * (5.0/9.0) :
							"2".equals(temperatura) ? valor * (9.0/5.0) + AJUSTE : 0;
		String tipo = 	"1".equals(temperatura) ? "Celsius" :
						"2".equals(temperatura) ? "Farhrenheit" : "Valor inválido";
		
		System.out.printf("o resultado da conversão de %s para %s é = %.2f", valor , tipo, resultado);
		entrada.close();
	}
}
