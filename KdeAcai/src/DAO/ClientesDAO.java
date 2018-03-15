package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import controle.Conexao;
import controle.ManipulacaoBanco;
import modelo.Clientes;

public class ClientesDAO {
	public static void cadastrar(Clientes cliente) {
		ResultSet resultado = consultarCliente(cliente);
		String sql;
		
		try {
			if(resultado.next()) {
				System.out.println("Login já existe");
			} else {
				sql = String.format("INSERT INTO clientes VALUES('%s', '%s', '%s', '%s')", 
						cliente.getLogin(), cliente.getNome(), cliente.getEmail(), cliente.getSenha());
				ManipulacaoBanco.manipular(sql);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deletar(Clientes cliente) {
		ResultSet resultado = consultarCliente(cliente);
		String sql;
		int id;
		
		try {
			if(resultado.next()) {
				id = resultado.getInt("id");
				sql = String.format("DETETE FROM clientes WHERE id=%d", id);
				System.out.println("Cliente deletado!");
			} else {
				System.out.println("Login não existe");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Clientes cliente) {
		ResultSet resultado = consultarCliente(cliente);
		int id;
		
		String sql;
		
		String novoLogin = cliente.getLogin();
		String novoNome = cliente.getNome();
		String novoEmail = cliente.getEmail();
		String novaSenha = cliente.getSenha();
		
		try {
			if(resultado.next()) {
				id = resultado.getInt("id");
				if(!novoLogin.equals("")) {
					sql = String.format("UPDATE clientes SET login='%s' WHERE id=%d", novoLogin, id);
				}
				
				if(!novoNome.equals("")) {
					sql = String.format("UPDATE clientes SET nome='%s' WHERE id=%d", novoNome, id);
				}
				
				if(!novoEmail.equals("")) {
					sql = String.format("UPDATE clientes SET email='%s' WHERE id=%d", novoEmail, id);
				}
				
				if(!novaSenha.equals("")) {
					sql = String.format("UPDATE clientes SET senha='%s' WHERE id=%d", novaSenha, id);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static ResultSet consultarCliente(Clientes cliente) {
		String sql  = String.format("SELECT * FROM clientes WHERE login='%s'", cliente.getLogin());
		return ManipulacaoBanco.pegarCliente(sql);
	}
}
