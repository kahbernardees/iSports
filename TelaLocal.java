package Telas;

import DAO.DaoLocais;
import com.mycompany.isports.Locais;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class TelaLocal extends javax.swing.JFrame {

    public TelaLocal() {
        super("Cadastro de Locais");
        initComponents();
        buscarLocais();
        setLocationRelativeTo(null);
        carregarDadosSelecionados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idComboBox = new javax.swing.JComboBox<>();
        txtEndereco = new javax.swing.JTextField();
        txtNomeLocal = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCriar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboBoxActionPerformed(evt);
            }
        });

        txtEndereco.setToolTipText("");
        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        txtNomeLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Local"));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNomeLocal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                    .addComponent(idComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
         TelaMenu menu = new TelaMenu();
         menu.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void idComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboBoxActionPerformed

        carregarDadosSelecionados();
    }//GEN-LAST:event_idComboBoxActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        try {
            DaoLocais dao = new DaoLocais();
            String endereco = txtEndereco.getText();
            String nomeLocal = txtNomeLocal.getText();
            dao.inserir(endereco, nomeLocal);

            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
            atualizarTela(); // Atualiza a tela após criar um novo registro
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao Cadastrar Local, tente novamente mais tarde." + e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            DaoLocais dao = new DaoLocais();
            int idLocal = Integer.parseInt(getIdComboBox());
            String endereco = txtEndereco.getText();
            String nomeLocal = txtNomeLocal.getText();
            dao.atualizar(idLocal, endereco, nomeLocal);

            JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso!");
            atualizarTela(); // Atualiza a tela após atualizar os dados
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao Atualizar Local, tente novamente mais tarde." + e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            DaoLocais dao = new DaoLocais();
            String selectedItemId = getIdComboBox();
            if (!selectedItemId.isEmpty()) {
                int idLocal = Integer.parseInt(selectedItemId);
                dao.apagar(idLocal);

                JOptionPane.showMessageDialog(null, "Local Excluído com Sucesso!");
                atualizarTela(); // Atualiza a tela após excluir o local
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum local selecionado para excluir.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao Excluir Local, tente novamente mais tarde." + e);
            e.printStackTrace();
        } 
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLocal().setVisible(true);
            }
        });
    }

    private void buscarLocais() {
        try {
            DaoLocais dao = new DaoLocais();
            Locais[] local = dao.obterLocais();
            idComboBox.setModel(new DefaultComboBoxModel<>(local));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Locais indisponíveis, tente novamente mais tarde." + e);
            e.printStackTrace();
        }
    }

    public String getIdComboBox() {
        Object selectedItem = idComboBox.getSelectedItem();
        if (selectedItem != null) {
            String selectedItemId = String.valueOf(((Locais) selectedItem).getIdLocal());
            
                return selectedItemId;
        }
        return "";
    }

    
    private void atualizarTela() {
        buscarLocais(); // Atualiza a lista de locais
        txtEndereco.setText(""); // Limpa o campo de endereço
        txtNomeLocal.setText(""); // Limpa o campo de nome do local
    }
    
    private void carregarDadosSelecionados() {
        Locais localSelecionado = (Locais) idComboBox.getSelectedItem();
        if (localSelecionado != null) {
            txtEndereco.setText(localSelecionado.getEndereco());
            txtNomeLocal.setText(localSelecionado.getNomeLocal());
        } else {
            txtEndereco.setText("");
            txtNomeLocal.setText("");
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<Locais> idComboBox;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeLocal;
    // End of variables declaration//GEN-END:variables
}
