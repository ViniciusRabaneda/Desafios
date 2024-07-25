package Atividade_5;
import java.lang.Math;

public class Hexagono extends FormaGeometrica {
	private double a;
	
	
	public Hexagono(double a) {
		this.a = a;
	}

	public double calculaArea() {
		double area;
		area = 6 *( Math.pow(a, a) * Math.sqrt(3)/4);
		return area;
	}
	
	
	public double calculaPerimetro() {
		double p;
		 p = 6 *a;
		return p;
	}	
}
