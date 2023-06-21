/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONEXAO.ConnectionFactory;
import com.mycompany.isports.Locais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextField;

/**
 *
 * author 823132278
 */
public class DaoLocais {
    
    public Locais[] obterLocais() throws Exception {   
        String sql = "SELECT * FROM SPT_LOCAIS LOCA;";
        
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = ps.executeQuery()) {
            
            int totalDeLocais = rs.last() ? rs.getRow() : 0;
            Locais[] local = new Locais[totalDeLocais];
            
            rs.beforeFirst();
            int contador = 0;
            
            while (rs.next()) {
                int id = rs.getInt("ID");
                String endereco = rs.getString("ENDERECO");
                String nomeLocal = rs.getString("NOME_LOCAL");
                local[contador++] = new Locais(id, endereco, nomeLocal);
            }
            
            return local;
        }       
    }
    
    public void inserir(String Endereco, String NomeLocal) {
        // 1: Definir o comando SQL
        String sql = "INSERT INTO SPT_LOCAIS(ENDERECO, NOME_LOCAL) VALUES (?, ?)";
        // 2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obtemConexao()) {
            // 3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // 4: Preenche os dados faltantes
            ps.setString(1, Endereco);
            ps.setString(2, NomeLocal);
            // 5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void atualizar(int idLocal, String endereco, String nomeLocal) {
        // 1: Definir o comando SQL
        String sql = "UPDATE SPT_LOCAIS SET ENDERECO = ?, NOME_LOCAL = ? WHERE ID = ?";
        // 2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obtemConexao()) {
            // 3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // 4: Preenche os dados faltantes
            ps.setString(1, endereco);
            ps.setString(2, nomeLocal);
            ps.setInt(3, idLocal);
            // 5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void apagar(int idLocal) {
        // 1: Definir o comando SQL
        String sql = "DELETE FROM SPT_LOCAIS WHERE ID = ?";
        // 2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obtemConexao()) {
            // 3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // 4: Preenche os dados faltantes
            ps.setInt(1, idLocal);
            // 5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
