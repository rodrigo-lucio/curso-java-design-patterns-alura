package br.com.lucio.loja;

import java.math.BigDecimal;

import br.com.lucio.loja.imposto.CalculadoraImposto;
import br.com.lucio.loja.imposto.ICMS;
import br.com.lucio.loja.imposto.IPI;
import br.com.lucio.loja.imposto.ISS;
import br.com.lucio.loja.orcamento.Orcamento;

public class TesteImpostosDecorator {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1, "89500010");
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        
        System.out.println(calculadoraImposto.calcular(orcamento, new IPI(null)));
        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS(null)));
        
        
        /*
         * Padrão Decorator
         * "Decorando" dois impostos com padrão Decorator, como se fosse uma árvore de natal
         * Aqui vai somar ICMS com IPI, com qualquer imposto a mais que quiser
         */
        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS(new IPI(null))));
        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS(new ISS(null))));
        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS(new ISS(new IPI(null)))));
        System.out.println(calculadoraImposto.calcular(orcamento, new IPI(new ISS(null))));

        
        
    }

}
