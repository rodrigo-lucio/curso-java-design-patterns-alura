package br.com.lucio.loja;

import java.math.BigDecimal;

import br.com.lucio.loja.imposto.CalculadoraImposto;
import br.com.lucio.loja.imposto.ICMS;
import br.com.lucio.loja.imposto.IPI;
import br.com.lucio.loja.orcamento.Orcamento;

public class TesteImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1, "89500010");
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        
        /* Antes chamavamos assim com o tipo*/
        // calculadoraImposto.calcular(orcamento, TipoImposto.ICMS);
        
        /* Agora com o strategy, amarramos o metodo calcular com a interface */
        System.out.println(calculadoraImposto.calcular(orcamento, new IPI(null)));
        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS(null)));

        
    }

}
