package br.com.lucio.loja.imposto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public class IPI extends Imposto {

	
    public IPI(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.10"));
    }
    
}
