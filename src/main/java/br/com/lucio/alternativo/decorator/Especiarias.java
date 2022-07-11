package br.com.lucio.alternativo.decorator;

public class Especiarias extends DrinkDecorator {

	public Especiarias(Drink umCoquetel) {
		super(umCoquetel);
		super.setNome("Especiarias"); 
		super.setPreco(2.30);
	}
	
}
