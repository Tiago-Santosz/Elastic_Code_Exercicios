package Exercicio01;

public class Question05 {

	public static void main(String[] args) {
		int codigo = 002;

		if (codigo == 001) {
			System.out.println("Produto: Parafuso");
		}
		else if (codigo == 002) {
			System.out.println("Produto: Porca");
		}
		else if(codigo == 003) {
			System.out.println("Produto: Prego");
		}
		else {
			System.out.println("Codigo Invalido");
		}
		
	}

}

/*11. Utilize a estrutura if para fazer um programa que retorne o nome de um
produto a partir do código do mesmo. Considere os seguintes códigos:

001 ? Parafuso;
002 ? Porca;
003 ? Prego;

Para qualquer outro código: XXX ? Diversos.
*/