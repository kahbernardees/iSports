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
public class Turmas {
    
    private int IdTurmas;
    private String Vagas;
    private String DiasAulas;
    private String horario;
    private int IdModalidade;
    private int idLocal;

     public Turmas(String Vagas, String DiasAulas, String horario, int IdModalidade, int idLocal) {
        this.Vagas = Vagas;
        this.DiasAulas = DiasAulas;
        this.horario = horario;
        this.IdModalidade = IdModalidade;
        this.idLocal = idLocal;
    }
     
    public Turmas(int IdTurmas, String Vagas, String DiasAulas, String horario, int IdModalidade, int idLocal) {
        this.IdTurmas = IdTurmas;
        this.Vagas = Vagas;
        this.DiasAulas = DiasAulas;
        this.horario = horario;
        this.IdModalidade = IdModalidade;
        this.idLocal = idLocal;
    }
    
    
    public String getDiasAulas() {
        return DiasAulas;
    }

    public void setDiasAulas(String DiasAulas) {
        this.DiasAulas = DiasAulas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public int getIdTurmas() {
        return IdTurmas;
    }

    public void setIdTurmas(int IdTurmas) {
        this.IdTurmas = IdTurmas;
    }

    public String getVagas() {
        return Vagas;
    }

    public void setVagas(String Vagas) {
        this.Vagas = Vagas;
    }

    public int getIdModalidade() {
        return IdModalidade;
    }

    public void setIdModalidade(int IdModalidade) {
        this.IdModalidade = IdModalidade;
    }
    
    
    public String ListarTurmas(){
        return "123";
    }
    
    public void IncluiTurmas(int IdModalidade, int IdLocal){
        //insert turmas   
    }
    
    public void ExcluiTurmas(int IdTurmas){
        //delete turma
    }
    
    public void AtualizarTurmas(int IdTurmas, int Vagas){
        //update turma
    }
    
    @Override
    public String toString() {
        
        return  (DiasAulas + " - " + horario); // Altere para o atributo desejado que deseja exibir no ComboBox
    }
}

