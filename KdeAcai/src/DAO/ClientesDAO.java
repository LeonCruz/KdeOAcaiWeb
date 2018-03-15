package DAO;

import controle.Conexao;
import controle.ManipulacaoBanco;
import modelo.Clientes;

public class ClientesDAO {
	public static void inserir(Clientes cliente) {
		String sql = "";
		ManipulacaoBanco.manipular(sql);
	}
}
