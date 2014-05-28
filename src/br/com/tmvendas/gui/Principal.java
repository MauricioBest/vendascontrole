/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tmvendas.gui;

import br.com.tmvendas.dao.HibernateUtil;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.hibernate.classic.Session;



public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
        }
        getContentPane().setBackground(Color.white);
        initComponents();
        JPanel p = new JPanel();
        this.getContentPane().add(p);
        p.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.setLocationRelativeTo(null);
    }

    static {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.close();
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
        botaoFuncionario = new javax.swing.JButton();
        botaoClientes = new javax.swing.JButton();
        botaoProdutos = new javax.swing.JButton();
        botaoCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        botaoFuncionario.setText("Funcionarios");
        botaoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(botaoFuncionario);
        botaoFuncionario.setBounds(10, 10, 100, 100);

        botaoClientes.setText("Clientes");
        botaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClientesActionPerformed(evt);
            }
        });
        jPanel1.add(botaoClientes);
        botaoClientes.setBounds(120, 10, 100, 100);

        botaoProdutos.setText("Produtos");
        botaoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(botaoProdutos);
        botaoProdutos.setBounds(240, 10, 110, 100);

        botaoCompras.setText("Compras");
        botaoCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprasActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCompras);
        botaoCompras.setBounds(370, 10, 100, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFuncionarioActionPerformed
        Funcionarios view = new Funcionarios(this, true);
        view.setVisible(true);
    }//GEN-LAST:event_botaoFuncionarioActionPerformed

    private void botaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClientesActionPerformed
        Clientes view = new Clientes(this, true);
        view.setVisible(true);
    }//GEN-LAST:event_botaoClientesActionPerformed

    private void botaoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutosActionPerformed
        Produtos view = new Produtos(this, true);
        view.setVisible(true);
        
    }//GEN-LAST:event_botaoProdutosActionPerformed

    private void botaoComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprasActionPerformed
        Compras view = new Compras(this, true);
        view.setVisible(true);
    }//GEN-LAST:event_botaoComprasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoClientes;
    private javax.swing.JButton botaoCompras;
    private javax.swing.JButton botaoFuncionario;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}