package Exercicio01;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores para efetuar uma troca:");
		System.out.println();
		System.out.print("Digite valor A: ");
		int A = sc.nextInt();
		System.out.print("Digite valor B: ");
		int B = sc.nextInt();
		System.out.println();
		System.out.print("A = " + A);
		System.out.println();
		System.out.print("B = " + B);

		
		A = B;
		B = A;
		System.out.println();
		System.out.println();
		System.out.println("Valores pos inversao:");
		System.out.println();
		System.out.print("A = " + A);
		System.out.println();
		System.out.print("B = " + B);

		sc.close();
	}

}

/*7. Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma
que a variável A passe a possuir o valor da variável B e que a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
*/

