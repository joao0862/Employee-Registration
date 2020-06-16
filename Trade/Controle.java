package Controle;

import Funcionario.Funcionario;

public class Controle {
	private double totalDeBonificacao = 0;
	
	public void registra(Funcionario funcionario) {
		this.totalDeBonificacao += funcionario.getBonificacao();
	}
	
	public double getTotalDeBonificacao() {
		return this.totalDeBonificacao;
	}
}
