package Exericicio02;

public class Palindromo08 {

	public boolean palindromo(String palavra){
		palavra = palavra.replaceAll("//s", " ").toLowerCase();
		
		int esquerda = 0;
		int direita = palavra.length() -1;
		
		while(esquerda< direita){
			if(palavra.charAt(esquerda) != palavra.charAt(direita)){
				
				return false;
			}
			esquerda++;
			direita--;
		}
		return true;
	}
	
}
