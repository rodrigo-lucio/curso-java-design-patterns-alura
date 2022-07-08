package br.com.lucio.alternativo.templatemethod;

public class Cliente {
	public static void main(String[] args) {

		PlayList minhaPlayList = new PlayList();
		minhaPlayList.adicionarMusica("Everlong", "Foo Fighters", "1997", 5);
		minhaPlayList.adicionarMusica("Song 2", "Blur", "1997", 4);
		minhaPlayList.adicionarMusica("American Jesus", "Bad Religion", "1993", 3);
		minhaPlayList.adicionarMusica("No Cigar", "Milencollin", "2001", 2);
		minhaPlayList.adicionarMusica("Ten", "Pearl Jam", "1991", 1);

		System.out.println("=== Lista por Nome de Musica ===");
		minhaPlayList.mostrarListaDeReproducao(MODO_REPRODUCAO.POR_NOME);

		System.out.println("\n=== Lista por Autor ===");
		minhaPlayList.mostrarListaDeReproducao(MODO_REPRODUCAO.POR_AUTOR);

		System.out.println("\n=== Lista por Ano ===");
		minhaPlayList.mostrarListaDeReproducao(MODO_REPRODUCAO.POR_ANO);

		System.out.println("\n=== Lista por Estrela ===");
		minhaPlayList.mostrarListaDeReproducao(MODO_REPRODUCAO.POR_ESTRELA);
	}
}
