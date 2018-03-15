package DAO;

import controle.Conexao;
import controle.ManipulacaoBanco;
import modelo.Clientes;

public class UsuarioDAO {
	public static void inserir(Clientes cliente) {
		String sql = "";
		ManipulacaoBanco.manipular(sql);
	}
}
