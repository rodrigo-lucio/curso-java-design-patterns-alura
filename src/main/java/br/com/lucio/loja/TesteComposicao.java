package br.com.lucio.loja;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.ItemOrcamento;
import br.com.lucio.loja.orcamento.Orcamento;

public class TesteComposicao {

    public static void main(String[] args) {

        Orcamento orcamentoAntigo = new Orcamento("89500010");
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        orcamentoAntigo.reprovar();
        
        Orcamento orcamentoNovo = new Orcamento("89500010");
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        orcamentoNovo.adicionarItem(orcamentoAntigo);
        
        
        /*
         * Padrão Composite: "Irmão do Decorator"
         * Componto um objeto em outro: No caso aqui, compondo um Orcamento em Outro
         * Agora o novo valor do orcamento é 700, somando o valor do antigo
         * Apenas adicionamos uma interface Orcavel, entre Itens e Orcamentos, assim conseguimos ter esse valor
         */
        System.out.println(orcamentoNovo.getValor());
    }

}
