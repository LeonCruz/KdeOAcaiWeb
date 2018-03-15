package DAO;

import controler.Conexao;
import controler.ManipulacaoBanco;
import modelo.Clientes;

public class UsuarioDAO {
	public static void inserir(Clientes cliente) {
		String sql = "";
		ManipulacaoBanco.manipular(sql);
	}
}
