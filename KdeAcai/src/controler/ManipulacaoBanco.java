package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controler.Conexao;

public class ManipulacaoBanco {
	public static Connection con;
    public static Statement stm;
    
	public static void cadastrar(String sql){
		Conexao.conectar();
		
		try {
			int resultado = stm.executeUpdate(sql);
			System.out.println("Cadastro realizado com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar operação");
		}
	}
	
	public static void deletar(String sql) {
		Conexao.conectar();
		
		try {
			int resultado = stm.executeUpdate(sql);
			System.out.println("Cliente apagado");
			
		} catch (SQLException e) {
			System.out.println("Erro ao realizar operação");
		}
	}
	
	
	public static void atualizar(String sql) {
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
