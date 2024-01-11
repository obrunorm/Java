package Exercicios.Collections;

public class Estoque {
	
	private int cb; //Código de barra
	private int quant; //Quantidade do produto
	
	public Estoque (int cb, int quan, int quant) {
		this.setCb(cb);
		this.setQuant(quant);}
		
	
	public int getCb() {
		return cb;
	}

	public void setCb(int cb) {
		this.cb = cb;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
public String toString() {
		
		return "Código produto: " + this.cb + "\nQuantidade: " + this.quant;
	}

}
