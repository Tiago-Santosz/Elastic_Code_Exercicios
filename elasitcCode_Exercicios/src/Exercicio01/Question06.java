package Exercicio01;


public class Question06 {

	public static void main(String[] args) {
		
		int num = 100;
		double div;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				div = i / 2;

				System.out.println();
				System.out.print("Multiplos de 3 = " + i);
				System.out.println();

				System.out.print("Divisao: " + div);
				System.out.println();

			}
		}
	}

}


//12. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .