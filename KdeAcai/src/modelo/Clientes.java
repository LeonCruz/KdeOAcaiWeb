package modelo;

/**
 *
 * @author ADM
 */
public class Clientes {
    private String login;
    private String nome;
    private String email;
    private String senha;
    private float avalicao;
    
    public float getAvalicao() {
    	return avalicao;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setAvaliacao(float avalicao) {
    	this.avalicao = avalicao;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
