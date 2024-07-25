package Atividade_5;

public class Retangulo extends FormaGeometrica {
	
	private double a;
	private double b;
	
	
	
	public Retangulo(double a, double b) {
		this.a = a;
		this.b = b;
	}

	
	public double calculaArea() {
		double area;
		area = a*b;
		return area;
	}
	

	public double calculaPerimetro() {
		double p;
		 p = 2*(a +b) ;
		return p;
	}	
}
