package br.com.generation.projetojava;

import java.io.InputStream;

public class Paciente {
	private String nome;
	private int idade;
	private String telefone;
	private String email;
	private int regiao;
	
	public Paciente(String nome, int idade, String telefone, String email, int regiao){
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
		this.regiao = regiao;
	}
	
	public Paciente(InputStream in) {
		// TODO Auto-generated constructor stub
	}

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
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getRegiao() {
		return regiao;
	}
	
	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}
	
	
}