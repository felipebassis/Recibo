package br.com.db1.start.recibo;

public class Pagador {
	
	private String nome;
	
	private Endereco endereco;
	
	public Pagador(){
		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(String nome){
		return this.nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
