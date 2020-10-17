package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// + - * / %
		
		
		//Leitura do scanner e atribui��o dos valores
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		double valor1 = entrada.nextDouble();
		System.out.print("Digite o operador: ");
		String op = entrada.next();
		System.out.print("Digite o segundo n�mero: ");
		double valor2 = entrada.nextDouble();
		
		//C�lculo do resultado		
		double resultado = 	op.contentEquals("+") ? valor1 + valor2 :
							op.contentEquals("-") ? valor1 - valor2 :
							op.contentEquals("*") ? valor1 * valor2 :
							op.contentEquals("/") ? valor1 / valor2 :
							op.contentEquals("/") ? valor1 % valor2 : 0;
		System.out.printf("O resultado da opeara��o %s %s %s � = %s", valor1, op, valor2, resultado);
		
		entrada.close();
	}
}
