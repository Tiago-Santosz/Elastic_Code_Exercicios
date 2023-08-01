package Exericicio02;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Digite uma palavra ou frase e verifique as quantidades de (Consoantes, Vogais, Espaocos): ");
           String texto = sc.nextLine();
           
           Caracters10 contador = new Caracters10(texto);
           contador.contarVogais();
           contador.ContarEspacoBranco();
           contador.contarConsoante();
           
           System.out.println();
           System.out.printf("Qtd.Vogais: " + contador.getContadorVogais());
           System.out.println();
           System.out.printf("Qtd.Espacos em branco: " + contador.getContadorEsp());
           System.out.println();
           System.out.printf("Qtd.Consoantes: " + contador.getContadorConsoante());
           sc.close();
	}

}

/*
 * 10. Escreva uma classe que conte a quantidade de vogais, espaços em brancos e
 * consoantes de uma cadeia de caracteres.
 */