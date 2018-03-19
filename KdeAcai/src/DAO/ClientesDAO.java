package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import controle.ManipulacaoBanco;
import modelo.Clientes;
import modelo.Lojas;

public class ClientesDAO {
	public static boolean cadastrar(Clientes cliente) {
		// Função que realiza o cadastro do cliente
		
		ResultSet resultado = consultarCliente(cliente);
		String sql;
		
		try {
			if(resultado.next()) {
				System.out.println("Login já existe");
				return false;
			} else {
				sql = String.format("INSERT INTO clientes(login, nome, email, senha) VALUES('%s', '%s', '%s', '%s')", 
						cliente.getLogin(), cliente.getNome(), cliente.getEmail(), cliente.getSenha());
				System.out.println(sql);
				ManipulacaoBanco.manipular(sql);
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void deletar(Clientes cliente) {
		// Função que deleta o cliente
		
		ResultSet resultado = consultarCliente(cliente);
		String sql;
		int id;
		
		try {
			if(resultado.next()) {
				id = resultado.getInt("id");
				sql = String.format("DETETE FROM clientes WHERE id=%d", id);
				ManipulacaoBanco.manipular(sql);
				System.out.println("Cliente deletado!");
			} else {
				System.out.println("Login não existe");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Clientes cliente) {
		// Função que atualiza os dados do cliente
		
		ResultSet resultado = consultarCliente(cliente);
		int id;
		
		String sql = "";
		
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
				
				ManipulacaoBanco.manipular(sql);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void avaliar(Clientes cliente, Lojas loja) {
		// Função para realizar avaliação do cliente sobre uma loja
		
		String sql;
		int idCliente;
		int idLoja;
		ResultSet resultadoCliente = consultarCliente(cliente);
		ResultSet resultadoLoja = LojasDAO.consultarLoja(loja);
		
		try {
			if(resultadoCliente.next() && resultadoLoja.next()) {
				idCliente = resultadoCliente.getInt("id");
				idLoja =  resultadoLoja.getInt("id_loja");
				sql = String.format("INSERT INTO avaliacaocliente VALUES('%d', '%d', '%f')", idLoja, idCliente, cliente.getAvalicao());
				ManipulacaoBanco.manipular(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static ResultSet consultarCliente(Clientes cliente) {
		// Função que pesquisa no banco um login que já existe;
		
		String sql  = String.format("SELECT * FROM clientes WHERE login='%s' AND email='%s'", cliente.getLogin(), cliente.getEmail());
		return ManipulacaoBanco.pegarCliente(sql);
	}
}