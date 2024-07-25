package Questao1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import Questao1.Veiculo;
import Questao1.ModuloConexao;




public class VeiculoDao {
	
	
	private static final String CADASTRAR_VEICULO = "insert into veiculos (placa,modelo) values (?,?)";
	private static final String SELECIONAR_VEICULOS = "select * from veiculos";
	private static final String SELECIONAR_N_MERCOSUL = "select * from veiculos where placa not like '%[0-9][0-9][0-9][0-9]'";
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;

	public void cadastrarVeiculo(Veiculo veiculo) {
		try {
			String query = CADASTRAR_VEICULO;
			Connection conexao = ModuloConexao.conector(); // abre conexao
			pst = conexao.prepareStatement(query); // passa o comando sql como argumento
			pst.setString(1, veiculo.getPlaca());
			pst.setString(2, veiculo.getModelo());
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Veiculo criado.");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Houve um erro ao criar o Veiculo.");
			e.printStackTrace();
		} finally {
			ModuloConexao.fecharConexao();
		}
	}
	
	public ArrayList<Veiculo> listarVeiculos() {
		String query = SELECIONAR_VEICULOS;
		ArrayList<Veiculo> veiculos = new ArrayList<>();

		try (Connection conexao = ModuloConexao.conector();
				PreparedStatement pst = conexao.prepareStatement(query);
				ResultSet rs = pst.executeQuery()) {

			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setPlaca(rs.getString("placa"));
				veiculo.setModelo(rs.getString("modelo"));
				veiculos.add(veiculo);
			}
		} catch (SQLException e) {

		}
		return veiculos;
	}
	
	 public ArrayList<Veiculo> listarVeiculosModelo(String modelo) throws SQLException {
		 	String query = "select * from veiculos where modelo = ?";
		 	ArrayList<Veiculo> veiculos = new ArrayList<>();
	        try (Connection conexao = ModuloConexao.conector();
	             PreparedStatement pst = conexao.prepareStatement(query)) {
	        	 pst.setString(1,modelo);
	             ResultSet rs = pst.executeQuery();
	           while (rs.next()) {
	            	Veiculo veiculo = new Veiculo();
	                veiculo.setPlaca(rs.getString("placa"));
					veiculo.setModelo(rs.getString("modelo"));
					veiculos.add(veiculo);
	            }
	        } catch (SQLException e) {
	            throw new SQLException("Erro ao buscar Veiculo por Modelo: " + e.getMessage());
	        }
	        return veiculos;
	    }
	 
	 public ArrayList<Veiculo> listarVeiculosNMercosul() {
			String query = SELECIONAR_N_MERCOSUL;
			ArrayList<Veiculo> veiculos = new ArrayList<>();

			try (Connection conexao = ModuloConexao.conector();
					PreparedStatement pst = conexao.prepareStatement(query);
					ResultSet rs = pst.executeQuery()) {

				while (rs.next()) {
					Veiculo veiculo = new Veiculo();
					veiculo.setPlaca(rs.getString("placa"));
					veiculo.setModelo(rs.getString("modelo"));
					veiculos.add(veiculo);
				}
			} catch (SQLException e) {

			}
			return veiculos;
	 }
	 
	 
	
}
