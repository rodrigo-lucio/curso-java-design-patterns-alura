package br.com.lucio.loja.pedido;

import java.time.LocalDateTime;

import br.com.lucio.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	public void execute(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValor(), geraPedido.getQtdItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);
		
		//Receberia os @Component / @Repository do Spring por exemplo, e chamaria
		System.out.println("Salvar pedido");
		System.out.println("Enviar email");
	}
	
}
