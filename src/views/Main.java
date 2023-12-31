/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.MainController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.AbstractBorder;
import view.resources.classes.TextBubbleBorder;

/**
 *
 * @author david
 */
public class Main extends javax.swing.JFrame {
    
    private MainController controller;
    private AbstractBorder border = new TextBubbleBorder(new Color(0, 0, 0),1,30,0); 
    private int xMouse, yMouse;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        controller = new MainController();
        this.loginBtn.setBorder(border);
        
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
        jPanel1 = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JPanel();
        iconoMinimizar = new javax.swing.JLabel();
        closeBtn = new javax.swing.JPanel();
        iconoCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        userPassword = new javax.swing.JSeparator();
        passwordIcon = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        passwordSeparator = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        loginLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(250, 237, 205));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(212, 163, 115));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        minimizeBtn.setBackground(new java.awt.Color(212, 163, 115));
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseExited(evt);
            }
        });

        iconoMinimizar.setBackground(new java.awt.Color(37, 36, 34));
        iconoMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/imgs/minimizar15px.png"))); // NOI18N
        iconoMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout minimizeBtnLayout = new javax.swing.GroupLayout(minimizeBtn);
        minimizeBtn.setLayout(minimizeBtnLayout);
        minimizeBtnLayout.setHorizontalGroup(
            minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimizeBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        minimizeBtnLayout.setVerticalGroup(
            minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimizeBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        closeBtn.setBackground(new java.awt.Color(212, 163, 115));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
        });

        iconoCerrar.setBackground(new java.awt.Color(37, 36, 34));
        iconoCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/imgs/cerrar15px.png"))); // NOI18N
        iconoCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout closeBtnLayout = new javax.swing.GroupLayout(closeBtn);
        closeBtn.setLayout(closeBtnLayout);
        closeBtnLayout.setHorizontalGroup(
            closeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, closeBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        closeBtnLayout.setVerticalGroup(
            closeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, closeBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 330, Short.MAX_VALUE)
                .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/imgs/logo.jpg"))); // NOI18N
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, 120));

        titlePanel.setBackground(new java.awt.Color(204, 213, 174));
        titlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setBackground(new java.awt.Color(204, 213, 174));
        titleLbl.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(107, 112, 92));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("LOGIN");
        titlePanel.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        mainPanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 160, 30));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/imgs/user.png"))); // NOI18N
        mainPanel.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 50, 50));

        txtUser.setBackground(new java.awt.Color(204, 213, 174));
        mainPanel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 225, 25));

        userPassword.setBackground(new java.awt.Color(250, 237, 205));
        userPassword.setForeground(new java.awt.Color(204, 204, 204));
        mainPanel.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 225, -1));

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/imgs/password.png"))); // NOI18N
        mainPanel.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 50, 50));

        txtPassword.setBackground(new java.awt.Color(204, 213, 174));
        mainPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 225, 25));

        passwordSeparator.setBackground(new java.awt.Color(250, 237, 205));
        passwordSeparator.setForeground(new java.awt.Color(204, 204, 204));
        mainPanel.add(passwordSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 225, 10));

        loginBtn.setBackground(new java.awt.Color(212, 163, 115));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        loginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLbl.setText("Ingresar");
        loginBtn.add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        mainPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
        String code = txtUser.getText();
        String password = txtPassword.getText();
        
        boolean res = controller.login(code, password);
        if(res){
            Menu menu = new Menu(code);
            menu.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorectos");
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void minimizeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseEntered
        minimizeBtn.setBackground(new Color(255, 196, 138));
    }//GEN-LAST:event_minimizeBtnMouseEntered

    private void minimizeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseExited
        minimizeBtn.setBackground(new Color(212,163,115));
    }//GEN-LAST:event_minimizeBtnMouseExited

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(Color.red);
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(212,163,115));
    }//GEN-LAST:event_closeBtnMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel closeBtn;
    private javax.swing.JLabel iconoCerrar;
    private javax.swing.JLabel iconoMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel minimizeBtn;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel userIcon;
    private javax.swing.JSeparator userPassword;
    // End of variables declaration//GEN-END:variables
}
