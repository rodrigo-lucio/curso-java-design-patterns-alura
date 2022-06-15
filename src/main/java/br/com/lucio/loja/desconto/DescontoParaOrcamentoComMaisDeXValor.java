package br.com.lucio.loja.desconto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeXValor extends Desconto {
    private static final String PERCENTUAL_DESCONTO = "0.5";
    private static final String VALOR_ORCAMENTO_DESCONTO = "500";

    public DescontoParaOrcamentoComMaisDeXValor(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        System.out.println("Tentando aplicar DescontoParaOrcamentoComMaisDeXValor");
        if (orcamento.getValor().compareTo(new BigDecimal(VALOR_ORCAMENTO_DESCONTO)) > 0) {
            return orcamento.getValor().multiply(new BigDecimal(PERCENTUAL_DESCONTO));
        }
     
        return proximo.calcular(orcamento);
    }
}