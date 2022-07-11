package br.com.lucio.alternativo.decorator;

public class Frutas extends DrinkDecorator {

	public Frutas(Drink umCoquetel) {
		super(umCoquetel);
		super.setNome("Frutas"); 
		super.setPreco(1.0);
	}
	
}
