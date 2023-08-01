package Exericicio02;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		double quilometro = 1.609;
		int milha;
		 double conversao;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe sua qantidade de milhas e troque por quilometros:");
		milha = sc.nextInt();
		
		conversao = quilometro * milha;
		
		System.out.println("Voce tem " + conversao+ " em quilometros!" );
		sc.close();
	}

}

/*
 * 4. Pretende-se escrever um programa que leia do teclado uma distância
 * expressa em milhas, converte-a para quilômetros e apresenta o resultado no
 * console. (fórmula de conversão: 1 milha = 1.609 km).
 */