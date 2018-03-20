/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ADM
 */
public class Lojas {
    
    private String email;
    private String senha;
    private String nome;
    private float avaliacao;
    private String localizacao;
    private String telefone;
    private float tipoFino;      
    private float tipoMedio;
    private float tipoGrosso;

    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public float getTipoFino() {
        return tipoFino;
    }

    public float getTipoMedio() {
        return tipoMedio;
    }

    public float getTipoGrosso() {
        return tipoGrosso;
    }
    
    //Setters---------------------------------------------------

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipoFino(String tipoFino) {
        this.tipoFino = Float.parseFloat(tipoFino);
    }

    public void setTipoMedio(String tipoMedio) {
        this.tipoMedio =  Float.parseFloat(tipoMedio);
    }

    public void setTipoGrosso(String tipoGrosso) {
        this.tipoGrosso =  Float.parseFloat(tipoGrosso);
    }
}


