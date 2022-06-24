package br.com.lucio.loja;

import java.math.BigDecimal;

import br.com.lucio.loja.desconto.CalculadoraDescontos;
import br.com.lucio.loja.orcamento.Orcamento;

public class TesteDescontos {

    public static void main(String[] args) {

        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 4, "89500010");
        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        System.out.println(calculadoraDescontos.calcular(orcamento1));
        
        orcamento1.aprovar();
        /* orcamento1.reprovar(); vai dar Exception do State, se chamado logo apos o Aprovar */
        orcamento1.finalizar(); // Se chamar o finalizar sem aprovar/reprovar antes, vai dar Exception do State
        
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1200"), 6, "89500010");
        System.out.println(calculadoraDescontos.calcular(orcamento2));
        
    }

}
