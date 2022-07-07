package br.com.lucio.alternativo.chainofresponsability;

public class Cliente {
	public static void main(String[] args) {
		BancoChain bancos = new BancoSantander();
		bancos.setNext(new BancoDoBrasil());
		bancos.setNext(new BancoCaixa());
		bancos.setNext(new BancoItau());
		
		try {
			bancos.efetuarPagamento(IDBancos.CAIXA);
			bancos.efetuarPagamento(IDBancos.SANTANDER);
			bancos.efetuarPagamento(IDBancos.ITAU);
			bancos.efetuarPagamento(IDBancos.BANCO_DO_BRASIL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
