package Exericicio02;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		System.out.println("Digite um numero e descubra os numeros primos menores que ele: ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int contador = 2;
			
			 for(int i = 2; i<=number; i++){
			 for(contador = 2; contador<i; contador++) {
				 if(contador % i == 0){
					 break;
				 } 
			 }
			 if(contador == i){
			System.out.println("Numeros primos: " +i);
			 }
			}
			 
			 

		
	sc.close();
	}

}

/*3. Crie uma classe e na função main() implemente um programa que lê um número
inteiro do teclado e imprime todos os números primos menores que ele (divisíveis por 1
ou por ele mesmo).*/