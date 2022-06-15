package br.com.lucio.loja.desconto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeXItens extends Desconto {
    private static final String PERCENTUAL_DESCONTO = "0.1";
    private static final int QUANTIDADE_ITENS_DESCONTO = 5;

    public DescontoParaOrcamentoComMaisDeXItens(Desconto proximo) {
        super(proximo);
    }


    /* Aplicando o padrão Template Method
     * Aqui jogamos essa lógica para a classe Desconto, pois a classe DescontoParaOrcamentoComMaisDeXValor implementava
     * uma lógica parecida, apenas mudando o if
    public BigDecimal calcular(Orcamento orcamento) {
        System.out.println("Tentando aplicar DescontoParaOrcamentoComMaisDeXItens");
        if (orcamento.getQuantidadeItens() > QUANTIDADE_ITENS_DESCONTO) {
            return orcamento.getValor().multiply(new BigDecimal(PERCENTUAL_DESCONTO));
        }

        return proximo.calcular(orcamento);
    }
    */
    
    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > QUANTIDADE_ITENS_DESCONTO;
    }
    
    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(PERCENTUAL_DESCONTO));
    }
    

}
