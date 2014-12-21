/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbf;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.xBaseJ.*;
import org.xBaseJ.fields.CharField;
import org.xBaseJ.fields.NumField;

/**
 *
 * @author roberto
 */
public class Dbf extends javax.swing.JFrame {

    /**
     * Creates new form Dbf
     */
    public Dbf() {
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

        jLabelDbf = new javax.swing.JLabel();
        JtextFieldLocal = new javax.swing.JTextField();
        jButtonLocalizar = new javax.swing.JButton();
        jButtonConverter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLog = new javax.swing.JTextArea();
        jTextFieldNCM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonConverter1 = new javax.swing.JButton();
        jTextFieldNCMForce = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelDbf.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabelDbf.setText("                                  DBF");
        jLabelDbf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JtextFieldLocal.setEditable(false);
        JtextFieldLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextFieldLocalActionPerformed(evt);
            }
        });

        jButtonLocalizar.setText("Localizar");
        jButtonLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocalizarActionPerformed(evt);
            }
        });

        jButtonConverter.setText("Converter");
        jButtonConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConverterActionPerformed(evt);
            }
        });

        jTextAreaLog.setColumns(20);
        jTextAreaLog.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLog);

        jTextFieldNCM.setToolTipText("Defini um NCM padrão para todos os campos que estiverem com um valores zerados.");
        jTextFieldNCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNCMActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("             NCM");
        jLabel1.setToolTipText("Defini um NCM padrão para todos os campos que estiverem com um valores zerados.");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setName(""); // NOI18N

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        jPanel1.setToolTipText("IMPORTANTE");

        jButtonConverter1.setForeground(new java.awt.Color(255, 0, 0));
        jButtonConverter1.setText("Forçar troca");
        jButtonConverter1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jButtonConverter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConverter1ActionPerformed(evt);
            }
        });

        jTextFieldNCMForce.setToolTipText("Defini um NCM padrão para todos os campos, Independentemente se já tiverem com valores reais.");
        jTextFieldNCMForce.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jTextFieldNCMForce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNCMForceActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("     NCM (Forçar troca)");
        jLabel2.setToolTipText("Defini um NCM padrão para todos os campos, Independentemente se já tiverem com valores reais.");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConverter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNCMForce)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jTextFieldNCMForce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConverter1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JtextFieldLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNCM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDbf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConverter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelDbf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLocalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNCM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConverter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextFieldLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextFieldLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextFieldLocalActionPerformed

    private void jButtonLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocalizarActionPerformed
        
        
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //Filtrar por .dbf
        FileNameExtensionFilter filter = new FileNameExtensionFilter("DBF Viewer", "dbf");
        
        file.setFileFilter(filter);
        
        int i= file.showSaveDialog(null);
        
        if (i==1){
            JtextFieldLocal.setText(""); 
        } else { 
            File arquivo = file.getSelectedFile();
            JtextFieldLocal.setText(arquivo.getPath());
        }

        String caminho = JtextFieldLocal.getText();
        String caminho_format = caminho.replace("\\", "\\\\");
        
        try{
            DBF classDB = new DBF(caminho_format);
            
            //NumField codigo = (NumField) classDB.getField("CODIGO");
            jTextAreaLog.append("Total de registros: "+classDB.getRecordCount() + "\n");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonLocalizarActionPerformed

    private void jButtonConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConverterActionPerformed
        
        String caminho = JtextFieldLocal.getText();
        String caminho_format = caminho.replace("\\", "\\\\");
        
        try{
            
            // Open dbf file 
            DBF classDB = new DBF(caminho_format);
            
            // Define fields
            CharField descr = (CharField) classDB.getField("DESCR");
            NumField codigoNCM = (NumField) classDB.getField("CODIGONCM");
            
            
            
            for (int i = 0; i < classDB.getRecordCount(); i++) {
                
                classDB.read();
                String id = codigoNCM.get().replaceAll("\\s", "");
                                
                if(id.equals("123") || id.equals("")){
                    // NCM: 84451924
                    // Antes da atualização
                    //classDB.read();
                    //System.out.println("#" + (i+1) + " #Descrição: " + descr.get());
                    // Atualização                    
                    codigoNCM.put(jTextFieldNCM.getText());
                    classDB.update();
                    // Depois da atualização
                    
                    
                    //System.out.println("#" + (i+1) + " #Descrição: " + descr.get() + "\n");
                    jTextAreaLog.append("#" + (i+1) + " #Descrição: " + descr.get() + "\n");
                    
                }
            }
            jTextAreaLog.append("NCM atualizados com sucesso...");

        } catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonConverterActionPerformed

    private void jTextFieldNCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNCMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNCMActionPerformed

    private void jTextFieldNCMForceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNCMForceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNCMForceActionPerformed

    private void jButtonConverter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConverter1ActionPerformed
        
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente executar essa ação ?");
        System.out.println(escolha);
        
        if(escolha == 0){
            String caminho = JtextFieldLocal.getText();
            String caminho_format = caminho.replace("\\", "\\\\");
        
            try{
            
                // Open dbf file 
                DBF classDB = new DBF(caminho_format);
            
                // Define fields
                CharField descr = (CharField) classDB.getField("DESCR");
                NumField codigoNCM = (NumField) classDB.getField("CODIGONCM");
            
                for (int i = 0; i < classDB.getRecordCount(); i++) {
                
                    classDB.read();
                    String id = codigoNCM.get().replaceAll("\\s", "");
                    // NCM: 84451924
                    // Antes da atualização
                    //classDB.read();
                    //System.out.println("#" + (i+1) + " #Descrição: " + descr.get());
                    // Atualização                    
                    codigoNCM.put(jTextFieldNCMForce.getText());
                    classDB.update();
                    // Depois da atualização
                    
                    //System.out.println("#" + (i+1) + " #Descrição: " + descr.get() + "\n");
                    jTextAreaLog.append("#" + (i+1) + " #Descrição: " + descr.get() + "\n");
                }
            
            jTextAreaLog.append("NCM atualizados com sucesso...");

            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonConverter1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dbf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dbf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dbf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dbf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dbf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtextFieldLocal;
    private javax.swing.JButton jButtonConverter;
    private javax.swing.JButton jButtonConverter1;
    private javax.swing.JButton jButtonLocalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDbf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaLog;
    private javax.swing.JTextField jTextFieldNCM;
    private javax.swing.JTextField jTextFieldNCMForce;
    // End of variables declaration//GEN-END:variables
}