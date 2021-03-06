package br.com.lucio.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.lucio.loja.orcamento.situacao.EmAnalise;
import br.com.lucio.loja.orcamento.situacao.Finalizado;
import br.com.lucio.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

    private UUID id;
    private BigDecimal valor;
    private List<Orcavel> itens;
    /*private String situacao;*/
    private SituacaoOrcamento situacao;
    private String cepEntrega;

    public Orcamento() {
        this.id = UUID.randomUUID();
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        //Situacao começa com em analise, para fazer o uso do padrao State
        this.situacao = new EmAnalise();
    }
    public UUID getId() {
        return id;
    }

    public BigDecimal getValor() {
    	/* Digamos que esse getValor venha de uma Api*/
    	try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
        return valor;
    }

    public int getQuantidadeItens() {
        return itens.size();
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
    
    public boolean isNotFinalizado() {
        return !this.isFinalizado();
    }
    
    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }

    public String getCepEntrega() {
        return cepEntrega;
    }

    public void setCepEntrega(String cepEntrega) {
    	this.cepEntrega = cepEntrega;
    }

    public void adicionarItem(Orcavel item) {
    	this.valor = this.valor.add(item.getValor());
    	this.itens.add(item);
    }
    
}
