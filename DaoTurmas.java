package DAO;

import CONEXAO.ConnectionFactory;
import com.mycompany.isports.Turmas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoTurmas {

    public List<Turmas> obterTurmas() {
        String sql = "SELECT * FROM SPT_TURMAS";

        List<Turmas> turmas = new ArrayList<>();

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int idTurmas = rs.getInt("ID");
                String vagas = rs.getString("VAGAS");
                String diasAulas = rs.getString("DIAS_AULAS");
                String horario = rs.getString("HORARIO");
                int idModalidade = rs.getInt("ID_MODAL");
                int idLocal = rs.getInt("ID_LOCAL");

                Turmas turma = new Turmas(idTurmas, vagas, diasAulas, horario, idModalidade, idLocal);
                turmas.add(turma);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return turmas;
    }

    public void inserirTurma(Turmas turma) {
        String sql = "INSERT INTO SPT_TURMAS(VAGAS, DIAS_AULAS, HORARIO, ID_MODAL, ID_LOCAL) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, turma.getVagas());
            ps.setString(2, turma.getDiasAulas());
            ps.setString(3, turma.getHorario());
            ps.setInt(4, turma.getIdModalidade());
            ps.setInt(5, turma.getIdLocal());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarTurma(Turmas turma) {
        String sql = "UPDATE SPT_TURMAS SET VAGAS = ?, DIAS_AULAS = ?, HORARIO = ?, ID_MODAL = ?, ID_LOCAL = ? WHERE ID = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, turma.getVagas());
            ps.setString(2, turma.getDiasAulas());
            ps.setString(3, turma.getHorario());
            ps.setInt(4, turma.getIdModalidade());
            ps.setInt(5, turma.getIdLocal());
            ps.setInt(6, turma.getIdTurmas());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirTurma(int idTurmas) {
        String sql = "DELETE FROM SPT_TURMAS WHERE ID = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idTurmas);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
