package br.com.lucio.alternativo.chainofresponsability;

public class BancoDoBrasil extends BancoChain {

	public BancoDoBrasil() {
		super(IDBancos.BANCO_DO_BRASIL);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no " + this.getClass().getSimpleName());
	}

}
