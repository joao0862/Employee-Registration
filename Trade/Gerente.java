package Gerente;

import Funcionario.Funcionario;

public class Gerente extends Funcionario{
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido.");
			return true;
		}else {
			System.out.println("Acesso negado.");
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public double getBonificacao() {
		return extracted();
	}

	private double extracted() {
		return this.salario * 0.15;
	}
}