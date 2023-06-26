
package Homepage;

import Fast.FastCash;
import Login.LoginForm;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserHomepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public UserHomepage() {
        super("User Homepage");
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        acc_details = new javax.swing.JButton();
        balance_btn = new javax.swing.JButton();
        main_withdraw = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER HOMEPAGE");

        acc_details.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        acc_details.setText("Account Details");
        acc_details.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        acc_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_detailsActionPerformed(evt);
            }
        });

        balance_btn.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        balance_btn.setText("Balance");
        balance_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        balance_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance_btnActionPerformed(evt);
            }
        });

        main_withdraw.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        main_withdraw.setText("Withdraw");
        main_withdraw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        main_withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_withdrawActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Fast Cash");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton2.setText("Back\n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(main_withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acc_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balance_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acc_details)
                    .addComponent(balance_btn))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(main_withdraw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exit)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Homepage/asdf.gif"))); // NOI18N
        jLabel2.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void main_withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_withdrawActionPerformed
        try {
            // TODO add your handling code here:
            AccWithdraw();
        } catch (IOException ex) {
            Logger.getLogger(UserHomepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_main_withdrawActionPerformed

    private void balance_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balance_btnActionPerformed
        // TODO add your handling code here:
        showBalance();
    }//GEN-LAST:event_balance_btnActionPerformed

    private void acc_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_detailsActionPerformed
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_acc_detailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

fastcash();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
Login.LoginForm obj = new LoginForm();
obj.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
     public void savePerson(String cardno, String name, String acctype, int bal, String pin) throws IOException{
        String path = "D:" + File.separator + "DHA SUFFA" + File.separator + "Semester 2" + File.separator
                + "OOP LAB" + File.separator + "Prject" + File.separator + "ATM Management System (2)gfdga"
                + File.separator + "ATM Management System" + File.separator + "ATMSystem" + File.separator + "data"
                + File.separator + "accounts" + File.separator + cardno + ".txt";
        FileWriter fw = new FileWriter(path);
        fw.write(cardno + "," + name + "," + acctype + "," + bal + "," + pin);
        fw.close();
        
    }
    public void showBalance(){
        String cardno = JOptionPane.showInputDialog(null, "Please enter the Account No: ");
        String Filepath = "D:" + File.separator + "DHA SUFFA" + File.separator + "Semester 2" + File.separator
                + "OOP LAB" + File.separator + "Prject" + File.separator + "ATM Management System (2)gfdga"
                + File.separator + "ATM Management System" + File.separator + "ATMSystem" + File.separator + "data"
                + File.separator + "accounts" + File.separator + cardno + ".txt";String line;
        String delimter = ",";
        String accNo = null, customerName = null, accType = null, accBal = null, accPin = null;
        
        try(BufferedReader br = new BufferedReader(new FileReader(Filepath))){
            while((line = br.readLine()) != null){
                String[] data = line.split(delimter);
                accNo = data[0];
                customerName = data[1];
                accType = data[2];
                accBal = data[3];
                accPin = data[4];
            }
            JOptionPane.showMessageDialog(null,"Your Balance is: \n\n" + accBal, "Account Details", JOptionPane.OK_OPTION);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "The Given account Number doesn't exist, please recheck.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void showData(){
        String cardno = JOptionPane.showInputDialog(null, "Please enter the Account No: ");
        String Filepath = "D:" + File.separator + "DHA SUFFA" + File.separator + "Semester 2" + File.separator
                + "OOP LAB" + File.separator + "Prject" + File.separator + "ATM Management System (2)gfdga"
                + File.separator + "ATM Management System" + File.separator + "ATMSystem" + File.separator + "data"
                + File.separator + "accounts" + File.separator + cardno + ".txt";String line;
        String delimter = ",";
        String accNo = null, customerName = null, accType = null, accBal = null, accPin = null;
        
        try(BufferedReader br = new BufferedReader(new FileReader(Filepath))){
            while((line = br.readLine()) != null){
                String[] data = line.split(delimter);
                accNo = data[0];
                customerName = data[1];
                accType = data[2];
                accBal = data[3];
                accPin = data[4];
            }
            JOptionPane.showMessageDialog(null, "Account Number: " + accNo + "\n\nCustomer Name: " + customerName + "\n\nAccount Type: " + accType + "\n\nAccount Balance: " + accBal + "\n\nPincode: " + accPin, "Account Details", JOptionPane.OK_OPTION);
        }
        catch(IOException e){
//            System.out.print(e);
              JOptionPane.showMessageDialog(null, "The Given account Number doesn't exist, please recheck.", "Error Message", JOptionPane.ERROR_MESSAGE);

        }
    }
    public void AccWithdraw() throws IOException{
        boolean err = true;
int checker = 0, fin_am = 0;
String cardno = JOptionPane.showInputDialog(null, "Please enter the Account No: ");
String filePath = "D:" + File.separator + "DHA SUFFA" + File.separator + "Semester 2" + File.separator
                + "OOP LAB" + File.separator + "Prject" + File.separator + "ATM Management System (2)gfdga"
                + File.separator + "ATM Management System" + File.separator + "ATMSystem" + File.separator + "data"
                + File.separator + "accounts" + File.separator + cardno + ".txt";
String line, pin = null;
String delimiter = ",";
String accNo = null, customerName = null, accType = null, accBal = null, accPin = null, amount = null;

do {
    try {
        pin = JOptionPane.showInputDialog(null, "Enter the 4 digit pincode: ", "Pincode?", JOptionPane.QUESTION_MESSAGE);
        checker = Integer.parseInt(pin);
        err = false;
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Enter a valid 4 digit pin", "Error Message - Wrong Pin", JOptionPane.ERROR_MESSAGE);
    }
} while (err || (checker < 999 || checker > 9999));

try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
    while ((line = br.readLine()) != null) {
        String[] data = line.split(delimiter);
        accNo = data[0];
        customerName = data[1];
        accType = data[2];
        accBal = data[3];
        accPin = data[4];
    }
    if (pin.equals(accPin)) {
        amount = JOptionPane.showInputDialog(null, "How much do you want to withdraw?");
        if (Integer.parseInt(amount) <= Integer.parseInt(accBal)) {
            fin_am = Integer.parseInt(accBal) - Integer.parseInt(amount);
            JOptionPane.showMessageDialog(null, "The amount has been withdrawn!");
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient Balance!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "The credentials are wrong!");
    }
    savePerson(accNo, customerName, accType, fin_am, accPin);
} catch (IOException e) {
    JOptionPane.showMessageDialog(null, "The Given account Number doesn't exist, please recheck.", "Error Message", JOptionPane.ERROR_MESSAGE);
}
    }    
    public void fastcash(){
        
        this.dispose();
        Fast.FastCash obj  = new FastCash();
        obj.setVisible(true);
    }

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton acc_details;
    public javax.swing.JButton balance_btn;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton main_withdraw;
    // End of variables declaration//GEN-END:variables
}
