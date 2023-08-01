package exercicio03.herança.cursojava;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBruto, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBruto, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario( ) {
		double salarioLiquido = super.calcularSalario();
		double valorComissao = valorProducao * (comissao / 100);
		return salarioLiquido + valorComissao;
	}

}
