package exercicio03.herança.cursojava;

public class Vendedor extends Empregado {

	private double valorVendas;
	private double comissao;
	
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBruto, double imposto,
			double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBruto, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		double salarioLiquido = super.calcularSalario();
		double comissaoVendedor = valorVendas * (comissao / 100);
		return salarioLiquido + comissaoVendedor;	 
	}
}
