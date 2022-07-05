package br.com.lucio.loja;

import java.math.BigDecimal;
import java.util.List;

import br.com.lucio.loja.pedido.GeraPedido;
import br.com.lucio.loja.pedido.GeraPedidoHandler;
import br.com.lucio.loja.pedido.acao.EnviarEmailPedido;
import br.com.lucio.loja.pedido.acao.LogPedido;
import br.com.lucio.loja.pedido.acao.SalvarPedidoBancoDeDados;

public class TestePedidos {

	public static void main(String[] args) {
		String cliente = "Rodrigo Lucio";
		BigDecimal valorOrcamento = new BigDecimal(123);
		int qtdItens = 5;
		
		/*
		Pattern Command: 
		Extraimos todo esse conteudo para a classe GeraPedido
		Orcamento orcamento = new Orcamento(valorOrcamento, qtdItens);
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido");
		System.out.println("Enviar email");
		*/
		
		// O Command separa em comando o que vc quer fazer com os dados recebidos
		GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, qtdItens);
		
        // Os dados de GeraPedido poderiam vir de uma API, de um botao, de um atalho, ou de diferentes fontes de dados por exemplo
        GeraPedidoHandler handler = new GeraPedidoHandler();//
        handler.adicionarObservadores(new EnviarEmailPedido(), 
                                      new SalvarPedidoBancoDeDados(),
                                      new LogPedido()
                                      /* se tiver nova ação, vai passar aqui*/);
        
        /* Metodo execute esta funcionando como uma Fachada, escondendo toda a complexidade que temos em executar a geração do pedido*/
        handler.execute(geraPedido);

	}

}
