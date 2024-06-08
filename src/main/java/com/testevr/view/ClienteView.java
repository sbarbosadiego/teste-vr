package com.testevr.view;

import com.testevr.controller.ClienteController;
import com.testevr.model.ClienteModel;
import com.testevr.util.FormatarValor;
import com.testevr.util.FormatarData;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author Diego Barbosa
 */
public class ClienteView extends javax.swing.JFrame {

    // Data
    LocalDate dataAtual = LocalDate.now();
    int mesAtual = dataAtual.getMonthValue();
    Locale localeBR = new Locale("pt", "BR");
    NumberFormat valorReal = NumberFormat.getCurrencyInstance(localeBR);

    // Cliente
    ClienteModel clienteModel = new ClienteModel();
    ClienteController clienteController = new ClienteController();

    // Tela
    private MainView mainView;

    /**
     * Creates new form AlunoView
     */
    public ClienteView(MainView mainView) {
        initComponents();
        this.mainView = mainView;
    }

    public ClienteView() {

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
        btnSalvarCliente = new javax.swing.JButton();
        jtfNomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCancelarCliente = new javax.swing.JButton();
        jtfIdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfLimiteCliente = new javax.swing.JFormattedTextField();
        jsDiaFechamento = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);

        btnSalvarCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        jtfNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nome:");

        btnCancelarCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        jtfIdCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfIdCliente.setEnabled(false);
        jtfIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("ID:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Limite de Compra:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Dia de Fechamento:");

        jtfLimiteCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jtfLimiteCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jsDiaFechamento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jsDiaFechamento.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(254, 254, 254))
                            .addComponent(jtfNomeCliente)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtfLimiteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jsDiaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfLimiteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jsDiaFechamento)
                        .addGap(2, 2, 2)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        if (mainView.editarSalvar.equals("salvar")) {
            salvarCliente();
            dispose();
            mainView.setEnabled(true);
        } else if (mainView.editarSalvar.equals("editar")) {
            editarCliente();
        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void jtfNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        dispose();
        mainView.setEnabled(true);
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void jtfIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    private void salvarCliente() {
        if (jtfNomeCliente.getText().isEmpty() || jtfLimiteCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (jtfNomeCliente.getText().length() >= 100) {
            JOptionPane.showMessageDialog(null, "Campo nome excede o limite de 50 caracteres!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            clienteModel.setNomeCliente(jtfNomeCliente.getText().toUpperCase());
            clienteModel.setLimiteCompra(FormatarValor.formatarStringDouble(jtfLimiteCliente.getText()));
            int dia = jsDiaFechamento.getComponentCount();
            clienteModel.setDiaFechamentoFatura((Integer) jsDiaFechamento.getValue());
            if (clienteController.salvarClienteController(clienteModel) > 0) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
                mainView.listarClientes();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void editarCliente() {
        if (jtfNomeCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (jtfNomeCliente.getText().length() >= 100) {
            JOptionPane.showMessageDialog(null, "Campo nome excede o limite de 100 caracteres!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            clienteModel.setNomeCliente(jtfNomeCliente.getText().toUpperCase());
            clienteModel.setLimiteCompra(FormatarValor.formatarStringDouble(jtfLimiteCliente.getText()));
            clienteModel.setDiaFechamentoFatura((Integer) jsDiaFechamento.getValue());
            if (clienteController.atualizarClienteController(clienteModel)) {
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
                mainView.listarClientes();
                dispose();
                mainView.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados do cliente", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void setClienteModel(ClienteModel cliente) {
        this.clienteModel = cliente;
        jtfIdCliente.setText(this.clienteModel.getCodigoCliente().toString());
        jtfNomeCliente.setText(this.clienteModel.getNomeCliente());
        jsDiaFechamento.setValue(this.clienteModel.getDiaFechamentoFatura());
        jtfLimiteCliente.setText(clienteModel.getLimiteCompra().toString());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jsDiaFechamento;
    private javax.swing.JTextField jtfIdCliente;
    private javax.swing.JFormattedTextField jtfLimiteCliente;
    private javax.swing.JTextField jtfNomeCliente;
    // End of variables declaration//GEN-END:variables
}
