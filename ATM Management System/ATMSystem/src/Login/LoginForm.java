package Login;
import Homepage.AdminHomepage;
import Homepage.UserHomepage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    private String s2, s1, password, text;
    
    public LoginForm() {
        super("Login Form");
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelectorGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtPassword = new javax.swing.JPasswordField();
        AdminRB = new javax.swing.JRadioButton();
        UserRB = new javax.swing.JRadioButton();
        blogin = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        jCB_showpass = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, -1, -1));
        jPanel1.add(jtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 118, 200, -1));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 155, -1, -1));
        jPanel1.add(jtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 154, 200, -1));

        AdminRB.setBackground(new java.awt.Color(255, 255, 255));
        SelectorGroup.add(AdminRB);
        AdminRB.setText("Admin");
        jPanel1.add(AdminRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 194, -1, -1));

        UserRB.setBackground(new java.awt.Color(255, 255, 255));
        SelectorGroup.add(UserRB);
        UserRB.setText("User");
        UserRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserRBActionPerformed(evt);
            }
        });
        jPanel1.add(UserRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 194, -1, -1));

        blogin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        blogin.setText("Login");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        jPanel1.add(blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 249, 140, -1));

        bexit.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        bexit.setText("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        jPanel1.add(bexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 249, 139, -1));

        jCB_showpass.setBackground(new java.awt.Color(255, 255, 255));
        jCB_showpass.setText("Show Password");
        jCB_showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_showpassActionPerformed(evt);
            }
        });
        jPanel1.add(jCB_showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 155, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/a.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        try {
            FileReader fr = new FileReader("loginInfo.txt");
            BufferedReader br = new BufferedReader(fr);
            
            s1 = br.readLine(); //for Username
            s2 = br.readLine(); //for Password
            char [] p = jtPassword.getPassword();
            password = new String(p);
            text = jtUser.getText();
                   if (text.isEmpty() && password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out username and password");
        }
        else if(text.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out the username");
        }
        else if(password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out the password");
        }
        else if(!jtUser.getText().equals(s1) && !password.equals(s2)){
            JOptionPane.showMessageDialog(null, "Wrong Username or Password", "Message", JOptionPane.ERROR_MESSAGE);
        }
        else if(!UserRB.isSelected() && !AdminRB.isSelected()){
            JOptionPane.showMessageDialog(null, "Please select one option");  
        }
        else if(jtUser.getText().equals(s1) && password.equals(s2)){
           JOptionPane.showMessageDialog(null, "Login Successfull..!");
            if(UserRB.isSelected()){
//          *********************************USER HOMEPAGE************************
                dispose();
                UserHomepage hpg = new UserHomepage();
                hpg.show();
           }
            else if(AdminRB.isSelected()){
//          *********************************ADMIN HOMEPAGE************************
                dispose();
                AdminHomepage adm_hpg = new AdminHomepage();
                adm_hpg.show();
            }      
        }
        else {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password", "Message", JOptionPane.ERROR_MESSAGE);
        }
                   fr.close();
                   br.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
        
    }//GEN-LAST:event_bloginActionPerformed

    private void jCB_showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_showpassActionPerformed
      
        if(jCB_showpass.isSelected()){
            jtPassword.setEchoChar((char)0);
        }
        else{
            jtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCB_showpassActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bexitActionPerformed

    private void UserRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserRBActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRB;
    private javax.swing.ButtonGroup SelectorGroup;
    private javax.swing.JRadioButton UserRB;
    private javax.swing.JButton bexit;
    private javax.swing.JButton blogin;
    private javax.swing.JCheckBox jCB_showpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtUser;
    // End of variables declaration//GEN-END:variables
}
