package br.com.lucio.alternativo.decorator;

public class Energetico extends DrinkDecorator {

	public Energetico(Drink umCoquetel) {
		super(umCoquetel);
		super.setNome("Energético"); 
		super.setPreco(2.32);
	}
	

}
