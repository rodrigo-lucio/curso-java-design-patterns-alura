package br.com.lucio.loja.desconto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
    
}
