package br.com.lucio.alternativo.decorator;

public class Suco extends DrinkDecorator {

	public Suco(Drink umCoquetel) {
		super(umCoquetel);
		super.setNome("Suco"); 
		super.setPreco(1.25);
	}

}
