package br.com.db1.start.recibo;

public class Executadora {
	public static void main(String[] args) {
		exibirCepFormatado();
		
		
	}

	private static void exibirCepFormatado() {
		Endereco endereco = new Endereco();
		
		endereco.setCep(80540150);
		
		System.out.println(endereco.getCepFormatado());
	}
}
