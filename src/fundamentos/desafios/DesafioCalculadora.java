package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// + - * / %
		
		
		//Leitura do scanner e atribuição dos valores
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double valor1 = entrada.nextDouble();
		System.out.print("Digite o operador: ");
		String op = entrada.next();
		System.out.print("Digite o segundo número: ");
		double valor2 = entrada.nextDouble();
		
		//Cálculo do resultado		
		double resultado = 	op.contentEquals("+") ? valor1 + valor2 :
							op.contentEquals("-") ? valor1 - valor2 :
							op.contentEquals("*") ? valor1 * valor2 :
							op.contentEquals("/") ? valor1 / valor2 :
							op.contentEquals("/") ? valor1 % valor2 : 0;
		System.out.printf("O resultado da opearação %s %s %s é = %s", valor1, op, valor2, resultado);
		
		entrada.close();
	}
}
