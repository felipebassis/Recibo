package br.com.db1.start.recibo;

public class Endereco {
	
	private TipoLogradouro tipoLogradouro;
	
	private String logradouro;
	
	private String numero;
	
	private Integer cep;
	
	private String complemento;
	
	private String bairro;
	
	private Uf uf;
	
	public Endereco(){
		
	}
	
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getCep() {
		return cep;
	}
	
	public void setCep(Integer cep){
		this.cep = cep;
	}
	
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public String getEnderecoFormatado(){
	
	
		return " ";	
	}
	
	
	public String getCepFormatado(){
		String cepFormatado = this.cep.toString();
		
		cepFormatado = cepFormatado.substring(0, 5) + "-" + cepFormatado.substring(5);
		
		return cepFormatado;
	}
	
	
	
}
