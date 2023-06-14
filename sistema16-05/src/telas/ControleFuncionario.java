
package telas;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import dados.FuncionarioDao;


public class ControleFuncionario extends javax.swing.JFrame {

    public ControleFuncionario(String op) {
        initComponents();
        
        if (op.equalsIgnoreCase("cadastrar")) {
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
            btnConsultar.setVisible(false);
        } else if (op.equalsIgnoreCase("consultar") || op.equalsIgnoreCase("excluir") || op.equalsIgnoreCase("alterar")) {
            btnCadastrar.setVisible(false);
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        lblCodDepartamento = new javax.swing.JLabel();
        txtCodDepartamento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setTitle("Cadastrar Funcionário");
        setResizable(false);
        getContentPane().setLayout(null);

        lblCpf.setText("CPF");
        getContentPane().add(lblCpf);
        lblCpf.setBounds(30, 30, 43, 16);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(100, 30, 190, 24);

        lblNome.setText("Nome :");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 80, 43, 16);
        getContentPane().add(txtNome);
        txtNome.setBounds(100, 80, 320, 24);

        lblSalario.setText("Salário:");
        getContentPane().add(lblSalario);
        lblSalario.setBounds(30, 150, 43, 16);
        getContentPane().add(txtSalario);
        txtSalario.setBounds(100, 150, 110, 24);

        lblCodDepartamento.setText("Código do Departamento:");
        getContentPane().add(lblCodDepartamento);
        lblCodDepartamento.setBounds(30, 250, 160, 16);
        getContentPane().add(txtCodDepartamento);
        txtCodDepartamento.setBounds(200, 250, 110, 24);

        btnCadastrar.setText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(400, 350, 110, 24);

        lblCargo.setText("Cargo:");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(30, 200, 43, 16);
        getContentPane().add(txtCargo);
        txtCargo.setBounds(100, 200, 110, 24);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(270, 350, 110, 24);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(360, 30, 110, 24);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(140, 350, 110, 24);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(10, 350, 110, 24);

        setSize(new java.awt.Dimension(555, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        try {
            FuncionarioDao.Salvar(txtCpf.getText(), txtNome.getText(), txtSalario.getText(), txtCargo.getText(), txtCodDepartamento.getText());
            JOptionPane.showMessageDialog(null,"Funcionário cadastrado com sucesso! :)");
            
            //Limpando a tela
            txtCpf.setText("");
            txtNome.setText("");
            txtSalario.setText("");
            txtCargo.setText("");
            txtCodDepartamento.setText("");
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCpf.setText("");
        txtNome.setText("");
        txtSalario.setText("");
        txtCargo.setText("");
        txtCodDepartamento.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
         try {
            
            ResultSet resultado = FuncionarioDao.Consultar(txtCpf.getText());
            
            if(resultado.next()){
                txtCpf.setText(resultado.getString("cpf"));
                txtNome.setText(resultado.getString("nome"));
                txtSalario.setText(resultado.getString("salario"));
                txtCargo.setText(resultado.getString("cargo"));
                txtCodDepartamento.setText(resultado.getString("cod_departamento"));
                
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
                btnLimpar.setVisible(true);

            }
            else{
                JOptionPane.showMessageDialog(null,"Funcionário não encontrado :(");
                txtCpf.setText("");
                txtCpf.requestFocus();
            }
       
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O CPF é obrigatório");
            txtCpf.requestFocus();
            return; 
        }
        try {
            FuncionarioDao.Alterar(txtCpf.getText(), txtNome.getText(), txtSalario.getText(), txtCargo.getText(), txtCodDepartamento.getText());
            JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso");
            
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
  
            txtCpf.setText("");
            txtNome.setText("");
            txtSalario.setText("");
            txtCargo.setText("");
            txtCodDepartamento.setText("");
            txtCpf.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O CPF é obrigatório");
            txtCpf.requestFocus();
            return; 
        }
        try {
            FuncionarioDao.Excluir(txtCpf.getText());
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso");
            
            txtCpf.setText("");
            txtNome.setText("");
            txtSalario.setText("");
            txtCargo.setText("");
            txtCodDepartamento.setText("");
            txtCpf.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCodDepartamento;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCodDepartamento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
