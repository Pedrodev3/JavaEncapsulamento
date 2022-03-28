package br.com.fiap;

public class Geometria {
	private float lado;
	private float altura;
	private double raio;
	
	public void calcularAreaQuadrado() {
		System.out.println("Área do Quadrado é: " + (getLado() * getLado()));
	}
	
	public void calcularAreaRetangulo() {
		System.out.println("Área do Retângulo é: " + (getLado() * getAltura()));
	}
	
	public void calcularAreaTriangulo() {
		System.out.println("Área do Triângulo é: " + ((getLado() * getAltura())/2));
	}
	
	public void calcularAreaCirculo() {
		final double PI = 3.1416;
		System.out.println("Área do Circulo é: " + (PI * (Math.pow(raio, 2))));
	}
	
	public float getLado() {
		return lado;
	}
	
	public void setLado(float lado) {
		try {
			if (lado > 0.0 && lado < 100.0) {
				this.lado = lado;
			} else {
				throw new Exception("Valor fora da faixa definida: 0.0 a 100.0");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		try {
			if(altura > 0.0 && altura < 100.0) {
				this.altura = altura;
			} else {
				throw new Exception("Valor fora da faixa definida: 0.0 a 100.0");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		try {
			if(raio > 0 && raio < 100) {
				this.raio = raio;
			} else {
				throw new Exception("Valor fora da faixa definida: 0.0 a 100.0");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
