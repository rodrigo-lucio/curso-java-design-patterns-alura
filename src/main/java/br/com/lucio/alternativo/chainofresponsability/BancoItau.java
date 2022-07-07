package br.com.lucio.alternativo.chainofresponsability;

public class BancoItau extends BancoChain {

	public BancoItau() {
		super(IDBancos.ITAU);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco " + this.getClass().getSimpleName());
	}
}
