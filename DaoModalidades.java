package DAO;

import CONEXAO.ConnectionFactory;
import com.mycompany.isports.ModalidadesEsportivas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoModalidades{

    public List<ModalidadesEsportivas> obterModalidades() {
        String sql = "SELECT * FROM SPT_MODALIDADES";

        List<ModalidadesEsportivas> modalidades = new ArrayList<>();

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("ID");
                String descricao = rs.getString("DESCRICAO");
                String turno = rs.getString("TURNO");
                String duracao = rs.getString("DURACAO");

                ModalidadesEsportivas modalidade = new ModalidadesEsportivas(id, descricao, turno, duracao);
                modalidades.add(modalidade);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return modalidades;
    }

    public void inserirModalidade(ModalidadesEsportivas modalidade) {
        String sql = "INSERT INTO SPT_MODALIDADES(DESCRICAO, TURNO, DURACAO) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, modalidade.getDescricao());
            ps.setString(2, modalidade.getTurno());
            ps.setString(3, modalidade.getDuracao());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarModalidade(ModalidadesEsportivas modalidade) {
        String sql = "UPDATE SPT_MODALIDADES SET DESCRICAO = ?, TURNO = ?, DURACAO = ? WHERE ID = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, modalidade.getDescricao());
            ps.setString(2, modalidade.getTurno());
            ps.setString(3, modalidade.getDuracao());
            ps.setInt(4, modalidade.getIdModalidade());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirModalidade(int idModalidade) {
        String sql = "DELETE FROM SPT_MODALIDADES WHERE ID = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idModalidade);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
