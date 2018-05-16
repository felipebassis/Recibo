package br.com.db1.start.recibo;

public class Endereco {
	
	private TipoLogradouro tipoLogradouro;
	
	private String logradouro;
	
	private String numero;
	
	private Integer cep;
	
	private String complemento;
	
	private String bairro;
	
	private Uf uf;
	
	
	public String getEnderecoFormatado(){
	
	
		return " ";	
	}
	
	public String getCepFormatado(){
		return this.cep.toString(0, 5) + "-" + this.cep.toString(6,8);
	}
	
	
	
}
