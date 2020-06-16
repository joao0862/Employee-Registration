package Empregado_faculdade;

public class Empregado_faculdade {
	private String nome;
	private String funcao;
	protected double salario;
	
	public double getGastos() {
		return this.salario;
	}
	
	public String getInfo() {
		String dados = "Nome: " + this.nome; 
		dados += "\nFunção: " + this.funcao;
		dados += "\nSalário: " + this.salario + " " + "reais";
		return dados;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getFuncao() {
		return this.funcao;
	}
	
}
