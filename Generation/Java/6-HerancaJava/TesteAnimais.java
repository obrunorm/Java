package HerancaAnimal;

public class TesteAnimais {

	public static void main(String[] args) {
		
				
		//Objetos
		Cachorro cachorro1 = new Cachorro ();
		Cavalo cavalo1 = new Cavalo ();
		Preguica preguica1 = new Preguica ();
		
		//cachorro
		cachorro1.setNome("Totó");
		cachorro1.setIdade(3);
		cachorro1.setSom("Latir!!");
		cachorro1.setAcelerar("Correr");
				
		;
		//cavalo
		cavalo1.setNome("Spirit");
		cavalo1.setIdade(15);
		cavalo1.setSom("Relincho!!");
		cavalo1.setAcelerar("Trotar");
		
		//Preguiça
		preguica1.setNome("Soneca");
		preguica1.setIdade(20);
		preguica1.setSom("Grito!!"); //https://www.youtube.com/watch?v=ZUnEoyIBuxM
		preguica1.setAcelerar("Subir árvore");
		
		//Mostra de variáveis
		
		//Nomes
		System.out.println("O nome do cachorro é: " + cachorro1.getNome());
		System.out.println("O nome do cavalo é: " + cavalo1.getNome());
		System.out.println("O nome da preguiça é: " + preguica1.getNome());
		
		
		//Idade
		System.out.println("\nA idade do cachorro é: " + cachorro1.getIdade());
		System.out.println("A idade do cavalo é: " + cavalo1.getIdade());
		System.out.println("A idade da preguiça é: " + preguica1.getIdade());
		
		//Som
		System.out.println("\nO som que o cachorro faz é: " + cachorro1.getSom());
		System.out.println("O som que o cavalo faz é: " + cavalo1.getSom());
		System.out.println("O som que a preguiça faz é: " + preguica1.getSom());
		
		//Movimento
		System.out.println("\nO movimento do cachorro é: " + cachorro1.getAcelerar() );
		System.out.println("O movimento do cavalo é: " + cavalo1.getAcelerar());
		System.out.println("O movimento da preguiça é: " + preguica1.getAcelerar() );


	}

}
