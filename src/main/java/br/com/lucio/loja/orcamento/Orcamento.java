package br.com.lucio.loja.orcamento;

import java.math.BigDecimal;

import br.com.lucio.loja.orcamento.situacao.EmAnalise;
import br.com.lucio.loja.orcamento.situacao.Reprovado;
import br.com.lucio.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    /*private String situacao;*/
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	public SituacaoOrcamento getSituacao() {
		return this.situacao;
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
    public void aplicarDescontoExtra() {
    	/* Problema de transiçao de estados - Pattern State
    	BigDecimal valorDescontoExtra = BigDecimal.ZERO;
    	if(this.situacao.equals("EM_ANALISE")) {
    		valorDescontoExtra = new BigDecimal("0.05");
    	} else if (this.situacao.equals("APROVADO")) {
    		valorDescontoExtra = new BigDecimal("0.02");
    	}
    	this.valor = this.valor.subtract(valorDescontoExtra);
    	
    	Para resolver isso, criamos uma classe mae SituacaoOrcamento.
    	Onde fazemos a transicao de estados e de valores de desconto que podem ser aplicados dependendo 
    	da situacao do orcamento
    	 */
    	BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
    	this.valor = this.valor.subtract(valorDescontoExtra);
    }
}
