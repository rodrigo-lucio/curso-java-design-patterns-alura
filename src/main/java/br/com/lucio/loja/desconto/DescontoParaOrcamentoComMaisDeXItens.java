package br.com.lucio.loja.desconto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeXItens extends Desconto {
    private static final String PERCENTUAL_DESCONTO = "0.1";
    private static final int QUANTIDADE_ITENS_DESCONTO = 5;

    public DescontoParaOrcamentoComMaisDeXItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        System.out.println("Tentando aplicar DescontoParaOrcamentoComMaisDeXItens");
        if (orcamento.getQuantidadeItens() > QUANTIDADE_ITENS_DESCONTO) {
            return orcamento.getValor().multiply(new BigDecimal(PERCENTUAL_DESCONTO));
        }
        
        return proximo.calcular(orcamento);
    }
    
}
