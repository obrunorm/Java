package HerancaAnimal;

public class TesteAnimais {

	public static void main(String[] args) {
		
				
		//Objetos
		Cachorro cachorro1 = new Cachorro ();
		Cavalo cavalo1 = new Cavalo ();
		Preguica preguica1 = new Preguica ();
		
		//cachorro
		cachorro1.setNome("Tot�");
		cachorro1.setIdade(3);
		cachorro1.setSom("Latir!!");
		cachorro1.setAcelerar("Correr");
				
		;
		//cavalo
		cavalo1.setNome("Spirit");
		cavalo1.setIdade(15);
		cavalo1.setSom("Relincho!!");
		cavalo1.setAcelerar("Trotar");
		
		//Pregui�a
		preguica1.setNome("Soneca");
		preguica1.setIdade(20);
		preguica1.setSom("Grito!!"); //https://www.youtube.com/watch?v=ZUnEoyIBuxM
		preguica1.setAcelerar("Subir �rvore");
		
		//Mostra de vari�veis
		
		//Nomes
		System.out.println("O nome do cachorro �: " + cachorro1.getNome());
		System.out.println("O nome do cavalo �: " + cavalo1.getNome());
		System.out.println("O nome da pregui�a �: " + preguica1.getNome());
		
		
		//Idade
		System.out.println("\nA idade do cachorro �: " + cachorro1.getIdade());
		System.out.println("A idade do cavalo �: " + cavalo1.getIdade());
		System.out.println("A idade da pregui�a �: " + preguica1.getIdade());
		
		//Som
		System.out.println("\nO som que o cachorro faz �: " + cachorro1.getSom());
		System.out.println("O som que o cavalo faz �: " + cavalo1.getSom());
		System.out.println("O som que a pregui�a faz �: " + preguica1.getSom());
		
		//Movimento
		System.out.println("\nO movimento do cachorro �: " + cachorro1.getAcelerar() );
		System.out.println("O movimento do cavalo �: " + cavalo1.getAcelerar());
		System.out.println("O movimento da pregui�a �: " + preguica1.getAcelerar() );


	}

}
