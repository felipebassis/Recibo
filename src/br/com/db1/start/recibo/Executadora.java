package br.com.db1.start.recibo;

public class Executadora {
	public static void main(String[] args) {
		exibirCepFormatado(80540150);
		
		
	}

	private static void exibirCepFormatado(Integer cepSemFormatacao) {
		Endereco endereco = new Endereco();
		endereco.setCep(cepSemFormatacao);
		System.out.println(endereco.getCepFormatado());
	}
}
