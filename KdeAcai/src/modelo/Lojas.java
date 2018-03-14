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
    private String nome;
    private float avaliacao;
    private String localizacao;
    private String telofone;
    private float tipoFino;      
    private float tipoMedio;
    private float tipoGrosso;

    public String getEmail() {
        return email;
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

    public String getTelofone() {
        return telofone;
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

    public void setEmail(String email) {
        this.email = email;
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

    public void setTelofone(String telofone) {
        this.telofone = telofone;
    }

    public void setTipoFino(float tipoFino) {
        this.tipoFino = tipoFino;
    }

    public void setTipoMedio(float tipoMedio) {
        this.tipoMedio = tipoMedio;
    }

    public void setTipoGrosso(float tipoGrosso) {
        this.tipoGrosso = tipoGrosso;
    }
}


