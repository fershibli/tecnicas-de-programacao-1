/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Alunos
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public TelaMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(540, 300));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(540, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu4.setText("Cliente");
        jMenu4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem3.setText("Cadastrar novo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abreCadastrarCliente(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem1.setText("Alterar existente");
        jMenuItem1.setEnabled(false);
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Usuário");
        jMenu5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem4.setText("Cadastrar novo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abreCadastrarUsuario(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem10.setText("Alterar existente");
        jMenuItem10.setEnabled(false);
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Conta");
        jMenu6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem5.setText("Cadastrar nova");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem11.setText("Alterar existente");
        jMenuItem11.setEnabled(false);
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Agência");
        jMenu7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem6.setText("Cadastrar nova");
        jMenu7.add(jMenuItem6);

        jMenuItem12.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem12.setText("Alterar existente");
        jMenuItem12.setEnabled(false);
        jMenu7.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem13.setText("Listar todas");
        jMenuItem13.setEnabled(false);
        jMenu7.add(jMenuItem13);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Extrato");
        jMenu8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem7.setText("Cadastrar novo");
        jMenu8.add(jMenuItem7);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Histórico");
        jMenu9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem8.setText("Cadastrar novo");
        jMenu9.add(jMenuItem8);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void abreCadastrarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abreCadastrarCliente
        // TODO add your handling code here:
        TelaCadastraCliente telaNovoCliente = new TelaCadastraCliente();
        telaNovoCliente.setVisible(true);
        
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_abreCadastrarCliente

    private void abreCadastrarUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abreCadastrarUsuario
        TelaCadastrarUsuario telaNovoUsuario = new TelaCadastrarUsuario();
        telaNovoUsuario.setVisible(true);
        
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_abreCadastrarUsuario

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
