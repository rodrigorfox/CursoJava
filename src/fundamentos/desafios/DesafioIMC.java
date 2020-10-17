package fundamentos.desafios;

import java.util.Scanner;

public class DesafioIMC {
	public static void main(String[] args) {
		//dividindo o peso pela altura ao quadrado
		//Math.pow(peso / altura,2)
		
		
		//Ler os dados do usuario e atribuir as variaveis
		Scanner entrada = new Scanner(System.in);
		System.out.print("Para calcular seu IMC insira a sua altura: ");
		String altura = entrada.nextLine().replace(",", ".");
		System.out.print("Agora preciso que informe seu peso: ");
		String peso = entrada.nextLine().replace(",", ".");
		
		//double entrada1 = Double.parseDouble(altura);
		//double entrada2 = Double.parseDouble(peso);
		
		//Calcular o IMC
		double IMC = Double.parseDouble(peso)/(Math.pow(Double.parseDouble(altura),2));
		
		System.out.println("O seu IMC é: " + IMC);
		
		entrada.close();
	}
}
