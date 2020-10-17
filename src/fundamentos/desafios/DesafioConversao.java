package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("informe o primeiro salario: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		System.out.print("informe o segundo salario: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		System.out.print("informe o terceiro salario: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		double a = Double.parseDouble(valor1);
		double b = Double.parseDouble(valor2);
		double c = Double.parseDouble(valor3);
		
		
		System.out.printf("A media dos salarios é: " + (a+b+c)/3);
		entrada.close();
		
	}
}
