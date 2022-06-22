package br.com.lucio.loja.pedido;

import java.time.LocalDateTime;

import br.com.lucio.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pedido {

	private String cliente;
	private LocalDateTime data;
	private Orcamento orcamento;
	
	
}
