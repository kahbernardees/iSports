/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONEXAO.ConnectionFactory;
import com.mycompany.isports.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 823132278
 */
public class DaoUsuario {
    public Usuario existe(Usuario usuario) throws Exception {
        String sql = "SELECT * FROM SPT_PESSOAS WHERE CPF = ? AND SENHA = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getCpf());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("ID");
                    String nome = rs.getString("NOME");
                    String email = rs.getString("EMAIL");
                    String tipoUsuario = rs.getString("TIPO_USUARIO");

                    return new Usuario(id, usuario.getCpf(), usuario.getSenha(), nome, email, tipoUsuario);
                } else {
                    return null; // Usuário não encontrado
                }
            }
        }
    }
}
