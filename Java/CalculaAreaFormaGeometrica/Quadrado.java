package Atividade_5;

public class Quadrado extends FormaGeometrica {
	private double a;
	
	public Quadrado(double a) {
		this.a = a;
	}

	public double calculaArea() {
		double area;
		area = a*a;
		return area;
	}
	

	public double calculaPerimetro() {
		double p;
		 p = 4 *a ;
		return p;
	}	
}
