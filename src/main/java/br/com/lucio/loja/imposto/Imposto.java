package br.com.lucio.loja.imposto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public interface Imposto {

    public BigDecimal calcular(Orcamento orcamento);
    
}
