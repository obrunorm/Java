package ExercicioClasse;

public class cliente {

	 String nome, endere�o, produto;
	 String idade;
	 String rg;
	 String cpf;
	 int dinheiro = 10;
	
	//m�todos
	void comprar(int comprar) {
		comprar -= dinheiro;
	}
	void devolver(int devolver) {
		devolver = dinheiro;
	}
	 
	 
}
