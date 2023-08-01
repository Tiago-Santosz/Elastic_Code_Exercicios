package exercicio03.herança.cursojava;

public class Program_Operario {

	public static void main(String[] args) {
		Operario opr = new Operario("Grazi", "Aracaju-BA", "071999874589", 56, 1320, 14.0, 300.60, 5.0);
		
		System.out.println("Digite os dados do Empregado e descubra seu salario Final:");
		System.out.println();
		System.out.println("Nome: " + opr.getNome());
		System.out.println("Endereco: " + opr.getEndereco());
		System.out.println("Telefone: " + opr.getTelefone());
		System.out.println("Endereco: " + opr.getEndereco());
		System.out.println("Telefone: " + opr.getTelefone());
		System.out.println("Codigo do Setor: " + opr.getCodigoSetor());
		System.out.println("Salario Base: " + opr.getSalarioBruto());
		System.out.println("Imposto: " + opr.getImposto() + "%");
		System.out.println("Valor da Producao: " + opr.getValorProducao());
		System.out.println("Porcentagem da Comissao: " + opr.getComissao() + "%");
		
		
		System.out.println();
		System.out.println("Salario Liquido: " + opr.calcularSalario());

	}

}
