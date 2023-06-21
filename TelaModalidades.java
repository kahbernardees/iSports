package Telas;

import DAO.DaoModalidades;
import com.mycompany.isports.ModalidadesEsportivas;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Muril
 */
public class TelaModalidades extends javax.swing.JFrame {

    private DaoModalidades daoModalidades;
    
    public TelaModalidades() {
        super("Cadastro de Modalidades");
        initComponents();
        daoModalidades = new DaoModalidades();
        carregarModalidades();
    }

    private void carregarModalidades() {
        List<ModalidadesEsportivas> modalidades = daoModalidades.obterModalidades();

        idModalidadeComboBox.removeAllItems();
        for (ModalidadesEsportivas modalidade : modalidades) {
            idModalidadeComboBox.addItem(modalidade);
        }
    }
    private void atualizarTela() {
        carregarModalidades();
        limparCampos();
    }

    private void limparCampos() {
        txtDescricao.setText("");
        turnoComboBox.setSelectedIndex(0);
        txtDuracao.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idModalidadeComboBox = new javax.swing.JComboBox<>();
        txtDuracao = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCriar = new javax.swing.JButton();
        turnoComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idModalidadeComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modalidade"));
        idModalidadeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idModalidadeComboBoxActionPerformed(evt);
            }
        });

        txtDuracao.setBorder(javax.swing.BorderFactory.createTitledBorder("Duração"));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        turnoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino", "Noturno" }));
        turnoComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));
        turnoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoComboBoxActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setBorder(null);
        jScrollPane1.setViewportView(txtDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(idModalidadeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(turnoComboBox, 0, 142, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtDuracao)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(idModalidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(turnoComboBox)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turnoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnoComboBoxActionPerformed

    private void idModalidadeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idModalidadeComboBoxActionPerformed
        ModalidadesEsportivas modalidade = (ModalidadesEsportivas) idModalidadeComboBox.getSelectedItem();
        if (modalidade != null) {
            // Preencher os campos da tela com os dados da modalidade selecionada...
            txtDescricao.setText(modalidade.getDescricao());
            turnoComboBox.setSelectedItem(modalidade.getTurno());
            txtDuracao.setText(modalidade.getDuracao());
        }
    }//GEN-LAST:event_idModalidadeComboBoxActionPerformed
private ModalidadesEsportivas obterModalidadePorId(int idModalidade) {
    List<ModalidadesEsportivas> modalidades = daoModalidades.obterModalidades();
    for (ModalidadesEsportivas modalidade : modalidades) {
        if (modalidade.getIdModalidade() == idModalidade) {
            return modalidade;
        }
    }
    return null;
}
    
    
    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        String descricao = txtDescricao.getText();
        String turno = turnoComboBox.getSelectedItem().toString();
        String duracao = txtDuracao.getText();

        ModalidadesEsportivas modalidade = new ModalidadesEsportivas(descricao, turno, duracao);
        daoModalidades.inserirModalidade(modalidade);

        JOptionPane.showMessageDialog(this, "Modalidade criada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        atualizarTela();
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        ModalidadesEsportivas modalidadeSelecionada = (ModalidadesEsportivas) idModalidadeComboBox.getSelectedItem();
        if (modalidadeSelecionada != null) {
            int idModalidade = modalidadeSelecionada.getIdModalidade();
            String descricao = txtDescricao.getText();
            String turno = turnoComboBox.getSelectedItem().toString();
            String duracao = txtDuracao.getText();

            ModalidadesEsportivas modalidade = new ModalidadesEsportivas(idModalidade, descricao, turno, duracao);
            daoModalidades.atualizarModalidade(modalidade);

            JOptionPane.showMessageDialog(this, "Modalidade atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            atualizarTela();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ModalidadesEsportivas modalidadeSelecionada = (ModalidadesEsportivas) idModalidadeComboBox.getSelectedItem();
        if (modalidadeSelecionada != null) {
            int idModalidade = modalidadeSelecionada.getIdModalidade();
            daoModalidades.excluirModalidade(idModalidade);

            JOptionPane.showMessageDialog(this, "Modalidade excluída com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            atualizarTela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            TelaMenu menu = new TelaMenu();
            menu.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaModalidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<ModalidadesEsportivas> idModalidadeComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> turnoComboBox;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtDuracao;
    // End of variables declaration//GEN-END:variables
}
