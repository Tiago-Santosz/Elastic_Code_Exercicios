package Exericicio02;

public class Caracters10 {
	private int contadorEsp;
	private int contadorVogais;
	private int contadorConsoante;
	private String texto;

	public Caracters10(String texto) {
		this.texto = texto.toLowerCase();
		this.contadorEsp = 0;
		this.contadorVogais = 0;
		this.contadorConsoante = 0;
	}

	void ContarEspacoBranco() {
		for (int i = 0; i < texto.length(); i++) {
			char caractere = texto.charAt(i);

			if (caractere == ' ') {
				contadorEsp++;
			}
		}

	}

	void contarVogais() {
		for (int i = 0; i < texto.length(); i++) {
			char caractere1 = texto.charAt(i);

			if (caractere1 == 'a' || caractere1 == 'e' || caractere1 == 'i' || caractere1 == 'o' || caractere1 == 'u') {
				contadorVogais++;
			}
		}
	}

	void contarConsoante() {
		for (int i = 0; i < texto.length(); i++) {
			char caractere2 = texto.charAt(i);

			if (caractere2 != 'a' && caractere2 != 'e' && caractere2 != 'i' && caractere2 != 'o' && caractere2 != 'u') {
				contadorConsoante++;
			}
		}
	}

	public int getContadorEsp() {
		return contadorEsp;
	}

	public int getContadorVogais() {
		return contadorVogais;
	}

	public int getContadorConsoante() {
		return contadorConsoante;
	}

	public void setContadorConsoante(int contadorConsoante) {
		this.contadorConsoante = contadorConsoante;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
