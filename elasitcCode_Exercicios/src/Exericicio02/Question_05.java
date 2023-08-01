package Exericicio02;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero de (1 a 7) e descubra o dia da semana: ");
		int diaDaSemana = sc.nextInt();
		System.out.println();

		switch (diaDaSemana) {
		case 1:
			System.out.print("--Segunda-feira!--");
			break;
			
		case 2:
			System.out.print("--Terca-feira!--");
			break;
			
		case 3:
			System.out.print("--Quarta-feira!--");
			break;
			
		case 4:
			System.out.print("--Quinta-feira!--");
			break;
		
		case 5:
			System.out.print("--Quinta-feira!--");
			break;
		
		case 6:
			System.out.print("--Sexta-feira!--");
			break;
			
		case 7:
			System.out.print("Sabado!");
			break;
		default:
			System.out.println("Numero invalido!!!");

		}
		sc.close();

	}

}

/*
 * 5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
 * tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
 * Terça corresponde a 2, e assim por diante. Utilizando Array.
 */