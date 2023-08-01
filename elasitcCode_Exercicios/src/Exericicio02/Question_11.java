package Exericicio02;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite duas Palavras para verificar sua ordem alfabetica:");
		System.out.println();
		System.out.print("Palavra 1: ");
		String palavra1 = sc.next();
		System.out.print("Palavra 2: ");
		String palavra2 = sc.next();
		System.out.println();
		
		int comparacao = palavra1.compareTo(palavra2);
		
		if(comparacao < 0 ){
			System.out.println("Ordem de impressao alfabetica: " + palavra1 +" " + palavra2 );
		}
		else if(comparacao > 0) {
			System.out.println("Ordem de impressao alfabetica: " + palavra2 +" "+ palavra1 );
		}
		
		if(palavra1.length() > palavra2.length()) {
			System.out.println("A maior palavra e = " + palavra1);
		}
		else if(palavra2.length() > palavra1.length()){
			System.out.println("A maior palavra e = " + palavra2);
		}
		sc.close();

	}

}

/*11. Escreva um programa que tenha duas palavras como entrada, e a saída imprima as
palavras em ordem alfabética (utilize o método compareTo da classe String),. Informe
também, qual das palavras tem o maior número de caracteres.*/
