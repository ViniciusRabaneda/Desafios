package Questao1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;



public class GuiVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCadastrar;
	private JTextField txtPlaca;
	private JTextField txtModelo;
	private JTable table;
	private JScrollPane scrollPane;
	private ArrayList<Veiculo> veiculos;
	private JButton btnListarVeiculos;
	private JTextField txtFiltrar;
	private TableRowSorter<ModeloTabelaVeiculo> rowSorter;
	private JButton btnListarModelo;
	private JButton btnListarNMercosul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiVeiculo frame = new GuiVeiculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiVeiculo() {

	
		Veiculo veiculo = new Veiculo();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(236, 28, 86, 20);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(236, 59, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(145, 31, 46, 14);
		contentPane.add(lblPlaca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(145, 56, 46, 14);
		contentPane.add(lblModelo);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String placa = txtPlaca.getText();
				String modelo = txtModelo.getText();
				veiculo.cadastrarVeiculo(placa,modelo);
				
			}
		});
		btnCadastrar.setBounds(165, 90, 89, 23);
		contentPane.add(btnCadastrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 193, 378, 69);
		contentPane.add(scrollPane);
		

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"Modelo", "Placa"
			}
		));
		scrollPane.setViewportView(table);
		
		btnListarVeiculos = new JButton("Listar Tudo");
		btnListarVeiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VeiculoDao veiculoDao = new VeiculoDao();
				veiculos = veiculoDao.listarVeiculos();
				ModeloTabelaVeiculo modeloTabelaVeiculo = new ModeloTabelaVeiculo(veiculos); //  parte do filtro			
				table.setModel(modeloTabelaVeiculo); //  parte do filtro
			}
		});
		btnListarVeiculos.setBounds(64, 273, 89, 23);
		contentPane.add(btnListarVeiculos);
		
		txtFiltrar = new JTextField();
		txtFiltrar.setBounds(181, 162, 132, 20);
		contentPane.add(txtFiltrar);
		txtFiltrar.setColumns(10);
		
		
		
		btnListarModelo = new JButton("Listar Modelo");
		btnListarModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VeiculoDao veiculoDao = new VeiculoDao();
				String filtro = txtFiltrar.getText();
				try {
					veiculos = veiculoDao.listarVeiculosModelo(filtro);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ModeloTabelaVeiculo modeloTabelaVeiculo = new ModeloTabelaVeiculo(veiculos); //  parte do filtro			
				table.setModel(modeloTabelaVeiculo); //  parte do filtro
			}
		});
		btnListarModelo.setBounds(53, 159, 118, 23);
		contentPane.add(btnListarModelo);
		
		btnListarNMercosul = new JButton("Lista N Mercosul");
		btnListarNMercosul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VeiculoDao veiculoDao = new VeiculoDao();
				veiculos = veiculoDao.listarVeiculosNMercosul();
				ModeloTabelaVeiculo modeloTabelaVeiculo = new ModeloTabelaVeiculo(veiculos); //  parte do filtro			
				table.setModel(modeloTabelaVeiculo); //  parte do filtro
			}
		});
		btnListarNMercosul.setBounds(208, 273, 118, 23);
		contentPane.add(btnListarNMercosul);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(-11, 117, 468, 12);
		contentPane.add(horizontalStrut);
		
		JLabel lblNewLabel = new JLabel("CADASTRO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(177, 0, 136, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblConsulta = new JLabel("CONSULTA");
		lblConsulta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConsulta.setBounds(175, 124, 94, 14);
		contentPane.add(lblConsulta);
		

	
		
	}
	private void filtrar() {
		String filtrar = txtFiltrar.getText().trim();
		if(filtrar.length()==0) {
			rowSorter.setRowFilter(null);
		}else {
			rowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+filtrar));
		}
	}
}

