package ExercicioClasse;

public class cliente {

	 String nome, endereço, produto;
	 String idade;
	 String rg;
	 String cpf;
	 int dinheiro = 10;
	
	//métodos
	void comprar(int comprar) {
		comprar -= dinheiro;
	}
	void devolver(int devolver) {
		devolver = dinheiro;
	}
	 
	 
}
