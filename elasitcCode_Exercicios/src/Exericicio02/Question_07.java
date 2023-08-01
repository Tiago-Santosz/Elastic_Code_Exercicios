package Exericicio02;

public class Question_07 {

	public static void main(String[] args) {
		double divMultiplos = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				divMultiplos =(double) i / 2;
				System.out.println("Divvisao dos multiplos de 3| "+i+ " de (1 a 100): " + divMultiplos);
			}
			
		}
          
	}

}

/*
 * 7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
 * 100, usando os tipos de dados int e double .
 */