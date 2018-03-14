package controler;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private String caminho;
	private String login;
	private String senha;
	private static Connection con;
	
	public Connection conectar() {
		Class.forName("com.myql.jdbc.Driver");
		System.out.println("Carregou o driver");
		
		con = DriverManager.getConnection(caminho, login, senha);
		System.out.println("Estabeleceu conexão");
	}
}
