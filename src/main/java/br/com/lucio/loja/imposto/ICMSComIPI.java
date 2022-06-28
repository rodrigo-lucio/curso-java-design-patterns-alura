package br.com.lucio.loja.imposto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public class ICMSComIPI /* extends Imposto */ {
	
    public BigDecimal calcular(Orcamento orcamento) {
    	/*
    	 * Aplicando o decorator de forma errada 
    	 */
    	BigDecimal icms = new ICMS().calcular(orcamento);
    	BigDecimal ipi = new ICMS().calcular(orcamento);
        return icms.add(ipi);
    }

}
