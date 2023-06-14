
package telas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Luana Yasmim
 */
public class ControleDepartamentos extends javax.swing.JFrame {

    public ControleDepartamentos(String op) {
        initComponents();
        
        if (op.equalsIgnoreCase("cadastrar")) {
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
            btnConsultar.setVisible(false);
        } else if (op.equalsIgnoreCase("consultar") || op.equalsIgnoreCase("excluir") || op.equalsIgnoreCase("alterar")) {
            btnSalvar.setVisible(false);
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setTitle("Controle de Departamentos");
        getContentPane().setLayout(null);

        lblCodigo.setText("Código:");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(30, 30, 43, 16);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(100, 30, 110, 24);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(280, 250, 70, 24);

        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 80, 37, 16);
        getContentPane().add(txtNome);
        txtNome.setBounds(100, 80, 250, 24);

        lblCidade.setText("Cidade:");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(30, 140, 43, 16);
        getContentPane().add(txtCidade);
        txtCidade.setBounds(100, 140, 250, 24);

        lblTelefone.setText("Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(30, 190, 60, 20);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(100, 190, 110, 24);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(240, 30, 140, 24);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(260, 200, 90, 24);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(80, 250, 80, 24);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(180, 250, 80, 24);

        setSize(new java.awt.Dimension(429, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtCodigo.requestFocus();
            return; // para a execução do programa
        }

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O nome é obrigatório");
            txtNome.requestFocus();
            return; // para a execução do programa
        }

        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
            PreparedStatement st = conectado.prepareStatement("INSERT INTO tbl_departamentos VALUES(?, ?, ?, ?);");
            st.setInt(1, Integer.parseInt(txtCodigo.getText()));
            st.setString(2, txtNome.getText());
            st.setString(3, txtCidade.getText());
            st.setString(4, txtTelefone.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Departamento cadastrado com sucesso! :)");
            
            //Limpando a tela
            txtCodigo.setText("");
            txtNome.setText("");
            txtCidade.setText("");
            txtTelefone.setText("");
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
           if (ex.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Este departamento de código " + txtCodigo.getText() + " já está cadastrado");
                txtCodigo.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
            PreparedStatement stConsultar = conectado.prepareStatement("select * from tbl_departamentos where codigo = ?");
            stConsultar.setInt(1, Integer.parseInt(txtCodigo.getText()));
            
            ResultSet resultado = stConsultar.executeQuery();
            
            if(resultado.next()){
                txtNome.setText(resultado.getString("nome"));
                txtCidade.setText(resultado.getString("cidade"));
                txtTelefone.setText(resultado.getString("telefone"));
                
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
                btnLimpar.setVisible(true);

            }
            else{
                JOptionPane.showMessageDialog(null,"Departamento não encontrado :(");
                txtCodigo.setText("");
                txtCodigo.requestFocus();
            }
       
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");
        txtCidade.setText("");
        txtTelefone.setText("");
            
        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);
        btnLimpar.setVisible(false);

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O código é obrigatório");
            txtCodigo.requestFocus();
            return;
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
            PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM tbl_departamentos WHERE codigo = ?");
            stExcluir.setString(1, txtCodigo.getText());
            stExcluir.executeUpdate();
            JOptionPane.showMessageDialog(null, "Departamento excluído com sucesso");
            
            txtCodigo.setText("");
            txtNome.setText("");
            txtCidade.setText("");
            txtTelefone.setText("");
            txtCodigo.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtCodigo.requestFocus();
            return; // para a execução do programa
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emp_java", "root", "root");
            PreparedStatement stAlterar = conectado.prepareStatement("UPDATE tbl_departamentos SET nome = ? , cidade = ? , telefone = ? WHERE codigo = ?");
            stAlterar.setString(1, txtNome.getText());
            stAlterar.setString(2, txtCidade.getText());
            stAlterar.setString(3, txtTelefone.getText());
            stAlterar.setString(4, txtCodigo.getText());
            stAlterar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Departamento alterado com sucesso");
            
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
            
            txtCodigo.setText("");
            txtNome.setText("");
            txtCidade.setText("");
            txtTelefone.setText("");
            txtCodigo.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
