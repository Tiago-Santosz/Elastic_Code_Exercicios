package exercicio03.herança.cursojava;

public class Fornecedor extends Pessoa {
	private float valorCredito; // crédito máximo do Fornecedor
	private float valorDivida; // total da divida do Fornecedor

	public Fornecedor() {
		super();
	}

	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Fornecedor(String nome, String telefone, float valorCredito, float valorDivida) {
		super(nome, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

	public float obterSaldo() {
		return valorCredito - valorDivida;
	}

}
