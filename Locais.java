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
public class Locais {

    private int IdLocal;
    private String Endereco;
    private String NomeLocal;
    
    public Locais(int IdLocal, String Endereco, String NomeLocal) {
        this.IdLocal = IdLocal;
        this.Endereco = Endereco;
        this.NomeLocal = NomeLocal;
    }

    public int getIdLocal() {
        return IdLocal;
    }

    public void setIdLocal(int IdLocal) {
        this.IdLocal = IdLocal;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNomeLocal() {
        return NomeLocal;
    }

    public void setNomeLocal(String NomeLocal) {
        this.NomeLocal = NomeLocal;
    }
    
    public void inserirLocal(String Endereco, String NomeLocal){
        //codar
    }
    
    public void excluirLocal(int IdLocal){
        //codar Exclusão
    }
    
    public void listarLocal(){
        //Listar Locais
    }
    
    public void atualizarLocal(int IdLocal, String Endereco, String NomeLocal){
        //Atualizar Locais
    }
    @Override
    public String toString() {
        return this.IdLocal  + " - " + this.NomeLocal;
        
    }
}
