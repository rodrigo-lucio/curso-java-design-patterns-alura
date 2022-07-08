package br.com.lucio.alternativo.templatemethod;

import java.util.ArrayList;
import java.util.List;

public abstract class OrdenadorTemplate {
	
	public abstract int criterioOrdenacao(MusicaMP3 musica1, MusicaMP3 musica2);

	//Este aqui é o nosso template method
	protected List<MusicaMP3> ordenarMusica(List<MusicaMP3> musicas) {
		List<MusicaMP3> listaOrdenada = new ArrayList<>(musicas); 
		listaOrdenada.sort((musica1, musica2) -> criterioOrdenacao(musica1, musica2));
		return listaOrdenada;
	}
}
