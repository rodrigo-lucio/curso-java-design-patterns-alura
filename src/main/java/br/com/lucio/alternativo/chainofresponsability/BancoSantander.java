package br.com.lucio.alternativo.chainofresponsability;

public class BancoSantander extends BancoChain {

	public BancoSantander() {
		super(IDBancos.SANTANDER);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no " + this.getClass().getSimpleName());
	}

}
