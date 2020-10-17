package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s.replace("X","Senhora");
		s.toUpperCase();
		s= s.concat("!!!");
		
		System.out.println(s);
		String x = "Rod".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
	}
}
