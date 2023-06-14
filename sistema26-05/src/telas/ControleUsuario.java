package telas;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import dados.UsuarioDao;
import models.Usuario;

public class ControleUsuario extends javax.swing.JFrame {

    public ControleUsuario(String op) {
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

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblSenha1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();

        setTitle("Cadastrar Usuário");
        getContentPane().setLayout(null);

        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(30, 30, 47, 16);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(100, 30, 170, 24);

        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(30, 80, 39, 16);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(100, 80, 250, 24);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(380, 210, 110, 24);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(140, 210, 100, 24);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(330, 30, 160, 24);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(20, 210, 100, 24);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(260, 210, 100, 24);

        lblSenha1.setText("CPF:");
        getContentPane().add(lblSenha1);
        lblSenha1.setBounds(30, 130, 27, 16);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(100, 130, 250, 24);

        setSize(new java.awt.Dimension(527, 304));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Usuario usuario = new Usuario();
        usuario.setUsuario(txtUsuario.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setCpf(txtCpf.getText());
        
        try {            
            UsuarioDao.Salvar(usuario);
            
            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso! :)");
            
            //Limpando a tela
            txtUsuario.setText("");
            txtSenha.setText("");
            txtCpf.setText("");
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);

        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O nome do usuário é obrigatório");
            txtUsuario.requestFocus();
            return; 
        }
        
        Usuario usuario = new Usuario();
        usuario.setUsuario(txtUsuario.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setCpf(txtCpf.getText());
        
        try {            
            UsuarioDao.Alterar(usuario);
            
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso :)");
            
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
  
            txtUsuario.setText("");
            txtSenha.setText("");
            txtCpf.setText("");
            txtUsuario.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            ResultSet resultado = UsuarioDao.Consultar(txtUsuario.getText());
            
            if(resultado.next()){
                txtUsuario.setText(resultado.getString("usuario"));
                txtSenha.setText(resultado.getString("senha"));
                txtCpf.setText(resultado.getString("cpf_funcionario"));
                
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
                btnLimpar.setVisible(true);

            }
            else{
                JOptionPane.showMessageDialog(null,"Usuário não encontrado :(");
                txtUsuario.setText("");
                txtUsuario.requestFocus();
            }
       
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O usuário é obrigatório");
            txtUsuario.requestFocus();
            return;
        }
        try {
            UsuarioDao.Excluir(txtUsuario.getText());
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
            
            txtUsuario.setText("");
            txtSenha.setText("");
            txtUsuario.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtUsuario.setText("");
        txtSenha.setText("");
            
        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);
        btnLimpar.setVisible(false);
    }//GEN-LAST:event_btnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
