package br.com.lucio.loja;

import java.math.BigDecimal;

import br.com.lucio.loja.desconto.CalculadoraDescontos;
import br.com.lucio.loja.desconto.Desconto;
import br.com.lucio.loja.orcamento.ItemOrcamento;
import br.com.lucio.loja.orcamento.Orcamento;

public class TesteDescontos {

    public static void main(String[] args) {

        Orcamento orcamento1 = new Orcamento();
        for (int i = 0; i < 4; i++) {
        	orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("150")));
		}
        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        
        System.out.println("-----------------");
        System.out.println("Valor orcamento: " + orcamento1.getValor());
        System.out.println("Valor desconto: " + calculadoraDescontos.calcular(orcamento1));
        orcamento1.aprovar();
        /* orcamento1.reprovar(); vai dar Exception do State, se chamado logo apos o Aprovar */
        orcamento1.finalizar(); // Se chamar o finalizar sem aprovar/reprovar antes, vai dar Exception do State
        
        Orcamento orcamento2 = new Orcamento();
        for (int i = 0; i < 6; i++) {
        	orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("300")));
		}
        
        System.out.println("-----------------");
        System.out.println("Valor orcamento: " + orcamento2.getValor());
        System.out.println("Valor desconto: " + calculadoraDescontos.calcular(orcamento2));

        System.out.println("-----------------");
        Orcamento orcamentoSemDesconto = new Orcamento();
        orcamentoSemDesconto.adicionarItem(new ItemOrcamento(new BigDecimal("10")));
        System.out.println("Valor orcamento: " + orcamentoSemDesconto.getValor());
        System.out.println("Valor desconto: " + calculadoraDescontos.calcular(orcamentoSemDesconto));
    }

}
