package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 =°C
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;

		double far = 86;
		double celcius = (far - AJUSTE) * FATOR;
		System.out.println("Transferencia de Far para Celcius = " + celcius + " °C.");
		
		far = 0;
		celcius = (far - AJUSTE) * FATOR;
		System.out.println("Transferencia de Far para Celcius = " + celcius + " °C.");
		
	}
}
