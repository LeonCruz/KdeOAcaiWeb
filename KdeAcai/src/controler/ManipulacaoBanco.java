package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controler.Conexao;

public class ManipulacaoBanco {
	public static Connection con;
    public static Statement stm;
    
	public static void cadastrarCliente(String sql){
		Conexao.conectar();
		
		try {
			int resultado = stm.executeUpdate(sql);
			System.out.println("Cadastro realizado com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar operação");
		}
	}
	
	public static void cadastrarLoja(String sql) {
		Conexao.conectar();
		
		try {
			int resultado = stm.executeUpdate(sql);
			System.out.println("Cadastro realizado com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar operação");
		}
	}
	
	public static void deletarCliente(String sql) {
		Conexao.conectar();
		
		try {
			int resultado = stm.executeUpdate(sql);
			System.out.println("Cliente apagado");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar operação");
		}
	}
	
	public static void deletarLoja(String sql) {
		Conexao.conectar();
		
		try {
			int resultado = stm.executeUpdate(sql);
			System.out.println("Loja apagada");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar operação");
		}
	}
	
	public static void atualizarDadosCliente(String sql) {
		Conexao.conectar();
		
		try {
			int resultado = stm.executeUpdate(sql);
			System.out.println("Dados alterados com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar operação");
		}
	}
	
	public static void atualizarDadosLoja(String sql) {
		Conexao.conectar();
		
		try {
			int resultado = stm.executeUpdate(sql);
			System.out.println("Dados alterados com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar operação");
		}
	}
	
	public static void pegarLojas(String sql) {
		Conexao.conectar();
		
		try {
			ResultSet resultado = stm.executeQuery(sql);
			System.out.println("Dados alterados com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar operação");
		}
	}
}
