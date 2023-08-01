package Exercicio01;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int numero;
		int soma = 0;
		double media;

		do {
			System.out.print("Digite um numero "+contador+ ": ");
			numero = sc.nextInt();
			soma += numero;
			contador++;
		} while (contador < 50);
		media = (double) soma / 50;
		System.out.println("Media aritimetica dos numeros digitados: " + media);
		sc.close();
	}

}
