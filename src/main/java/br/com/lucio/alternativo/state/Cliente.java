package br.com.lucio.alternativo.state;

public class Cliente {
	
	/*
	 * Controle de Estado do mario:
	 * Começa com Mario pequeno:
	 * Quando esta pequeno e pega cogumelo: Vira Mario grande:
	 * Quando esta grande e toma dano, vira pequeno, e assim consequentemente.....
	 */
	
	public static void main(String[] args) {
		Mario mario = new Mario();
		mario.pegarCogumelo();
		mario.pegarPena();
		mario.levarDano();
		mario.pegarFlor();
		mario.pegarFlor();
		mario.levarDano();
		mario.levarDano();
		mario.pegarPena();
		mario.levarDano();
		mario.levarDano();
		mario.levarDano();
		mario.levarDano();
	}
}
