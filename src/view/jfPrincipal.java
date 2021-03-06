/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author marco
 */
public class jfPrincipal extends javax.swing.JFrame {

    public static boolean estoque;
    /**
     * Creates new form jfPrincipal
     */
    public jfPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmCadastroForn = new javax.swing.JMenuItem();
        jmCadastroPeca = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmExibFornecedor = new javax.swing.JMenuItem();
        jmExibPecas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Estoque");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        jmCadastro.setText("Cadastro");

        jmCadastroForn.setText(" Fornecedor");
        jmCadastroForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroFornActionPerformed(evt);
            }
        });
        jmCadastro.add(jmCadastroForn);

        jmCadastroPeca.setText("Pe??a");
        jmCadastroPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroPecaActionPerformed(evt);
            }
        });
        jmCadastro.add(jmCadastroPeca);

        jMenuBar1.add(jmCadastro);

        jMenu1.setText("Consultar");

        jmExibFornecedor.setText("Fornecedores");
        jmExibFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmExibFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jmExibFornecedor);

        jmExibPecas.setText("Pe??as");
        jmExibPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmExibPecasActionPerformed(evt);
            }
        });
        jMenu1.add(jmExibPecas);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Relatorio");

        jMenuItem1.setText("Imprimir Relatorio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        
        jfPrincipal.estoque = false;
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jmCadastroFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroFornActionPerformed
        
        if(estoque == false){
            jifCadastroFornecedor obj = new jifCadastroFornecedor();
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jmCadastroFornActionPerformed

    private void jmCadastroPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroPecaActionPerformed

        if(estoque == false){
            jifCadastroPeca obj = new jifCadastroPeca();
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jmCadastroPecaActionPerformed

    private void jmExibFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmExibFornecedorActionPerformed

        if(estoque == false) {
            jifConsultarFornecedor obj = new jifConsultarFornecedor();
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jmExibFornecedorActionPerformed

    private void jmExibPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmExibPecasActionPerformed

        if(estoque == false){
            jifConsultarPeca obj = new jifConsultarPeca();
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jmExibPecasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        if(estoque == false) {
            jifListagem obj = new jifListagem();
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenuItem jmCadastroForn;
    private javax.swing.JMenuItem jmCadastroPeca;
    private javax.swing.JMenuItem jmExibFornecedor;
    private javax.swing.JMenuItem jmExibPecas;
    // End of variables declaration//GEN-END:variables
}
