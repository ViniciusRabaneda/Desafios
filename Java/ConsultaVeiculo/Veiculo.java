package Questao1;

public class Veiculo {
	private String placa,modelo;
	
	
	
	
	public Veiculo() {
	}

	public Veiculo(String placa, String modelo) {
		this.placa = placa;
		this.modelo = modelo;
	}

	public void cadastrarVeiculo(String placagui, String modelogui) {
		Veiculo veiculo = new Veiculo(placagui,modelogui);
		VeiculoDao veiculoDao = new VeiculoDao();
		veiculoDao.cadastrarVeiculo(veiculo);
		
	}
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void mostrar() {
		System.out.println("Placa: " +getPlaca() +"  "+ "Modelo: "  + modelo);
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo + "]";
	}
	
	
}
