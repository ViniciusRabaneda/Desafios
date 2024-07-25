package Atividade_5;

public class Triangulo extends FormaGeometrica {
	
	private double a;
	private double base;
	private double altura;
	
	public Triangulo(double a) {

		this.a = a;
	}

	
	

	public Triangulo(double a, double base, double altura) {
		this.a = a;
		this.base = base;
		this.altura = altura;
	}




	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}




	public double calculaArea() {
		double area;
		area = (base*altura)/2;
		return area;
	}
	


	public double calculaPerimetro() {
		double p;
		p = 3*a;
		return p;
	}
	
	
}
