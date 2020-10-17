package classe.DesafioComida;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida c) {
		this.peso += c.peso;
	}
}
