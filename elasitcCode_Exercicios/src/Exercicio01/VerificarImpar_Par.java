package Exercicio01;

import java.util.Scanner;

public class VerificarImpar_Par {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero e descubrar se e PAR ou IMPAR: ");
		int num = sc.nextInt();
		System.out.println();
		if (num % 2 == 0) {
			System.out.println("O valor digitado = " + num + " e Par.");
		} else {
			System.out.println("O valor digitado = " + num + " e Impar.");
		}

		sc.close();
	}

}

//8. Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.