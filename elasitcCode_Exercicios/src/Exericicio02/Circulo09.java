package Exericicio02;

public class Circulo09 {
	private int raio;

	public Circulo09(int raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return Math.PI * (raio * raio);
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	
}

/*
 * 9. Escreva uma classe para calcular a área de um círculo, sabendo que a área
 * é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado
 * terá que ser arredondado.
 */