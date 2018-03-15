package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import controle.Conexao;
import controle.ManipulacaoBanco;
import modelo.Clientes;

public class ClientesDAO {
	public static void inserir(Clientes cliente) {
		String sql = String.format("INSERT INTO clientes VALUES(%s, %s, %s, %s)", 
									cliente.getLogin(), cliente.getNome(), cliente.getEmail(), cliente.getSenha());
		ManipulacaoBanco.manipular(sql);
	}
	
	public static void deletar(Clientes cliente) {
		String sql  = String.format("SELECT * FROM clientes WHERE login=%s", cliente.getLogin());
		ResultSet resultado = ManipulacaoBanco.pegarCliente(sql);
		int id;
		
		try {
			id = resultado.getInt("id");
			sql = String.format("DETETE FROM clientes WHERE id=%d", id);
			System.out.println("Cliente deletado!");
			
		} catch (SQLException e) {
			System.out.println("Não encontrado");
		}
	}
}
