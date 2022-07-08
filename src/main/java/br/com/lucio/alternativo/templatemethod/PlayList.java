package br.com.lucio.alternativo.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	private List<MusicaMP3> musicas;
	private OrdenadorTemplate ordenador;

	public PlayList() {
		musicas = new ArrayList<>();
	}

	private void setModoDeReproducao(MODO_REPRODUCAO modo) {
		ordenador = null;
		switch (modo) {
		case POR_ANO:
			ordenador = new OrdenadorPorAno();
			break;
		case POR_AUTOR:
			ordenador = new OrdenadorPorAutor();
			break;
		case POR_ESTRELA:
			ordenador = new OrdenadorPorEstrela();
			break;
		case POR_NOME:
			ordenador = new OrdenadorPorNome();
			break;
		default:
			break;
		}
	}

	public void adicionarMusica(String nome, String autor, String ano,
			int estrela) {
		musicas.add(new MusicaMP3(nome, autor, ano, estrela));
	}

	public void mostrarListaDeReproducao(MODO_REPRODUCAO modo) {
		setModoDeReproducao(modo);
		List<MusicaMP3> novaLista = ordenador.ordenarMusica(musicas);;
		novaLista.forEach(musica -> System.out.println(musica.toString()));
	}
}
