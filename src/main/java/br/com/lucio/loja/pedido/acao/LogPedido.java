package br.com.lucio.loja.pedido.acao;

import br.com.lucio.loja.pedido.Pedido;

public class LogPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
       System.out.println("Gerando log do pedido....");
    }
    
}
