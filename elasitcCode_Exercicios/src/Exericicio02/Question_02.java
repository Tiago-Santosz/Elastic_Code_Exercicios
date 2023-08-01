package Exericicio02;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		System.out.println("Digite dois valores e descubra o maior: ");
		Scanner sc = new Scanner(System.in);
	    System.out.println();
		System.out.print("Numero 1: ");
		int number1 = sc.nextInt();
		System.out.println();
		System.out.print("Numero 2: ");
		int number2 = sc.nextInt();
		System.out.println();
		
		if(number1 > number2) {
			System.out.println("O maior numero e: " +number1);
		}else if(number1 < number2){
			System.out.println("O maior numero e: " +number2);
		}else {
			System.out.println("Os numeros sao iguais!");
		}
		
	sc.close();
	}

}

//2. Faça um programa que receba 2 valores e retorne o maior entre eles.