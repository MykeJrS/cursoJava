package br.com.sistemation.cm;

import br.com.sistemation.cm.modelo.Tabuleiro;
import br.com.sistemation.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,1);
		
		new TabuleiroConsole(tabuleiro);
	}
}
