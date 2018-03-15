package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controle.Conexao;

public class ManipulacaoBanco {
	public static Connection con;
    public static Statement stm;
    
	public static void manipular(String sql){
		Conexao.conectar();
		
		try {
			int resultado = stm.executeUpdate(sql);
			System.out.println("Cadastro realizado com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar opera��o");
		}
	}
	
	
	public static ResultSet pegarLojas(String sql) {
		Conexao.conectar();
		ResultSet resultado = null;
		
		try {
			resultado = stm.executeQuery(sql);
			System.out.println("Dados alterados com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar opera��o");
		}
		
		return resultado;
	}
	
	public static ResultSet pegarCliente(String sql) {
		Conexao.conectar();
		ResultSet resultado = null;
		
		try {
			resultado = stm.executeQuery(sql);
			System.out.println("Dados alterados com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar opera��o");
		}
		
		return resultado;
	}
}
