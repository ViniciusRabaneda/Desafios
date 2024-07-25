package Questao1;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ModeloTabelaVeiculo extends AbstractTableModel {
	
	private static final String[] colunas = {"placa", "modelo"};
	
	private ArrayList<Veiculo> veiculos;
	
	
	
	public ModeloTabelaVeiculo(ArrayList<Veiculo> veiculos) {
		super();
		this.veiculos = veiculos;  // construtor
	}

	@Override
	public int getRowCount() {
		return veiculos.size();
	}
	
	@Override
	public int getColumnCount() {
		return colunas.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		Veiculo veiculo = veiculos.get(rowIndex);
		if(columnIndex == 0 ) {
			return veiculo.getPlaca();
		}else if(columnIndex == 1 ) {
			return veiculo.getModelo();
		}else {
			return null;
		}
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}
	
}
