package Exericicio02;

import java.util.Locale;
import java.util.Scanner;

public class Question_09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio e descubra a area do circulo: ");
		int raio = sc.nextInt();

		Circulo09 circulo = new Circulo09(raio);

		System.out.printf("A area do circulo = %.2f", circulo.calcularArea());
		sc.close();
	}

}

/*
 * 9. Escreva uma classe para calcular a área de um círculo, sabendo que a área
 * é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado
 * terá que ser arredondado.
 */