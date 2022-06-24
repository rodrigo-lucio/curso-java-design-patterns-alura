package br.com.lucio.loja;

import java.math.BigDecimal;

import br.com.lucio.loja.desconto.CalculadoraDescontos;
import br.com.lucio.loja.http.HttpAdapterConsultaCep;
import br.com.lucio.loja.http.HttpClientViaCep;
import br.com.lucio.loja.http.HttpURLConnectionApiCep;
import br.com.lucio.loja.orcamento.BuscarCepOrcamento;
import br.com.lucio.loja.orcamento.Orcamento;

public class TesteBuscarCepAdapter {

    public static void main(String[] args) {

        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 4, "89500010");
        BuscarCepOrcamento cepOrcamento = new BuscarCepOrcamento(new HttpURLConnectionApiCep());
        System.out.println(cepOrcamento.consultarCep(orcamento1.getCepEntrega()));
        
        BuscarCepOrcamento cepOrcamentoImpl2 = new BuscarCepOrcamento(new HttpClientViaCep());
        System.out.println(cepOrcamentoImpl2.consultarCep(orcamento1.getCepEntrega()));
        
        
    }

}
