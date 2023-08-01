package Exericicio02;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de tanques que deseja monitorar: ");
		int tanque = sc.nextInt();
		int quilometroTotal = 0;
		int litroTotal = 0;

		int[] quilometros = new int[tanque];
		int[] gasolina = new int[tanque];
		double[] consumo = new double[tanque];

		for (int i = 0; i < tanque; i++) {
			System.out.println();
			System.out.print("Quilometros: ");
			quilometros[i] = sc.nextInt();
			System.out.print("Gasolina: ");
			gasolina[i] = sc.nextInt();
			consumo[i] = (double) quilometros[i] / gasolina[i];
			quilometroTotal += (double )quilometros[i];
			litroTotal += gasolina[i];
		}
		sc.close();
		System.out.println();
		for (int i = 0; i < tanque; i++) {
			
			System.out.printf("Tanque %d: %.2f km/l",  (i + 1), consumo[i]);
			System.out.println();
		}
		System.out.println();
		System.out.printf("Quilometragem Total: %d km\n", quilometroTotal);
		System.out.println("Total  de litros consumido: " + litroTotal + "l");
	}	

}

/*
 * 12. Os motoristas se preocupam com a quilometragem obtida por seus
 * automóveis. Um motorista monitorou vários tanques cheios de gasolina
 * registrando a quilometragem dirigida e a quantidade de combustível em litros
 * utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba
 * como entrada os quilômetros dirigidos e os litros de gasolina consumidos
 * (ambos com inteiros) para cada tanque cheio. O programa deve calcular e
 * exibir o consumo em quilômetros/litro para cada tanque cheio e imprimir a
 * quilometragem combinada e a soma total de litros de combustível consumidos
 * até esse ponto. Todos os cálculos de média devem produzir resultados de ponto
 * flutuante.
 */