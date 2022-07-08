package br.com.lucio.alternativo.templatemethod;

public class MusicaMP3 {
	String nome;
	String autor;
	String ano;
	int estrelas;

	public MusicaMP3(String nome, String autor, String ano, int estrela) {
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
		this.estrelas = estrela;
	}

	@Override
	public String toString() {
		return "MusicaMP3 [nome=" + nome + ", autor=" + autor + ", ano=" + ano + ", estrelas=" + estrelas + "]";
	}
	
	
}
