package telas;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import dados.UsuarioDao;

public class RelatorioUsuario extends javax.swing.JFrame {

    public RelatorioUsuario() {
        initComponents();
        try {
            ResultSet resultado = UsuarioDao.ListarTudo();
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            modeloTabela.setRowCount(0);
            while (resultado.next()) { 
              Object user[] = {
                resultado.getString("usuario"),
                resultado.getString("senha"),
                resultado.getString("cpf"),
                resultado.getString("cargo")
              };
              
              modeloTabela.addRow(user);
              
              cmbCargo.addItem(resultado.getString("cargo"));
            } 
       
            //Completando o combo box de pesquisa
            cmbPesquisa.addItem("usuario");
            cmbPesquisa.addItem("senha");
            cmbPesquisa.addItem("cpf");
              
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }         
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        cmbPesquisa = new javax.swing.JComboBox<>();

        setTitle("Relatório Usuário");
        getContentPane().setLayout(null);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuário", "Senha", "Cpf", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 960, 270);

        lblCargo.setText("Cargo:");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(20, 20, 70, 30);

        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(80, 20, 250, 26);
        getContentPane().add(txtPesquisa);
        txtPesquisa.setBounds(640, 20, 200, 24);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(850, 20, 110, 24);

        cmbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPesquisa);
        cmbPesquisa.setBounds(490, 20, 120, 26);

        setSize(new java.awt.Dimension(1003, 402));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        try {
            ResultSet resultado = UsuarioDao.PesquisarPorCargo(cmbCargo.getSelectedItem().toString());
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            modeloTabela.setRowCount(0);
            
            while (resultado.next()) { 
              Object user[] = {
                resultado.getString("usuario"),
                resultado.getString("senha"),
                resultado.getString("cpf"),
                resultado.getString("cargo")
              };
              modeloTabela.addRow(user);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
         try {
            ResultSet resultado = null;
             
            //Verifica o tipo da pesquisa
            if(cmbPesquisa.getSelectedItem().toString() == "usuario"){
                resultado = UsuarioDao.PesquisarPorUsuario(txtPesquisa.getText());
            }  
            else if(cmbPesquisa.getSelectedItem().toString() == "senha"){
                resultado = resultado = UsuarioDao.PesquisarPorSenha(txtPesquisa.getText());
            }
            else if(cmbPesquisa.getSelectedItem().toString() == "cpf"){
                resultado = resultado = UsuarioDao.PesquisarPorCpf(txtPesquisa.getText());
            }
                
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            modeloTabela.setRowCount(0);
            
            while (resultado.next()) { 
              Object user[] = {
                resultado.getString("usuario"),
                resultado.getString("senha"),
                resultado.getString("cpf"),
                resultado.getString("cargo")               
              };
              modeloTabela.addRow(user);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
               
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cmbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPesquisaActionPerformed
        //Nada
    }//GEN-LAST:event_cmbPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
