package Questao1;

public class UsaVeiculo {
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("KFC1903","Esportivo");
		veiculo.mostrar();
		
		Ferrari ferrari = new Ferrari("KFC1903","Esportivo",0);
		ferrari.mostrar();
		ferrari.definirVelocidade(100);
		ferrari.mostrar();
	}
}
