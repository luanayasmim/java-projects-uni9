package telas;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import dados.DepartamentoDao;

public class RelatorioDepartamento extends javax.swing.JFrame {

    public RelatorioDepartamento() {
        initComponents();
        
        try {
            /*Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM tbl_departamentos");
            ResultSet resultado = stConsultar.executeQuery();*/
            ResultSet resultado = DepartamentoDao.ListarTudo();
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("nome"),
                resultado.getString("cidade"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
              
              cmbCodigo.addItem(resultado.getString("codigo"));
              cmbCidade.addItem(resultado.getString("cidade"));
            } 
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
        tblDepartamentos = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        cmbCodigo = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Cidade", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tblDepartamentos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 570, 210);

        lblCodigo.setText("Código:");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(10, 20, 70, 30);

        cmbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCodigo);
        cmbCodigo.setBounds(60, 20, 90, 26);

        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(320, 20, 70, 30);

        lblCidade.setText("Cidade:");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(160, 20, 70, 30);

        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCidade);
        cmbCidade.setBounds(210, 20, 100, 26);
        getContentPane().add(txtNome);
        txtNome.setBounds(360, 20, 80, 24);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(470, 20, 110, 24);

        setSize(new java.awt.Dimension(606, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
        try {
            ResultSet resultado = DepartamentoDao.PesquisarPorCodigo(cmbCodigo.getSelectedItem().toString());
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
            
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("nome"),
                resultado.getString("cidade"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }//GEN-LAST:event_cmbCodigoActionPerformed

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
        try {
            ResultSet resultado = DepartamentoDao.PesquisarPorCidade(cmbCidade.getSelectedItem().toString());
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
            
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("nome"),
                resultado.getString("cidade"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_cmbCidadeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
         try {
            ResultSet resultado = DepartamentoDao.PesquisarPorNome(txtNome.getText());
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
            
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("nome"),
                resultado.getString("cidade"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
               
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
