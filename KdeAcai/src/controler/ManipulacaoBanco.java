package controler;

import controler.Conexao;

public class ManipulacaoBanco {
	public static void cadastrarCliente(String sql){
		Conexao.conectar();
		
	}
	
	public static void cadasrtarLoja() {
		Conexao.conectar();
	}
}
