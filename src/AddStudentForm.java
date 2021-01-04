import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddStudentForm extends javax.swing.JFrame {

    
    student std = new student();
    public AddStudentForm() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonMale);
        bg.add(jRadioButtonFemale);
        jRadioButtonMale.setSelected(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_FName = new javax.swing.JTextField();
        jTextField_LName = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jDateChooserBirthDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("New Student");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Sex:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("BirthDate:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address:");

        jTextField_FName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTextField_LName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jRadioButtonMale.setText("Male");

        jRadioButtonFemale.setText("Female");

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jButtonAddStudent.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonAddStudent.setText("Add");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jDateChooserBirthDate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_LName)
                            .addComponent(jTextField_Phone)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButtonFemale))
                                    .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jRadioButtonFemale))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddStudent)
                    .addComponent(jButtonCancel))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    public boolean verifText(){
        
        if(jTextField_FName.equals("") || jTextField_LName.equals("") 
                || jTextField_Phone.equals("") || jTextArea_Address.getText().equals("")
                 || jDateChooserBirthDate.getDate() == null){
            JOptionPane.showMessageDialog(null, "One or More Empty Field");
            return false;
        }
        else if(jDateChooserBirthDate.getDate().compareTo(new Date()) > 0){
            JOptionPane.showMessageDialog(null, "No Student From The Future Are Allowed");
            return false;
        }
        else{
            return true;
        }            
    }
    
    
    
    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String address = jTextArea_Address.getText();
        String sex = "Male";
        if(jRadioButtonFemale.isSelected()){
            sex = "Female";
        }
        
        if(verifText()){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(jDateChooserBirthDate.getDate());
        
            student std = new student();
            std.insertDeleteUpdateStudent('i', null, fname, lname, sex, phone, bdate, address);
            MainForm.jLabel_StdCount.setText("Student Count = " +Integer.toString(MyFunction.countData("student")));
            
            manageStudentForm.jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id", "First Name", "Last Name", "Sex", "BirthDate", "Address"}));
            std.fillStudentJtable(manageStudentForm.jTable1, "");
        }    
    }//GEN-LAST:event_jButtonAddStudentActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonCancel;
    private com.toedter.calendar.JDateChooser jDateChooserBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    // End of variables declaration//GEN-END:variables
}
