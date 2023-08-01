package Exercicio01;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		int soma = 0;
		double media;
		int contador = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero:");
		int numero = sc.nextInt();

		while (contador < 50) {
			System.out.print("Digite um numero " +contador+": ");
			numero = sc.nextInt();
			soma += numero;
			contador++;
		}

		media = (double) soma / 50;
		System.out.println("Media aritimetica dos numeros digitados: " + media);
     sc.close();
	}

}

/*
 * 14. Faça um programa que utilize a estrutura while para ler 50 números e
 * calcule e exiba a média aritmética deles. (Pesquise sobre como realizar
 * entrada de dados)
 */
