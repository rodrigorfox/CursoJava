package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		System.out.printf("Megasena: %d %d %d %d %d %d \n",1,2,3,4,5,6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite sua escala: ");
		int escala = entrada.nextInt();
		
		int mes = 0;
		if (escala == 12) {
			mes = 10;
		} else if (escala == 8) {
			mes = 22;
		} else if (escala == 6) {
			mes = 26;
		} else {
			mes = 0;
		}
		
		System.out.printf("%s %s tem %d anos e trabalha %d dias no mês.", nome, sobrenome, idade, mes);
		
		entrada.close();
	}
}
