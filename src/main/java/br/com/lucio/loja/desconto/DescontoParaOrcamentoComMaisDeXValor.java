package br.com.lucio.loja.desconto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeXValor extends Desconto {
    private static final String PERCENTUAL_DESCONTO = "0.2";
    private static final String VALOR_ORCAMENTO_DESCONTO = "500";

    public DescontoParaOrcamentoComMaisDeXValor(Desconto proximo) {
        super(proximo);
    }

    /* Aplicando o padrão Template Method
     * Aqui jogamos essa lógica para a classe Desconto, pois a classe DescontoParaOrcamentoComMaisDeXItens implementava
     * uma lógica parecida, apenas mudando o if
    public BigDecimal calcular(Orcamento orcamento) {
        System.out.println("Tentando aplicar DescontoParaOrcamentoComMaisDeXValor");
        if (orcamento.getValor().compareTo(new BigDecimal(VALOR_ORCAMENTO_DESCONTO)) > 0) {
            return orcamento.getValor().multiply(new BigDecimal(PERCENTUAL_DESCONTO));
        }
     
        return proximo.calcular(orcamento);
    }
    */

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal(VALOR_ORCAMENTO_DESCONTO)) > 0;
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
    	System.out.println("Efetuando calculo na classe DescontoParaOrcamentoComMaisDeXValor, percentual de desconto aplicado: " + PERCENTUAL_DESCONTO);
        return orcamento.getValor().multiply(new BigDecimal(PERCENTUAL_DESCONTO));
    }

}
