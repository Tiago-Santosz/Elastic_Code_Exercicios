package exercicio03.herança.cursojava;

public class Program_administrador {

	public static void main(String[] args) {
		Administrador admin = new Administrador(null, null, null, 0, 0, 0, 0);
		
		System.out.println("Digite os dados do Empregado e descubra seu salario Final:");
		System.out.println();
		System.out.println("Nome: " + admin.getNome());
		System.out.println("Endereco: " + admin.getEndereco());
		System.out.println("Telefone: " + admin.getTelefone());
		System.out.println("Codigo do Setor: " + admin.getCodigoSetor());
		System.out.println("Salario Base: " + admin.getSalarioBruto());
		System.out.println("Ajuda de Custo: " + admin.getAjudaDeCusto());
		System.out.println("Imposto: " + admin.getImposto() + "%");
		System.out.println();
		System.out.println("Salario Liquido: " + admin.calcularSalario());

	}

}
