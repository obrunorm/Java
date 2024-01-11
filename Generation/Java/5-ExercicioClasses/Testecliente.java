package ExercicioClasse;

public class Testecliente {
	
	public static void main(String[] args) {
		
		cliente cliente1 = new cliente (); 
		
		cliente1.nome = "Bruno";
		cliente1.endereço = "rua x";
		cliente1.rg = "xxxxxxxxxxx";
		cliente1.idade = "25";
		cliente1.cpf = "38530xxxxx";
		
		System.out.println("Nome: " + cliente1.nome);
		System.out.println("RG: " + cliente1.rg);
		System.out.println("Idade: " + cliente1.idade + " Anos");
		System.out.println("CPF: " + cliente1.cpf);
		
	}

}
