package exercicio03.herança.cursojava;

public class Program_fornecedor {

	public static void main(String[] args) {
		float saldoFornecedor0;
		float saldoFornecedor1;

		Fornecedor fornecedor0 = new Fornecedor("Marcos", "Bahia-Brasil", "75998103315", 2000.10f, 400.50f);
		Fornecedor fornecedor1 = new Fornecedor("Paulo", "7596895567", 2400f, 350.65f);

		System.out.println("Fornecedor 1: ");
		System.out.println("Nome: " + fornecedor0.getNome());
		System.out.println("Endereco: " + fornecedor0.getEndereco());
		System.out.println("Telefone: " + fornecedor0.getTelefone());
		
		saldoFornecedor0 = fornecedor0.obterSaldo();
		System.out.println("Saldo: " + saldoFornecedor0);
		System.out.println();
		
		System.out.println("Fornecedor 2: ");
		System.out.println("Nome: " + fornecedor1.getNome());
		System.out.println("Telefone: " + fornecedor1.getTelefone());
		
		saldoFornecedor1 = fornecedor1.obterSaldo();
		System.out.println("Saldo: " + saldoFornecedor1);
		
	}

}
