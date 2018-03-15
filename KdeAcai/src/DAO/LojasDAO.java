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
	
	public static void atualizar(Lojas loja) {
		String sql = "";
		ResultSet resultado = consultarLoja(loja);
		int id = 0;
		
		String novoEmail = loja.getEmail();
		String novoSenha = loja.getSenha();
		String novoNome = loja.getNome();
		float novaAvalicao = loja.getAvaliacao();
		String novaLocalizacao = loja.getLocalizacao();
		String novoTelefone = loja.getTelofone();
		float novoTipoFino = loja.getTipoFino();
		float novoTipoMedio = loja.getTipoMedio();
		float novoTipoGrosso = loja.getTipoGrosso();
		
		try {
			if(resultado.next()) {
				id = resultado.getInt("id");
				
				if(!novoEmail.equals("")) {
					sql = String.format("UPDATE loja SET email='%s' WHERE id=%d", novoEmail, id);
				} 
				
				if(!novoSenha.equals("")) {
					sql = String.format("UPDATE loja SET senha='%s' WHERE id=%d", novoSenha, id);
				} 
				
				if(!novoNome.equals("")) {
					sql = String.format("UPDATE loja SET nome='%s' WHERE id=%d", novoNome, id);
				} 
				
				if(novaAvalicao != loja.getAvaliacao()) {
					sql = String.format("UPDATE loja SET avaliacao='%s' WHERE id=%d", novaAvalicao, id);
				} 
				
				if(!novaLocalizacao.equals("")) {
					sql = String.format("UPDATE loja SET localizacao='%s' WHERE id=%d", novaLocalizacao, id);
				}
				
				if(!novoTelefone.equals("")) {
					sql = String.format("UPDATE loja SET telefone='%s' WHERE id=%d", novoTelefone, id);
				}
				
				if(novoTipoFino!= loja.getTipoFino()) {
					sql = String.format("UPDATE loja SET tipoFino='%s' WHERE id=%d", novoTipoFino, id);
				} 
				
				if(novoTipoMedio!= loja.getTipoMedio()) {
					sql = String.format("UPDATE loja SET tipoMedio='%s' WHERE id=%d", novoTipoMedio, id);
				}
				
				if(novoTipoGrosso!= loja.getTipoGrosso()) {
					sql = String.format("UPDATE loja SET tipoGrosso='%s' WHERE id=%d", novoTipoGrosso, id);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static ResultSet consultarLoja(Lojas loja) {
		// Função que pesquisa no banco uma loja que já existe;
		
		String sql  = String.format("SELECT * FROM lojas WHERE email='%s'", loja.getEmail());
		return ManipulacaoBanco.pegarCliente(sql);
	}
	
}
