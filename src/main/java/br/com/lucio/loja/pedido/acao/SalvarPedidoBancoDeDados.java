package br.com.lucio.loja.pedido.acao;

import br.com.lucio.loja.pedido.Pedido;

public class SalvarPedidoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
       System.out.println("Salvando pedido no banco de dados....");
    }
    
}
