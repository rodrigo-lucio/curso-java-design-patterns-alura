package br.com.lucio.alternativo.chainofresponsability;

public class BancoCaixa extends BancoChain {

	public BancoCaixa() {
		super(IDBancos.CAIXA);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no " + this.getClass().getSimpleName());
	}

}
