package br.com.lucio.alternativo.visitor;

public class ExibirPostOrderVisitor implements ArvoreVisitor {

	@Override
	public void visitar(No no) {
		if (no == null)
			return;
		visitar(no.getEsquerdo());
		visitar(no.getDireito());
		System.out.println(no);
	}

}
