package telas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luana Yasmim
 */
public class RelatorioFuncionario extends javax.swing.JFrame {

    public RelatorioFuncionario() {
        initComponents();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
            
            //Obtendo os funcionarios
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo");
            ResultSet resultado = stConsultar.executeQuery();
            
            //Obtendo os departamentos
            //PreparedStatement stConsultarDepartamento = conectado.prepareStatement("SELECT distinct d.nome FROM funcionarios f right join departamentos d on f.cod_departamento = d.codigo");
            //ResultSet resultadoDepartamento = stConsultarDepartamento.executeQuery();
            
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            modeloTabela.setRowCount(0);
            while (resultado.next()) { 
              Object func[] = {
                resultado.getString("cpf"),
                resultado.getString("nome"),
                resultado.getString("salario"),
                resultado.getString("cargo"),
                resultado.getString("departamento")
              };
              
              modeloTabela.addRow(func);
              
              //Carregando comboBox com os cargos cadastrados 
              cmbCargo.addItem(resultado.getString("cargo"));
              
              //Completando o combo box com os departamentos
              //cmbDepartamento.addItem(resultado.getString("departamento"));
            } 
       
            //Completando o combo box de pesquisa
            cmbPesquisa.addItem("cpf");
            cmbPesquisa.addItem("nome");
            cmbPesquisa.addItem("salario");
            cmbPesquisa.addItem("departamento");
              
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
        tblFuncionarios = new javax.swing.JTable();
        lblCargo = new javax.swing.JLabel();
        cmbPesquisa = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();

        setTitle("Relatório Funcionários");
        getContentPane().setLayout(null);

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Salário", "Cargo", "Departamento"
            }
        ));
        jScrollPane1.setViewportView(tblFuncionarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 930, 270);

        lblCargo.setText("Cargo:");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(20, 30, 70, 30);

        cmbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPesquisa);
        cmbPesquisa.setBounds(480, 30, 140, 26);
        getContentPane().add(txtPesquisa);
        txtPesquisa.setBounds(630, 30, 190, 24);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(830, 30, 110, 24);

        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(70, 30, 240, 26);

        setSize(new java.awt.Dimension(976, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPesquisaActionPerformed
        //Nada
    }//GEN-LAST:event_cmbPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            ResultSet resultado = null;
             
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
            
            //Verifica o tipo da pesquisa
            if(cmbPesquisa.getSelectedItem().toString() == "cpf"){
                PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo where f.cpf like ?");
                stConsultar.setString(1, "%" + txtPesquisa.getText() + "%" );
                resultado = stConsultar.executeQuery();
            }  
            else if(cmbPesquisa.getSelectedItem().toString() == "nome"){
                PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo where f.nome like ?");
                stConsultar.setString(1, "%" + txtPesquisa.getText() + "%" );
                resultado = stConsultar.executeQuery();
            }
            else if(cmbPesquisa.getSelectedItem().toString() == "salario"){
                PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo where f.salario like ?");
                stConsultar.setString(1, "%" + txtPesquisa.getText() + "%" );
                resultado = stConsultar.executeQuery();
            }else if(cmbPesquisa.getSelectedItem().toString() == "departamento"){
                PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo where d.nome like ?");
                stConsultar.setString(1, "%" + txtPesquisa.getText() + "%" );
                resultado = stConsultar.executeQuery();
            }
                
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            modeloTabela.setRowCount(0);
            
            while (resultado.next()) { 
              Object func[] = {
                resultado.getString("cpf"),
                resultado.getString("nome"),
                resultado.getString("salario"),
                resultado.getString("cargo"),
                resultado.getString("departamento")                
              };
              modeloTabela.addRow(func);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
               
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT f.cpf, f.nome, f.salario, f.cargo, d.nome as departamento FROM tbl_funcionarios f inner join tbl_departamentos d on f.cod_departamento = d.codigo WHERE f.cargo = ?");
            stConsultar.setString(1, cmbCargo.getSelectedItem().toString());
            ResultSet resultado = stConsultar.executeQuery();
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            modeloTabela.setRowCount(0);
            
            while (resultado.next()) { 
              Object func[] = {
                resultado.getString("cpf"),
                resultado.getString("nome"),
                resultado.getString("salario"),
                resultado.getString("cargo"),
                resultado.getString("departamento")
              };
              modeloTabela.addRow(func);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_cmbCargoActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
