package fundamentos.desafios;

import java.util.Scanner;

public class DesafioQuadradoCubo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Deseja calcular o Quadrado ou o Cubo do valor?\n" + 
		"Quadrado = q x Cubo = c" + "\nInsira a opção: ");
		String op = entrada.nextLine();
		System.out.print("Insira o valor desejado: ");
		int valor = entrada.nextInt();
		
		double 	resultado = "q".equals(op) ? Math.pow(valor, 2) : 0;
				resultado = "c".equals(op) ? Math.pow(valor, 3) : resultado;
				
				System.out.printf("o Resultado é: %.0f", resultado);
		
		entrada.close();
	}
}
