package br.com.db1.start.emitente;

public class Emitente {
	
	private String nome;
	
	private byte[] assinatura;
	
	private String documento;
	
	private TipoDocumento tipoDocumento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(byte[] assinatura) {
		this.assinatura = assinatura;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumentoFormatado(String documento){
		if(documento.length() == 11){
			return documento.substring(0,3) + "." + documento.substring(3,6) + "." + documento.substring(6,9) + "-" +documento.substring(9,11);
		}
		else{
			return documento;
		}
	}
}
