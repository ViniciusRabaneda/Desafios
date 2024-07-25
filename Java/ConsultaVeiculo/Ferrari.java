package Questao1;

public class Ferrari extends Veiculo {
	
	
	public Ferrari(String placa, String modelo) {
		super(placa, modelo);
	}
	
	
	
	public Ferrari(String placa, String modelo, int velocidade) {
		super(placa, modelo);
		this.velocidade = velocidade;
	}



	private int velocidade;
	
	
	
	public void definirVelocidade(int velocidade) {
		if (velocidade>= 0 && velocidade<=300) { 
			this.velocidade = velocidade;
			System.out.println("A velocidade atual é de :" + velocidade);
	}else {
			System.out.println("A velocidade deve estar entre 0 e 300 km/h!");
	}
}
	public void mostrar() {
		System.out.println("Placa: " + getPlaca()+"  " + "Modelo: " + getModelo()+"  " + "Velocidade: " + velocidade);
	}
}
