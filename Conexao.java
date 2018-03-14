package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String caminho = "";
	private String login = "";
	private String senha = "";
	private static Connection con;
	
	public static void conectar() {
		try {
			Class.forName("com.myql.jdbc.Driver");
			System.out.println("Carregou o driver");
			
			con = DriverManager.getConnection(caminho, login, senha);
			System.out.println("Estabeleceu conexão");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o Driver");
		
		} catch (SQLException e) {
			System.out.println("Erro ao tentar estabelecer conexão");
		}
	}
}
