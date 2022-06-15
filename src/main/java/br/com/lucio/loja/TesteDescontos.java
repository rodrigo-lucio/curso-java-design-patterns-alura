package br.com.lucio.loja;

import java.math.BigDecimal;

import br.com.lucio.loja.desconto.CalculadoraDescontos;
import br.com.lucio.loja.orcamento.Orcamento;

public class TesteDescontos {

    public static void main(String[] args) {

        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 4);
        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        System.out.println(calculadoraDescontos.calcular(orcamento1));
        
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1200"), 6);
        System.out.println(calculadoraDescontos.calcular(orcamento2));
        
    }

}
