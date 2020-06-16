package Professor;

import Empregado_faculdade.Empregado_faculdade;

public class Professor extends Empregado_faculdade {
	private int horasaula;
	
	/*10 reais por hora aula*/	
	
	public double getGastos() {
		return (this.salario + (this.horasaula * 10));
	}
	
	public String getInfo() {
		String informacaobasica = super.getInfo();
		String informacao = informacaobasica + " " + "e com " + this.horasaula + " " + "reais a hora/aula";
		return informacao;
	}
	
	public void setHorasaula(int horas) {
		this.horasaula = horas;
	}
	
	public int getHorasaula() {
		return this.horasaula;
	}

}
