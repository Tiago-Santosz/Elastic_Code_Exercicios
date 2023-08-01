package Exericicio02;

public class Question_06 {

	public static void main(String[] args) {
      float produto = 1;
		for(int i = 15; i <= 30; i++){
			if(i % 2 != 0){
				;
				produto *= (float)i;
			}
		}
		System.out.printf("FLOAT: Produto dos numeros impares de (15 a 30): %.1f", produto);
		System.out.println();
		
		int produto1 = 1;
		for(int p = 15; p <= 30; p++){
			if(p % 2 != 0){
				
				produto1 *= p;
			}
		}
		System.out.printf(" INT: Produto dos numeros impares de (15 a 30): %d", produto1);
	}

}

/*
 * 6. Imprima produto dos números de ímpares de 15 a 30, usando os tipos de
 * dados int e float.
 */