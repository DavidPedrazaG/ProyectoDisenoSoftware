/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.ManageUsersController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.User;

/**
 *
 * @author david
 */
public class ManageUsers extends javax.swing.JFrame {

    private ManageUsersController controller;
    private int xMouse, yMouse;
    private String codeLogIn;
    private ArrayList<Object[]> users;
    private DefaultTableModel model;
    
    /**
     * Creates new form ManageUsers
     */
    public ManageUsers(String codeLogIn) {
        initComponents();
        this.codeLogIn = codeLogIn;
        controller = new ManageUsersController();
        users = controller.buscar("");
        model = (DefaultTableModel) JTblUsers.getModel();
        updateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblUsers = new javax.swing.JTable();
        windowBar = new javax.swing.JPanel();
        closeBtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        JTxtSearchBar = new javax.swing.JTextField();
        JBtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(250, 237, 205));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCode.setBackground(new java.awt.Color(204, 213, 174));
        mainPanel.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, -1));

        txtName.setBackground(new java.awt.Color(204, 213, 174));
        mainPanel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, -1));

        txtLastName.setBackground(new java.awt.Color(204, 213, 174));
        mainPanel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 200, -1));

        txtTelefono.setBackground(new java.awt.Color(204, 213, 174));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        mainPanel.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, -1));

        updateBtn.setBackground(new java.awt.Color(212, 163, 115));
        updateBtn.setText("Editar");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        mainPanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        deleteBtn.setBackground(new java.awt.Color(212, 163, 115));
        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        mainPanel.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        insertBtn.setBackground(new java.awt.Color(212, 163, 115));
        insertBtn.setText("Guardar");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        mainPanel.add(insertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel1.setText("Telefono:");
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, -1));

        jLabel2.setText("Codigo:");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, -1));

        jLabel3.setText("Nombre:");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, -1));

        jLabel4.setText("Apellido:");
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, -1));

        txtPassword.setBackground(new java.awt.Color(204, 213, 174));
        mainPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 200, -1));

        jLabel5.setText("Contraseña:");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, -1));

        jButton1.setBackground(new java.awt.Color(212, 163, 115));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, -1, -1));

        JTblUsers.setBackground(new java.awt.Color(204, 213, 174));
        JTblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Telefono", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblUsers);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 500, -1));

        windowBar.setBackground(new java.awt.Color(250, 237, 205));
        windowBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                windowBarMouseDragged(evt);
            }
        });
        windowBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                windowBarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout windowBarLayout = new javax.swing.GroupLayout(windowBar);
        windowBar.setLayout(windowBarLayout);
        windowBarLayout.setHorizontalGroup(
            windowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        windowBarLayout.setVerticalGroup(
            windowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        mainPanel.add(windowBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        closeBtn.setBackground(new java.awt.Color(250, 237, 205));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        closeBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        closeBtn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        mainPanel.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 50, 40));

        JTxtSearchBar.setBackground(new java.awt.Color(204, 213, 174));
        mainPanel.add(JTxtSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 380, -1));

        JBtnVolver.setBackground(new java.awt.Color(212, 163, 115));
        JBtnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/imgs/backIcon.png"))); // NOI18N
        JBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnVolverActionPerformed(evt);
            }
        });
        mainPanel.add(JBtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
        users = controller.buscar("");
        updateTable();
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
        users = controller.buscar("");
        updateTable();
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
        users = controller.buscar("");
        updateTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String code = JTxtSearchBar.getText();
        users = controller.buscar(code);
        updateTable();
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

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void windowBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowBarMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_windowBarMousePressed

    private void windowBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_windowBarMouseDragged

    private void JBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnVolverActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu(codeLogIn);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBtnVolverActionPerformed

    private void JTblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblUsersMouseClicked
        // TODO add your handling code here:
        int row = JTblUsers.getSelectedRow();
        txtCode.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        txtLastName.setText(model.getValueAt(row, 2).toString());
        txtTelefono.setText(model.getValueAt(row, 3).toString());
        txtPassword.setText(model.getValueAt(row, 4).toString());

    }//GEN-LAST:event_JTblUsersMouseClicked

    private void updateTable(){
        try {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < model.getRowCount(); j++) {
                    model.removeRow(j);
                }
            }
        } catch (Exception e) {
        }try {
            for (int i = 0; i < users.size(); i++) {
                model.addRow(users.get(i));
            }
        } catch (Exception e) {
        }
    }
    
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
    private javax.swing.JButton JBtnVolver;
    private javax.swing.JTable JTblUsers;
    private javax.swing.JTextField JTxtSearchBar;
    private javax.swing.JPanel closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JButton updateBtn;
    private javax.swing.JPanel windowBar;
    // End of variables declaration//GEN-END:variables
}
