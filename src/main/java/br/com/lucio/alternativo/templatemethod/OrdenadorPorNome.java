package br.com.lucio.alternativo.templatemethod;

public class OrdenadorPorNome extends OrdenadorTemplate {

	@Override
	public int criterioOrdenacao(MusicaMP3 musica1, MusicaMP3 musica2) {
		return musica1.nome.compareToIgnoreCase(musica2.nome);
	}

}
