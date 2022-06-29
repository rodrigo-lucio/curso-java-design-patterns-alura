package br.com.lucio.loja.pedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.lucio.loja.orcamento.Orcamento;
import br.com.lucio.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

    /* @Autowired do Spring */
    private List<AcaoAposGerarPedido> acoes = new ArrayList<>();

    public void execute(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValor(), geraPedido.getQtdItens(), "89500010");
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);
		
		/*  
		Padr�o Observer:
		Para a classe n�o crescer cada vez que surgir um novo observador, criamos uma lista de interface de observadores
		Antes do padr�o Observer estava assim:
		EnviarEmailPedido emailPedido = new EnviarEmailPedido();
		SalvarPedidoBancoDeDados salvarPedido = new SalvarPedidoBancoDeDados();
		
		emailPedido.executar(pedido);
		salvarPedido.executar(pedido);
		*/
		notificarObservadores(pedido);
		
	}
    
    public void adicionarObservadores(AcaoAposGerarPedido... observadores) {
        acoes.addAll(List.of(observadores));
    }

    private void notificarObservadores(Pedido pedido) {
        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
	
}