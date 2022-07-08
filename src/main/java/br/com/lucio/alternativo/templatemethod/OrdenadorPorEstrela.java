package br.com.lucio.alternativo.templatemethod;

public class OrdenadorPorEstrela extends OrdenadorTemplate {

	@Override
	public int criterioOrdenacao(MusicaMP3 musica1, MusicaMP3 musica2) {
		return Integer.compare(musica1.estrelas, musica2.estrelas);
	}

}
