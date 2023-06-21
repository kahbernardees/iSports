/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isports;

/**
 *
 * @author 823132278
 */
public class Usuario {



    private int id_login;
    private String cpf;
    private String Senha;
    private String nome;
    private String email;
    private String tipoUsuario;
    
     public Usuario(String cpf, String Senha) {
        this.cpf = cpf;
        this.Senha = Senha;
        
    }
    public Usuario(int id_login, String cpf, String Senha, String nome, String email, String tipoUsuario) {
        this.id_login = id_login;
        this.cpf = cpf;
        this.Senha = Senha;
        this.nome = nome;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
    }

    
    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    

}
