package br.com.lucio.loja.pedido;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GeraPedido {

	private String cliente;
	private BigDecimal valor;
	private int qtdItens;
	
}
