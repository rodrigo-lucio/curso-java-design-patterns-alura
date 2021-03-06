package br.com.lucio.alternativo.composite;

import java.util.ArrayList;

public class ArquivoComposite extends ArquivoComponent {

	ArrayList<ArquivoComponent> arquivos = new ArrayList<>();

	public ArquivoComposite(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}

	@Override
	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
		for (ArquivoComponent arquivoTmp : arquivos) {
			arquivoTmp.printNomeDoArquivo();
		}
	}

	@Override
	public void adicionar(ArquivoComponent novoArquivo) {
		this.arquivos.add(novoArquivo);
	}

	@Override
	public void remover(String nomeDoArquivo) throws Exception {
		for (ArquivoComponent arquivoTmp : arquivos) {
			if (arquivoTmp.getNomeDoArquivo() == nomeDoArquivo) {
				this.arquivos.remove(arquivoTmp);
				return;
			}
		}
		throw new Exception("Não existe este arquivo");
	}

	@Override
	public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
		for (ArquivoComponent arquivoTmp : arquivos) {
			if (arquivoTmp.getNomeDoArquivo().equals(nomeDoArquivo)) {
				return arquivoTmp;
			}
		}
		throw new Exception("Não existe este arquivo");
	}

}
