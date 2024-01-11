package HerancaAnimal;

public class Animal  {   //superclass
	
	//Variáveis 
	//=====================================================================================//
	private String nome;
	private int idade;
	private String som;
	private String acelerar = "parado";
	
	
	// Getter e Setters	
	//====================================================================================//
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAcelerar() {
		return acelerar;
	}
	public void setAcelerar(String acelerar) {
		this.acelerar = acelerar;
	}
	
	//Métodos
	//===============================================================================================================
	
	void movimentar(String movimento) {
		movimento = acelerar;
		
	}
		
	
	

}
