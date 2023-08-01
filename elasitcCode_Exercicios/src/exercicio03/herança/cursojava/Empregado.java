package exercicio03.herança.cursojava;

public class Empregado extends Pessoa {
	private int codigoSetor; // codigo do setor do Empregado
	private double salarioBruto;// salario base sem descontos
	private double imposto; // porcentagem de impostos sobre o salario

	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBruto,
			double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}

	
	public Empregado(String nome, String telefone, int codigoSetor, double salarioBruto, double imposto) {
		super(nome, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}


	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario( ) {
		double salarioLiquido = salarioBruto - (salarioBruto * (imposto / 100));
		return salarioLiquido ;
	}

}
