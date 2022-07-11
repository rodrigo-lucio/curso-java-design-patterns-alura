package br.com.lucio.alternativo.decorator;

public abstract class Drink {
	private String nome;
	private double preco;

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
	
}
