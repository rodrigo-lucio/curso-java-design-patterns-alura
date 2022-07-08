package br.com.lucio.alternativo.templatemethod;

public class OrdenadorPorAno extends OrdenadorTemplate {

	@Override
	public int criterioOrdenacao(MusicaMP3 musica1, MusicaMP3 musica2) {
		return musica1.ano.compareToIgnoreCase(musica2.ano);
	}

}
