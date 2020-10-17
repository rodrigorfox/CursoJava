package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		/*int a = 3 * 4 -10;
		int b = (int)Math.pow(a,3);
		double c = Math.pow(a,3);
		
		System.out.println(b);
		System.out.println(c);*/
		
		
		int a = 6*(3+2);
		
		double soma1 = Math.pow(a, 2)/(3*2);
		
		int b = (1-5)*(2-7)/2;
		double soma2 = Math.pow(b, 2);
		
		double c = Math.pow(soma1-soma2, 3);
		double d = Math.pow(10, 3);
		double result = c / d;
		
		System.out.println("O resultado da fórmula é: " + result);
	}
}
