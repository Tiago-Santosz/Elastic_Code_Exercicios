package exercicio03.herança.cursojava;

public class Administrador extends Empregado {
	private double ajudaDeCusto; //Ajuda para viagens, estadias

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBruto,
			double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBruto, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double calcularSalario( ) {
		double salarioLiquido = super.getSalarioBruto() - (super.getSalarioBruto() * (super.getImposto() / 100));
		double salarioAdmin = salarioLiquido + this.ajudaDeCusto;
		return  salarioAdmin;
	}

}
