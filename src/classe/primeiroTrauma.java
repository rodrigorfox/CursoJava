package classe;

public class primeiroTrauma {
	
	int a = 3; //não pode mexer aqui!
	static int b = 4;
	
	public static void main(String[] args) {
		
		primeiroTrauma p = new primeiroTrauma(); 
		
		//pode mexer aqui
		System.out.println(p.a);//pode mexer aqui
		System.out.println(b);//pode mexer aqui
		//pode mexer aqui
	}
}
