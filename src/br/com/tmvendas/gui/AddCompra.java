/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tmvendas.gui;

import br.com.tmvendas.dao.ClienteDAO;
import br.com.tmvendas.dao.CompraDAO;
import br.com.tmvendas.dao.ProdutoDAO;
import br.com.tmvendas.modelo.Cliente;
import br.com.tmvendas.modelo.Compra;
import br.com.tmvendas.modelo.Produto;
import java.util.List;
import javax.swing.JOptionPane;

public class AddCompra extends javax.swing.JDialog {

    private boolean flag;
    private Compra compra;

    public AddCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.flag = false;
        setLocationRelativeTo(null);
    }

    public void preencherComboBox() {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.list();
        comboProduto.removeAllItems();
        for (int i = 0; i < produtos.size(); i++) {
            comboProduto.addItem(produtos.get(i));
        }

        ClienteDAO clienteDao = new ClienteDAO();
        List<Cliente> clientes = clienteDao.list();
        comboCliente.removeAllItems();
        for (int i = 0; i < clientes.size(); i++) {
            comboCliente.addItem(clientes.get(i));
        }

        comboFormaDePagamento.removeAllItems();

        comboFormaDePagamento.addItem("Cartão");
        comboFormaDePagamento.addItem("Dinheiro");


    }

    public AddCompra(java.awt.Frame parent, boolean modal, Compra compra) {
        super(parent, modal);
        initComponents();

        this.compra = compra;
        comboProduto.setSelectedItem(compra.getProduto());
        comboCliente.setSelectedItem(compra.getCliente());
        comboFormaDePagamento.setSelectedItem(compra.getFormaDePagamento());
        this.flag = true;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelProduto = new javax.swing.JLabel();
        comboProduto = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        comboFormaDePagamento = new javax.swing.JComboBox();
        comboCliente = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adcionar Turma");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1294_16x16.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        labelNome.setText("Cliente:");

        labelProduto.setText("Produto:");

        comboProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Forma De Pagamento:");

        comboFormaDePagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFormaDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFormaDePagamentoActionPerformed(evt);
            }
        });

        comboCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(botaoSalvar)
                        .addGap(10, 10, 10)
                        .addComponent(botaoCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(comboFormaDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProduto)
                    .addComponent(labelNome))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboFormaDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoCancelar))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        CompraDAO dao = new CompraDAO();
        Compra d = new Compra();


        if (flag) {

            compra.setProduto((Produto) comboProduto.getSelectedItem());
            compra.setCliente((Cliente) comboCliente.getSelectedItem());
            compra.setFormaDePagamento((String) comboFormaDePagamento.getSelectedItem());
            dao.update(compra);
            JOptionPane.showMessageDialog(null, "Compra editada com sucesso.", "Ok", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            if ((comboProduto.getSelectedItem() != null) || (comboCliente.getSelectedItem() != null) || (comboFormaDePagamento.getSelectedItem() != null)) {
                d.setProduto((Produto) comboProduto.getSelectedItem());
                d.setCliente((Cliente) comboCliente.getSelectedItem());
                d.setFormaDePagamento((String) comboFormaDePagamento.getSelectedItem());
                dao.add(d);
                JOptionPane.showMessageDialog(null, "Compra cadastrada com sucesso.", "Ok", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Não é possivel cadastrar uma compra sem Período. Algum Campo não foi Preenchido", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        preencherComboBox();
    }//GEN-LAST:event_formWindowActivated

    private void comboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProdutoActionPerformed

    private void comboFormaDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFormaDePagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFormaDePagamentoActionPerformed

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClienteActionPerformed

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
            java.util.logging.Logger.getLogger(AddCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCompra dialog = new AddCompra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox comboCliente;
    private javax.swing.JComboBox comboFormaDePagamento;
    private javax.swing.JComboBox comboProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelProduto;
    // End of variables declaration//GEN-END:variables
}
