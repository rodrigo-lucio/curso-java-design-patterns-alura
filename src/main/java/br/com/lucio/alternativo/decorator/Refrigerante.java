package br.com.lucio.alternativo.decorator;

public class Refrigerante extends DrinkDecorator {

	public Refrigerante(Drink umCoquetel) {
		super(umCoquetel);
		super.setNome("Refrigerante"); 
		super.setPreco(1.0);
	}
	

}
