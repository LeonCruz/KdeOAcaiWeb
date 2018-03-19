package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static String caminho = "jdbc:mysql://localhost:3306/kde_acai";
	private static String login = "root";
	private static String senha = "ifpa@123";
	private static Connection con;
	
	public static Connection conectar() {
		// Função que realiza a conexeão com o banco
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Carregou o driver");
			
			con = DriverManager.getConnection(caminho, login, senha);
			System.out.println("Estabeleceu conexão");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o Driver");
		
		} catch (SQLException e) {
			System.out.println("Erro ao tentar estabelecer conex�o");
			System.out.println(e);
		}
		
		
		return con;
	}
}
