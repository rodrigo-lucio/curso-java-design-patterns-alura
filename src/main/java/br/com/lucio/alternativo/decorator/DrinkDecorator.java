package br.com.lucio.alternativo.decorator;

public abstract class DrinkDecorator extends Drink {
	private Drink coquetel;

	protected DrinkDecorator(Drink coquetel) {
		this.coquetel = coquetel;
	}

	@Override
	public String getNome() {
		return this.coquetel.getNome() + " + " + super.getNome();
	}

	@Override
	public double getPreco() {
		return this.coquetel.getPreco() + super.getPreco();
	}
}
