
package telas;

public class TelaMenu extends javax.swing.JFrame {

    
    public TelaMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDepartamentos = new javax.swing.JMenu();
        itmCadastrarDepartamentos = new javax.swing.JMenuItem();
        itmEditarDepartamentos = new javax.swing.JMenuItem();
        itmConsultarDepartamentos = new javax.swing.JMenuItem();
        itmExcluirDepartamentos = new javax.swing.JMenuItem();
        mnuRelatoriosDepartamentos = new javax.swing.JMenu();
        itmRelatorioGeralDepartamentos = new javax.swing.JMenuItem();
        itmRelatorioPorCidadeDepartamentos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmSair = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmEditarFuncionarios = new javax.swing.JMenuItem();
        itmConsultarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmRelatoriosFuncionarios = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        itmCadastrarUsuario = new javax.swing.JMenuItem();
        itmEditarUsuario = new javax.swing.JMenuItem();
        itmConsultarUsuario = new javax.swing.JMenuItem();
        itmExcluirUsuario = new javax.swing.JMenuItem();
        itmRelatoriosUsuarios = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmManualAjuda = new javax.swing.JMenuItem();
        itmSobreAjuda = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);

        jButton2.setText("Botão");
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 100, 100, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 627);

        mnuDepartamentos.setText("Departamentos");

        itmCadastrarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarDepartamentos.setText("Cadastrar");
        itmCadastrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmCadastrarDepartamentos);

        itmEditarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmEditarDepartamentos.setText("Editar");
        itmEditarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmEditarDepartamentos);

        itmConsultarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmConsultarDepartamentos.setText("Consultar");
        itmConsultarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmConsultarDepartamentos);

        itmExcluirDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirDepartamentos.setText("Excluir");
        itmExcluirDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmExcluirDepartamentos);

        mnuRelatoriosDepartamentos.setText("Relatórios");

        itmRelatorioGeralDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioGeralDepartamentos.setText("Geral");
        itmRelatorioGeralDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioGeralDepartamentosActionPerformed(evt);
            }
        });
        mnuRelatoriosDepartamentos.add(itmRelatorioGeralDepartamentos);

        itmRelatorioPorCidadeDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioPorCidadeDepartamentos.setText("Por cidade");
        mnuRelatoriosDepartamentos.add(itmRelatorioPorCidadeDepartamentos);

        mnuDepartamentos.add(mnuRelatoriosDepartamentos);
        mnuDepartamentos.add(jSeparator1);

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSair.setText("Sair");
        mnuDepartamentos.add(itmSair);

        jMenuBar1.add(mnuDepartamentos);

        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmCadastrarFuncionarios.setText("Cadastrar");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmEditarFuncionarios.setText("Editar");
        itmEditarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmEditarFuncionarios);

        itmConsultarFuncionarios.setText("Consultar");
        itmConsultarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmConsultarFuncionarios);

        itmExcluirFuncionarios.setText("Excluir");
        itmExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmRelatoriosFuncionarios.setText("Relatórios");
        itmRelatoriosFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmRelatoriosFuncionarios);

        jMenuBar1.add(mnuFuncionarios);

        mnuUsuarios.setText("Usuários");

        itmCadastrarUsuario.setText("Cadastrar");
        itmCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmCadastrarUsuario);

        itmEditarUsuario.setText("Editar");
        itmEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmEditarUsuario);

        itmConsultarUsuario.setText("Consultar");
        itmConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmConsultarUsuario);

        itmExcluirUsuario.setText("Excluir");
        itmExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmExcluirUsuario);

        itmRelatoriosUsuarios.setText("Relatório");
        itmRelatoriosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmRelatoriosUsuarios);

        jMenuBar1.add(mnuUsuarios);

        mnuAjuda.setText("Ajuda");

        itmManualAjuda.setText("Manual do usuário");
        mnuAjuda.add(itmManualAjuda);

        itmSobreAjuda.setText("Sobre");
        mnuAjuda.add(itmSobreAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(417, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirFuncionariosActionPerformed
        new ControleFuncionario("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirFuncionariosActionPerformed

    private void itmExcluirDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirDepartamentosActionPerformed
        new ControleDepartamentos("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirDepartamentosActionPerformed

    private void itmCadastrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarDepartamentosActionPerformed
        new ControleDepartamentos("cadastrar").setVisible(true);
        
    }//GEN-LAST:event_itmCadastrarDepartamentosActionPerformed

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        new ControleFuncionario("cadastrar").setVisible(true);
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed

    private void itmCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarUsuarioActionPerformed
        new ControleUsuario("cadastrar").setVisible(true);
    }//GEN-LAST:event_itmCadastrarUsuarioActionPerformed

    private void itmConsultarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarDepartamentosActionPerformed
        new ControleDepartamentos("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarDepartamentosActionPerformed

    private void itmEditarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarDepartamentosActionPerformed
        new ControleDepartamentos("alterar").setVisible(true);
    }//GEN-LAST:event_itmEditarDepartamentosActionPerformed

    private void itmRelatorioGeralDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioGeralDepartamentosActionPerformed
        new RelatorioDepartamento().setVisible(true);
    }//GEN-LAST:event_itmRelatorioGeralDepartamentosActionPerformed

    private void itmEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarUsuarioActionPerformed
        new ControleUsuario("alterar").setVisible(true);
    }//GEN-LAST:event_itmEditarUsuarioActionPerformed

    private void itmConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarUsuarioActionPerformed
        new ControleUsuario("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarUsuarioActionPerformed

    private void itmExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuarioActionPerformed
        new ControleUsuario("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirUsuarioActionPerformed

    private void itmEditarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarFuncionariosActionPerformed
        new ControleFuncionario("alterar").setVisible(true);
    }//GEN-LAST:event_itmEditarFuncionariosActionPerformed

    private void itmConsultarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarFuncionariosActionPerformed
        new ControleFuncionario("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarFuncionariosActionPerformed

    private void itmRelatoriosFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosFuncionariosActionPerformed
        new RelatorioFuncionario().setVisible(true);
    }//GEN-LAST:event_itmRelatoriosFuncionariosActionPerformed

    private void itmRelatoriosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosUsuariosActionPerformed
        new RelatorioUsuario().setVisible(true);
    }//GEN-LAST:event_itmRelatoriosUsuariosActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmCadastrarDepartamentos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarUsuario;
    private javax.swing.JMenuItem itmConsultarDepartamentos;
    private javax.swing.JMenuItem itmConsultarFuncionarios;
    private javax.swing.JMenuItem itmConsultarUsuario;
    private javax.swing.JMenuItem itmEditarDepartamentos;
    private javax.swing.JMenuItem itmEditarFuncionarios;
    private javax.swing.JMenuItem itmEditarUsuario;
    private javax.swing.JMenuItem itmExcluirDepartamentos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirUsuario;
    private javax.swing.JMenuItem itmManualAjuda;
    private javax.swing.JMenuItem itmRelatorioGeralDepartamentos;
    private javax.swing.JMenuItem itmRelatorioPorCidadeDepartamentos;
    private javax.swing.JMenuItem itmRelatoriosFuncionarios;
    private javax.swing.JMenuItem itmRelatoriosUsuarios;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmSobreAjuda;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuDepartamentos;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuRelatoriosDepartamentos;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
