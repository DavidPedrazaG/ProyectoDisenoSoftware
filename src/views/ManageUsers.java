/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.ManageUsersController;
import javax.swing.JOptionPane;
import models.User;

/**
 *
 * @author david
 */
public class ManageUsers extends javax.swing.JFrame {

    private ManageUsersController controller;
    
    private String codeLogIn;
    
    /**
     * Creates new form ManageUsers
     */
    public ManageUsers(String codeLogIn) {
        initComponents();
        this.codeLogIn = codeLogIn;
        controller = new ManageUsersController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(250, 237, 205));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainPanel.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 200, -1));
        mainPanel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, -1));
        mainPanel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        mainPanel.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, -1));

        updateBtn.setText("Editar");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        mainPanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        mainPanel.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        insertBtn.setText("Guardar");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        mainPanel.add(insertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel1.setText("Telefono:");
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, -1));

        jLabel2.setText("Codigo:");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, -1));

        jLabel3.setText("Nombre:");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 100, -1));

        jLabel4.setText("Apellido:");
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, -1));
        mainPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, -1));

        jLabel5.setText("Contraseña:");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        if(txtCode.getText().isEmpty() || txtName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
            return;
        }
        String code = txtCode.getText();
        String name = txtName.getText();
        String lastname = txtLastName.getText();
        String cellphone = txtTelefono.getText();
        String password = txtPassword.getText();
        User user = new User(code, name, lastname, cellphone, password);
        controller.guardar(user);
    }//GEN-LAST:event_insertBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if(txtCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
            return;
        }
        String code = txtCode.getText();
        controller.eliminar(code);
        if(code.equals(codeLogIn)){
            Main main = new Main();
            main.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if(txtCode.getText().isEmpty() || txtName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
            return;
        }
        String code = txtCode.getText();
        String name = txtName.getText();
        String lastname = txtLastName.getText();
        String cellphone = txtTelefono.getText();
        String password = txtPassword.getText();
        User user = new User(code, name, lastname, cellphone, password);
        controller.editar(user);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
            return;
        }
        String code = txtCode.getText();
        User user = controller.buscar(code);
        txtName.setText(user.getName());
        txtLastName.setText(user.getLastname());
        txtTelefono.setText(user.getCellphone());
        txtPassword.setText(user.getPassword());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:

        if(evt.getSource().equals(txtTelefono)){
            Character c = evt.getKeyChar();
            if(!Character.isDigit(c) && !c.toString().equals("")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(ManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
