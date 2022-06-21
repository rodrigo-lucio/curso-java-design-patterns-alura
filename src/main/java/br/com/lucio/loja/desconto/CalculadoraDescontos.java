package br.com.lucio.loja.desconto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        
        /*
         * Aqui não conseguimos utilizar o strategy pois não sabemos que regra iremos aplicar, temos que encotrar uma regra que se aplique
         * Se utilizasse o strategy, estes IFs ficariam juntos de qualquer forma.
         * Precisamos percorrer todos até encontrar um tipo de desconto que seja aplicado
         */

        /* PROBLEMA antes de aplicar o padrão:
         * if (orcamento.getQuantidadeItens() > 5) {
         *  return orcamento.getValor().multiply(new BigDecimal("0.1"));
         * }
         * if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
         *  return orcamento.getValor().multiply(new BigDecimal("0.1"));
         * }
         */
        
        /*
         * Aqui utilizamos o Chain of Responsability, ou seja, corrente de responsabilidades
         * Vamos chamando classe a classe até que consigamos encontrar uma que seja aplicada 
         * Até chegar no fim dessa corrente
         */
        Desconto desconto = new DescontoParaOrcamentoComMaisDeXItens(
                                    new DescontoParaOrcamentoComMaisDeXValor(
                                                new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
