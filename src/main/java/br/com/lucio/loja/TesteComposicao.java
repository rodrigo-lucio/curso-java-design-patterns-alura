package br.com.lucio.loja;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.ItemOrcamento;
import br.com.lucio.loja.orcamento.Orcamento;
import br.com.lucio.loja.orcamento.OrcamentoProxy;

public class TesteComposicao {

    public static void main(String[] args) {

        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        orcamentoAntigo.reprovar();
        
        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        orcamentoNovo.adicionarItem(orcamentoAntigo);
        
        /*
         * Padrão Composite: "Irmão do Decorator"
         * Componto um objeto em outro: No caso aqui, compondo um Orcamento em Outro
         * Agora o novo valor do orcamento é 700, somando o valor do antigo
         * Apenas adicionamos uma interface Orcavel, entre Itens e Orcamentos, assim conseguimos ter esse valor
         */
        
        /* Alteramos o get valor para ter um Sleep, simulando que esse valor venha de uma api externa
         * Mas se chamarmos duas vezes, ele demora o dobro do tempo, perdendo performance
         * Vamos resolver isso com o Padrão Proxy, implementando uma espécie de cache
         * Ele serve para interceptar as chamadas ao objeto original, com isso conseguimos fazer otimizações, validaçoes, etc...
         * A JPA com Hibernate tem o conceito de proxy quando faz atributos lazy por exemplo
         * */
        
        System.out.println(orcamentoNovo.getValor());
        System.out.println(orcamentoNovo.getValor());
        
        OrcamentoProxy proxy  = new OrcamentoProxy(orcamentoNovo);
        /* Chamada esperando apenas uma vez, a partir da segunda não demora mais */
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        
    }

}
