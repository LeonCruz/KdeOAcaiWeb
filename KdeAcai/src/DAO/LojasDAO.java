package DAO;

import controle.ManipulacaoBanco;
import modelo.Lojas;

public class LojasDAO {
	public static void cadastrar(Lojas loja) {
		// Função que cadastra uma loja
		
		String sql = String.format("INSERT INTO lojas VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')",
				loja.getEmail(), loja.getSenha(), loja.getNome(), loja.getAvaliacao(), loja.getLocalizacao(), 
				loja.getTelofone(), loja.getTipoFino(), loja.getTipoMedio(), loja.getTipoGrosso());
		
		ManipulacaoBanco.manipular(sql);
	}
	
}
