package br.com.lucio.alternativo.templatemethod;

public class OrdenadorPorAutor extends OrdenadorTemplate {

	@Override
	public int criterioOrdenacao(MusicaMP3 musica1, MusicaMP3 musica2) {
		return musica1.autor.compareToIgnoreCase(musica2.autor);
	}

}
