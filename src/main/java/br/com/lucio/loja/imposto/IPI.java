package br.com.lucio.loja.imposto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public class IPI implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.10"));
    }
    
}
