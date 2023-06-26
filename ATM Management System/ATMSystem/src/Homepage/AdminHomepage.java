
package Homepage;

import Login.LoginForm;
import java.io.FileReader;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class AdminHomepage extends javax.swing.JFrame {
    // have to add
    // 1.Add Account 
    // 2.Edit Account
    // 3.Delete Account
    // 4.Show Data
    // 5. Exit.
    public AdminHomepage() {
        super("Admin Homepage");
       
        initComponents();
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_AddAccount = new javax.swing.JButton();
        btn_DelAccount = new javax.swing.JButton();
        btn_EditAccount = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        userHandler = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN HOMEPAGE");

        btn_AddAccount.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btn_AddAccount.setText("Add Account");
        btn_AddAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddAccountActionPerformed(evt);
            }
        });

        btn_DelAccount.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btn_DelAccount.setText("Delete Account");
        btn_DelAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_DelAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DelAccountActionPerformed(evt);
            }
        });

        btn_EditAccount.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btn_EditAccount.setText("Edit Account");
        btn_EditAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EditAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditAccountActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton1.setText("Account Details");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_Exit.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btn_Exit.setText("Exit");
        btn_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        userHandler.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        userHandler.setText("Go to User Panel");
        userHandler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userHandler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userHandlerActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addComponent(btn_AddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_DelAccount)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_EditAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(userHandler, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddAccount)
                    .addComponent(btn_DelAccount))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_EditAccount)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(userHandler)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Exit)
                    .addComponent(jButton2))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Homepage/bb.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddAccountActionPerformed
        // TODO add your handling code here:
        int n, checker;
        n=0;
        String CardNo = null, startbalance = null, customername, accounttype, pincode = null;
        boolean err = true;
        do{
            do{
                try{
                    CardNo = JOptionPane.showInputDialog(null, "Please enter Account Number: " , "ACCOUNT NUMBER ENTRY", JOptionPane.QUESTION_MESSAGE);
                    checker = Integer.parseInt(CardNo);
                    err = false; 
                }
                catch(NumberFormatException e){
                    System.out.print(e);
                }
            }
            while(err);
            err = true;
            
            String path = "D:" + File.separator + "DHA SUFFA" + File.separator + "Semester 2" + File.separator + "OOP LAB" + File.separator + "Prject" +File.separator+ "ATM Management System" +File.separator+ "ATMSystem" +File.separator+ "data" + File.separator + "accounts" +File.separator+ CardNo + ".txt";
           try{
               FileReader fr = new FileReader(path);
               JOptionPane.showMessageDialog(null, "Card Number Already exist. Re-enter a new card number.", "Account Number Error", JOptionPane.ERROR_MESSAGE);
           }
           catch(FileNotFoundException e){
               try {
                   FileWriter fw = new FileWriter(path);
               } catch (IOException ex) {
                   System.out.println(ex);
               }
               JOptionPane.showMessageDialog(null, "Card Number Created.");
               
               customername = JOptionPane.showInputDialog(null, "Please input Customer name: ","CUSTOMER NAME", JOptionPane.QUESTION_MESSAGE);
               accounttype = JOptionPane.showInputDialog(null, "Please enter Account type (Current or Saving):  ","Account Type", JOptionPane.QUESTION_MESSAGE);
               
               checker = 0;
               
               do{
                   try{
                        startbalance = JOptionPane.showInputDialog(null, "Please enter starting balance: ","Balance", JOptionPane.QUESTION_MESSAGE);
                        checker = Integer.parseInt(startbalance);
                        err = false;
                   }
                   catch(NumberFormatException ex){
                       System.out.print(ex);
                   }
               }
               while(err);
               
               err = true;
               checker = 0;
               
               do{
                   try{
                    pincode = JOptionPane.showInputDialog(null, "Please Enter a 4 Number pincode:", "Pincode Entry", JOptionPane.QUESTION_MESSAGE);
                    checker = Integer.parseInt(pincode);
                    err = false;
                    
                   }
                   catch(NumberFormatException ex){
                       System.out.print(ex);
                   }
                err = false;
               }
               while(err || (checker <999 || checker >9999));
               
               try {
                    savePerson(CardNo, customername, accounttype, startbalance, pincode);
                } catch (IOException ex) {
                    Logger.getLogger(AdminHomepage.class.getName()).log(Level.SEVERE, null, ex);
                }
               n++;
           }
        }
        while(n != 1);
        
    }//GEN-LAST:event_btn_AddAccountActionPerformed

    private void btn_DelAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DelAccountActionPerformed
        // TODO add your handling code here:
        del_data();
    }//GEN-LAST:event_btn_DelAccountActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_EditAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditAccountActionPerformed
        // TODO add your handling code here:
        editData();
    }//GEN-LAST:event_btn_EditAccountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userHandlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userHandlerActionPerformed
        // TODO add your handling code here:
        dispose();
        UserHomepage hpg = new UserHomepage();
        hpg.show();
    }//GEN-LAST:event_userHandlerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
Login.LoginForm obj = new LoginForm();
obj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void del_data(){
        String accno = JOptionPane.showInputDialog(null, "Please enter account no: ", "Account No", JOptionPane.QUESTION_MESSAGE);
        String path = "D:" + File.separator + "DHA SUFFA" + File.separator + "Semester 2" + File.separator + "OOP LAB" + File.separator + "Prject" +File.separator+ "ATM Management System" +File.separator+ "ATMSystem" +File.separator+ "data" + File.separator + "accounts"+File.separator+ accno + ".txt";
        File f = new File(path);
        if(f.exists()){
            int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?","Confirm Delete", JOptionPane.YES_NO_OPTION);
            if(input == 0){
                f.delete();  
                JOptionPane.showMessageDialog(null, "The File was successfully deleted!", "Delete Successfully!", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "You aborted the delete procedure! File still remains.", "Delete Aborted", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "The Account Number doesn't exist, re-check the Account number", "File Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void savePerson(String cardno, String name, String acctype, String bal, String pin) throws IOException{
        String path = "D:" + File.separator + "DHA SUFFA" + File.separator + "Semester 2" + File.separator + "OOP LAB" + File.separator + "Prject" +File.separator+ "ATM Management System" +File.separator+ "ATMSystem" +File.separator+ "data" + File.separator + "accounts"+File.separator+ cardno + ".txt";
        FileWriter fw = new FileWriter(path);
        fw.write(cardno + "," + name + "," + acctype + "," + bal + "," + pin);
        fw.close();
        
    }
    
    public void editData(){
        String cardno = JOptionPane.showInputDialog(null, "Please enter the Account No: ");
        String Filepath = "D:" + File.separator + "DHA SUFFA" + File.separator + "Semester 2" + File.separator + "OOP LAB" + File.separator + "Prject" +File.separator+ "ATM Management System" +File.separator+ "ATMSystem" +File.separator+ "data" + File.separator + "accounts"+File.separator+ cardno + ".txt";
        String line;
        String delimter = ",";
        String accNo = null, customerName = null, accType = null, accBal = null, pincode = null;
        boolean err = true;
        int n=1, checker = 0;
        
        try(BufferedReader br = new BufferedReader(new FileReader(Filepath))){
            while((line = br.readLine()) != null){
                String[] data = line.split(delimter);
                accNo = data[0];
                customerName = data[1];
                accType = data[2];
                accBal = data[3];
                pincode = data[4];
                System.out.println(accNo+"\n" + customerName+"\n" + accType+"\n" + accBal + "\n"+ pincode);
            }
          do{
                String input = JOptionPane.showInputDialog("What do you want to edit?\n\n 1.Customer Name?\n 2. Account Type? \n 3. Account Balance? \n4.Pincode?\n\n Enter your choice");
                int ch = Integer.parseInt(input);
            
                switch (ch){
                    case 1: {
                        customerName = JOptionPane.showInputDialog(null, "Enter a new name to replace the old one: ", "Customer Name Edit", JOptionPane.QUESTION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "The account details has been changed", "Changed successfully!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    case 2: {
                        accType = JOptionPane.showInputDialog(null, "Enter an account type from the ones shown below \n Current \n Savings", "Account Type Edit", JOptionPane.QUESTION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "The account details has been changed", "Changed successfully!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    case 3: {
                        do{
                            try{    
                            accBal = JOptionPane.showInputDialog(null, "Enter a new balance to replace the old one: ","New Balance", JOptionPane.QUESTION_MESSAGE);
                            checker = Integer.parseInt(accBal);
                            err = false;
                            }
                            catch(NumberFormatException e){
                                System.out.print(e);
                            }
                        }
                        while(err);
                        JOptionPane.showMessageDialog(null, "The account details has been changed", "Changed successfully!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case 4:{
                        err = true;
                        do{
                            try{
                                pincode = JOptionPane.showInputDialog(null, "Enter a new pincode: ", "New Pincode", JOptionPane.QUESTION_MESSAGE);
                                checker = Integer.parseInt(pincode);
                                err = false;
                            }
                            catch(NumberFormatException e){
                                System.out.print(e);
                            }
                        }
                        while(err || (checker <999 || checker >9999));
                        JOptionPane.showMessageDialog(null, "The account details has been changed", "Changed successfully!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                
                checker = JOptionPane.showConfirmDialog(null,"Do you still want to edit more details? ", "Confirm Message", JOptionPane.YES_NO_OPTION);
                System.out.print(checker);
                if(checker == 0){
                    n = 1;
                }
                else{
                    n = 0;
                    savePerson(accNo, customerName, accType, accBal, pincode);
                }
            }
          while(n==1);
        }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Account Number Doesn't Exist! Try Again!", "File not found", JOptionPane.ERROR_MESSAGE);
            }
         
            }
    
    public void showData(){
        
        String cardno = JOptionPane.showInputDialog(null, "Please enter the Account No: ");
        String Filepath = "D:" + File.separator + "DHA SUFFA" + File.separator + "Semester 2" + File.separator + "OOP LAB" + File.separator + "Prject" +File.separator+ "ATM Management System" +File.separator+ "ATMSystem" +File.separator+ "data" + File.separator + "accounts"+File.separator+ cardno + ".txt";
        String line;
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
            JOptionPane.showMessageDialog(null,"Account doesn't exist, try again!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_AddAccount;
    public javax.swing.JButton btn_DelAccount;
    public javax.swing.JButton btn_EditAccount;
    public javax.swing.JButton btn_Exit;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton userHandler;
    // End of variables declaration//GEN-END:variables
}
