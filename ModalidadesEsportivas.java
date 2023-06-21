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
public class ModalidadesEsportivas {

    private int IdModalidade;
    private String Descricao;
    private String Turno;
    private String Duracao;
    
    //CONSTRUTOR
    public ModalidadesEsportivas(int IdModalidade) {
        this.IdModalidade = IdModalidade;
    }
    
    public ModalidadesEsportivas(int IdModalidade, String Descricao) {
        this.IdModalidade = IdModalidade;
        this.Descricao = Descricao;
    }
    
    public ModalidadesEsportivas(int IdModalidade, String Descricao, String Turno, String Duracao) {
        this.IdModalidade = IdModalidade;
        this.Descricao = Descricao;
        this.Turno = Turno;
        this.Duracao = Duracao;
    }
    
    public ModalidadesEsportivas(String Descricao, String Turno, String Duracao) {
        this.Descricao = Descricao;
        this.Turno = Turno;
        this.Duracao = Duracao;
    }
    
    public int getIdModalidade() {
        return IdModalidade;
    }

    public void setIdModalidade(int IdModalidade) {
        this.IdModalidade = IdModalidade;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getDuracao() {
        return Duracao;
    }

    public void setDuracao(String Duracao) {
        this.Duracao = Duracao;
    }
    
    public void incluiModalidades(){
        
    }
    
    public void excluirModalidaes(int IdModalidade[]){
        
    }
    
    public void atualizarModalidades(int IdModalidade[]){
        
    }
    
    @Override
    public String toString() {
        return Descricao; // Altere para o atributo desejado que deseja exibir no ComboBox
    }
}
