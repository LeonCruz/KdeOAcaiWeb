package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import controle.ManipulacaoBanco;
import modelo.Lojas;

public class LojasDAO {
	public static void cadastrar(Lojas loja) {
		// Função que cadastra uma loja
		
		String sql = String.format("INSERT INTO lojas VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')",
				loja.getEmail(), loja.getSenha(), loja.getNome(), loja.getAvaliacao(), loja.getLocalizacao(), 
				loja.getTelofone(), loja.getTipoFino(), loja.getTipoMedio(), loja.getTipoGrosso());
		
		ManipulacaoBanco.manipular(sql);
		System.out.println("Loja cadastrada");
	}
	
	public static void deletar(Lojas loja) {
		// Função que deleta uma loja
		
		int id = 0;
		ResultSet resultado = consultarLoja(loja);
		String sql = String.format("DETELE FROM lojas WHERE id=%d", id);
		
		try {
			if(resultado.next()) {
				id = resultado.getInt("id");
				sql = String.format("DETETE FROM lojas WHERE id=%d", id);
				System.out.println("Loja deletado!");
			} else {
				System.out.println("Loja não existe");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static ResultSet consultarLoja(Lojas loja) {
		// Função que pesquisa no banco uma loja que já existe;
		
		String sql  = String.format("SELECT * FROM lojas WHERE login='%s'", loja.getEmail());
		return ManipulacaoBanco.pegarCliente(sql);
	}
	
}
