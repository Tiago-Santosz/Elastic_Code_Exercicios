package exercicio03.herança.cursojava;

public class Program_vendedor {

	public static void main(String[] args) {
		
	Vendedor vend = new Vendedor("Julia", "Rua Maraja n98", "7798098414", 24, 1320, 14.0, 355, 15.0);

	System.out.println("Digite os dados do Empregado e descubra seu salario Final:");
	System.out.println();
	System.out.println("Nome: " + vend.getNome());
	System.out.println("Endereco: " + vend.getEndereco());
	System.out.println("Telefone: " + vend.getTelefone());
	System.out.println("Endereco: " + vend.getEndereco());
	System.out.println("Telefone: " + vend.getTelefone());
	System.out.println("Codigo do Setor: " + vend.getCodigoSetor());
	System.out.println("Salario Base: " + vend.getSalarioBruto());
	System.out.println("Imposto: " + vend.getImposto() + "%");
	System.out.println("Valor das Vendas: " + vend.getValorVendas());
	System.out.println("Porcentagem da Comissao: " + vend.getComissao() + "%");
	
	
	System.out.println();
	System.out.printf("Salario Liquido: %.2f", vend.calcularSalario());
	
	
	}

}
