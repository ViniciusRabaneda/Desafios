package Atividade_5;

public class Main {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		Triangulo t = new Triangulo(2,2,2);
		Quadrado q = new Quadrado(2);
		Hexagono h = new Hexagono(2);
		Retangulo r = new Retangulo(2,2);
		
		c.calculaPerimetro(t);
		c.calculaArea(t);
		c.calculaPerimetro(q);
		c.calculaArea(q);
		c.calculaPerimetro(h);
		c.calculaArea(h);
		c.calculaPerimetro(r);
		c.calculaArea(r);		
		
	}
}
