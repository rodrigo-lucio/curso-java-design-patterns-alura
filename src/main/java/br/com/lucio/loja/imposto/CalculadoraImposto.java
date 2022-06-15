package br.com.lucio.loja.imposto;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.Orcamento;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto /*TipoImposto tipoImposto*/ ) {
        return imposto.calcular(orcamento);
        
        /* Utilizando o Strategy
         * PROBLEMA: Antes de utilizar o strategy com o tipo de imposto, ficava com neste trecho comentado:
         * 
         * Agora criamos para cada imposto uma classe, e aqui no metodo calcular recebemos a interface de imposto
         * 
         * switch (tipoImposto) {
         * case ICMS:
         *      return orcamento.getValor().multiply(new BigDecimal("0.17"));
         * case IPI:
         *      return orcamento.getValor().multiply(new BigDecimal("0.10"));
         * default:
         *      return BigDecimal.ZERO;
         * }
         */
    }

}
