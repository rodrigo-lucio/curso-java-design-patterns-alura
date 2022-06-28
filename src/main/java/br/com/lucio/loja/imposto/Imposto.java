package br.com.lucio.loja.imposto;

import static java.util.Objects.nonNull;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto getOutroImposto() {
		return outroImposto;
	}

	public abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
    public BigDecimal calcular(Orcamento orcamento) {
    	BigDecimal valorImposto = realizarCalculo(orcamento);
    	BigDecimal valorOutroImposto = BigDecimal.ZERO;
    	
//    	if(nonNull(outroImposto)) {
//    		valorOutroImposto = outroImposto.realizarCalculo(orcamento);
//    	}
	   while(outroImposto != null) {
		   valorOutroImposto = outroImposto.realizarCalculo(orcamento);
		   valorImposto = valorImposto.add(valorOutroImposto);
           this.outroImposto = outroImposto.getOutroImposto();
       }    	
    	return valorImposto.add(valorOutroImposto);
    	
    }
    
}
