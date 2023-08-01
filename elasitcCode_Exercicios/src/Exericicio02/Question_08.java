package Exericicio02;

import java.util.Scanner;

public class Question_08 {

	public static void main(String[] args) {
		Palindromo08 verificacao = new Palindromo08();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra e verifique se ela pode ser lida da direita para esquerda: ");
		String verPalavra = sc.next();

		if (verificacao.palindromo(verPalavra)) {
			System.out.println("Palavra pode ser lida! ");
		} else {
			System.out.println("Palavra nao pode ser lida ");
		}
		sc.close();

	}

}

/*
 * 8. Criar uma classe Java que receba uma palavra (String) retorne uma mensagem
 * caso a palavra fornecida seja uma palavra que pode ser lida da esquerda pra
 * direita ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana,
 * arara, osso, etc.
 */
