package exercicio03.herança.cursojava;

public class Program_empregado {

	public static void main(String[] args) {

		Empregado empregado = new Empregado("Jonatas", "Sao Paulo-BR", "01198557663", 19, 1320, 14.0);
		
		System.out.println("Digite os dados do Empregado e descubra seu salario Final:");
		System.out.println();
		System.out.println("Nome: " + empregado.getNome());
		System.out.println("Endereco: " + empregado.getEndereco());
		System.out.println("Telefone: " + empregado.getTelefone());
		System.out.println("Codigo do Setor: " + empregado.getCodigoSetor());
		System.out.println("Salario Base: " + empregado.getSalarioBruto());
		System.out.println("Imposto: " + empregado.getImposto() + "%");
		System.out.println();
		System.out.println("Salario Liquido: " + empregado.calcularSalario());

	}

}
