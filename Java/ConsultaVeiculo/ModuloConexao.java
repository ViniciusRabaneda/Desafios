package Questao1;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ModuloConexao {
	//Pode manter todos aqui fora como static e final já que os dados não mudam
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=prueva"; //Tive que colocar "encrypt=false" por causa do meu SQL Server, mas se o seu não precisar, pode tirar essa parte
	private static final String USER = "sa";
	private static final String PASSWORD = "admin123";
	

	private static Connection conexao;
	
	public static Connection conector() {

		try {
			Class.forName(DRIVER);
			conexao = DriverManager.getConnection(URL,USER,PASSWORD ); //Atribuição direta sem ter que colocar Connection conexao = null no começo.
			return conexao;
		}catch(Exception e ){
			System.err.println("Não foi possível conectar. Erro: "+e.getMessage());
			return null;
		}
	}
	public static void fecharConexao() {	
		try {
			if(conexao!=null && !conexao.isClosed()) {
				conexao.close();
			}
		} catch(SQLException e) {
			System.out.println("Erro ao encerrar a conexão: " + e.getMessage());
		} finally {
			conexao = null;
		}
	}
}
