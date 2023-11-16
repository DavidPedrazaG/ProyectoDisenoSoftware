/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Clara Elizabeth
 */
public class TransactionFilter extends javax.swing.JFrame {
    
      private String codeLogIn;
    
    /**
     * Creates new form TransactionFilter
     */
    public TransactionFilter(String code) {
        initComponents();
        this.codeLogIn = code;
        
        
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        JBtnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBtnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 237, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(204, 213, 174));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registro un nuevo usuario", "Edito un  usuario", "Elimino un  usuario", "Devolvio un libro", "Registro un nuevo genero", "Edito un genero", "Elimino un genero", "Registro un nuevo libro", "Modifico un libro", "Elimino un libro", "Pidio prestado un libro" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel1.setText("Transacciones:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        JBtnVolver.setBackground(new java.awt.Color(212, 163, 115));
        JBtnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/imgs/backIcon.png"))); // NOI18N
        JBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, -1));

        jTable1.setBackground(new java.awt.Color(204, 213, 174));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 500, -1));

        JBtnRegistro.setBackground(new java.awt.Color(212, 163, 115));
        JBtnRegistro.setText("Crear Registro");
        JBtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnVolverActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu(codeLogIn);
        menu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_JBtnVolverActionPerformed

    private void JBtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnRegistroActionPerformed
        // TODO add your handling code here:
         Document documento = new Document();
        String nombre = JOptionPane.showInputDialog(this, "Ingerse el nombre del arichivo");
        try {
            // Obtener la ruta del directorio de inicio del usuario
            String ruta = System.getProperty("user.home");

            // Crear un escritor PDF que escribirá en un archivo en el escritorio del usuario
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Downloads/"+nombre+".pdf"));
            // Abrir el documento para escribir en él
            documento.open();

            // Crear una tabla con 3 columnas
            PdfPTable tabla = new PdfPTable(7);

            // Agregar encabezados a la tabla
            tabla.addCell("Nombre Usuario");
            tabla.addCell("ID Usuario");
            tabla.addCell("Nombre Libro");
            tabla.addCell("Fecha prestamo");
            tabla.addCell("Fecha devolucion");
            tabla.addCell("Categoria");
            tabla.addCell("Estado");

            // Agregar datos de un estudiante a la tabla
            for (int i = 0; i < model.getRowCount(); i++) {
                tabla.addCell(model.getValueAt(i, 0).toString());
                tabla.addCell(model.getValueAt(i, 1).toString());
                tabla.addCell(model.getValueAt(i, 2).toString());
                tabla.addCell(model.getValueAt(i, 3).toString());
                tabla.addCell(model.getValueAt(i, 4).toString());
                tabla.addCell(model.getValueAt(i, 5).toString());
                tabla.addCell(model.getValueAt(i, 6).toString());
                

            }

            // Agregar la tabla al documento PDF
            documento.add(tabla);

            // Cerrar el documento PDF
            documento.close();

            // Mostrar un mensaje emergente de notificación
            JOptionPane.showMessageDialog(this, "Reporte creado.");
        }catch(DocumentException | HeadlessException | FileNotFoundException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_JBtnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(TransactionFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnRegistro;
    private javax.swing.JButton JBtnVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
