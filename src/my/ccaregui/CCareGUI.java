/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CCareGUI.java
 *
 * Created on Jul 24, 2011, 7:09:12 PM
 */
package my.ccaregui;

/**
 *
 * @author Expresso BRM
 */
import java.sql.*;
import javax.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
public class CCareGUI extends javax.swing.JFrame {

    /** Creates new form CCareGUI */
    ConnectDB cnn = new ConnectDB();
    Connection con =  cnn.getConnection();
   
    public CCareGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMDN = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        lblDisplay = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnResetPin = new javax.swing.JButton();
        btnMDNStateChange = new javax.swing.JButton();
        lblMDNState = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EXPRESSO TELECOM GH");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Enter Account # ");

        txtMDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMDNActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        lblDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDisplay.setForeground(new java.awt.Color(204, 0, 0));
        lblDisplay.setText("Account Status");

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemove.setText("Remove Blacklist");
        btnRemove.setEnabled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnResetPin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnResetPin.setText("Reset Pin");
        btnResetPin.setEnabled(false);
        btnResetPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPinActionPerformed(evt);
            }
        });

        btnMDNStateChange.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMDNStateChange.setText("MDN State change");
        btnMDNStateChange.setEnabled(false);
        btnMDNStateChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDNStateChangeActionPerformed(evt);
            }
        });

        lblMDNState.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMDNState.setForeground(new java.awt.Color(204, 0, 0));
        lblMDNState.setText("MDN State");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMDNStateChange, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResetPin, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMDN, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFind)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblMDNState, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(18, 18, 18)
                .addComponent(lblDisplay)
                .addGap(18, 18, 18)
                .addComponent(lblMDNState)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetPin)
                    .addComponent(btnRemove))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMDNStateChange)
                    .addComponent(btnClear))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(51, 0, 51));

        lblHead.setBackground(new java.awt.Color(0, 0, 0));
        lblHead.setFont(new java.awt.Font("Tahoma", 1, 30));
        lblHead.setForeground(new java.awt.Color(51, 0, 51));
        lblHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHead.setText("BLACKLISTED ACCOUNTS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHead, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMDNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMDNActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
         
        try{
             con.close();
             cnn=null;
             setVisible(false);
             dispose();
        }
        catch(Exception e){
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
       
       if (con==null){
          ConnectDB cnn = new ConnectDB();
          Connection con =  cnn.getConnection();
       }
    
       try
        { 
         if (txtMDN.getText().length()>=10){
          
          txtMDN.setText(txtMDN.getText().trim());
          String userInput ="233" +  txtMDN.getText().substring(txtMDN.getText().length()-9);
          txtMDN.setText(userInput);
          String myInput = txtMDN.getText().trim();
          
          //lblDisplay.setText(txtMDN.getText().trim());
          Statement s = con.createStatement();
          String select = "Select Pin_MSISDN, Blacklist_flag, Failure_count from Profile_pin where Pin_MSISDN = '" + myInput + "'";
          ResultSet rows;
          rows = s.executeQuery(select);
          
          
              int cnt=0;
              while (rows.next()) {
                  cnt++; 
                  if (String.valueOf(rows.getString(2)).equals("1")){
                        lblDisplay.setText("Blacklisted");
                        btnRemove.setEnabled(true);
                        btnResetPin.setEnabled(true);
                        txtMDN.setEnabled(false);
                     }
                     else{
                         lblDisplay.setText("Not Blacklisted");
                         btnRemove.setEnabled(false);
                         btnResetPin.setEnabled(true);
                        
                     }

              }
             s.close();
             rows.close();
             if (cnt<1){
                  JOptionPane.showMessageDialog(null, "Record not found");
              }
             
             //MDN State
             Statement t = con.createStatement();
             String select1 = "Select Device_ID, State_ID from device_t where device_ID = '" + myInput + "'";
             ResultSet rows1;
             rows1 = t.executeQuery(select1);
             
             int tc=0;
              while (rows1.next()) {
                  tc++; 
                  if (String.valueOf(rows1.getString(2)).equals("1")){
                        lblMDNState.setText("MDN is new");
                        btnMDNStateChange.setEnabled(false);
                        btnResetPin.setEnabled(true);
                        txtMDN.setEnabled(false);
                     }
                  else if (String.valueOf(rows1.getString(2)).equals("2")){
                         lblMDNState.setText("MDN is assigned");
                         btnMDNStateChange.setEnabled(false);
                         btnResetPin.setEnabled(true);
                        
                     }
                  else if (String.valueOf(rows1.getString(2)).equals("11")){
                         lblMDNState.setText("MDN is in Quarantine");
                         btnMDNStateChange.setEnabled(true);
                         btnResetPin.setEnabled(true);
                        
                     }

              }
             
             t.close();
             rows1.close();
         }
         else{
             JOptionPane.showMessageDialog(null, "Enter Account Number");
             txtMDN.requestFocus();
         }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        if (con==null){
          ConnectDB cnn = new ConnectDB();
          Connection con =  cnn.getConnection();
       }
        try{
           //lblDisplay.setText(txtMDN.getText().trim());
          con.setAutoCommit(false);
          String myInput = txtMDN.getText().trim();
          Statement s = con.createStatement();
          s.executeUpdate("UPDATE profile_pin set blacklist_flag=0, failure_count=0 where Pin_MSISDN = '" + myInput + "'");
          con.commit();
          
          lblDisplay.setText("Complete");
          btnRemove.setEnabled(false);
          btnResetPin.setEnabled(false);
          //txtMDN.setEnabled(true);
          //txtMDN.setText("");
          s.close();
          
        }
        catch(SQLException e){
           System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try{
          setLocationRelativeTo(null);
        }
        catch(Exception e){
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
         try{
           lblDisplay.setText("Account Status");
           lblMDNState.setText("MDN State");
           txtMDN.setEnabled(true);
           txtMDN.setText("");
           btnRemove.setEnabled(false);
           btnResetPin.setEnabled(false);
           btnMDNStateChange.setEnabled(false);
        }
        catch(Exception e){
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
           con.close();
           cnn=null;
        }
        catch(Exception e){
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnResetPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPinActionPerformed
        if (con==null){
          ConnectDB cnn = new ConnectDB();
          Connection con =  cnn.getConnection();
       }
        try{
           //lblDisplay.setText(txtMDN.getText().trim());
            
            
           JDialog.setDefaultLookAndFeelDecorated(true);
          int response = JOptionPane.showConfirmDialog(null, "Do you want to Reset PIN?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if (response == JOptionPane.YES_OPTION){
              con.setAutoCommit(false);
              String myInput = txtMDN.getText().trim();
              Statement s = con.createStatement();
              s.executeUpdate("UPDATE profile_pin set PIN_NUM=1111 where Pin_MSISDN = '" + myInput + "'");
              con.commit();

              lblDisplay.setText("PIN has been reset");
              btnResetPin.setEnabled(false);
              btnRemove.setEnabled(false);
              txtMDN.setEnabled(true);
              txtMDN.setText("");
              s.close();
           
          }  
            
            
            
        }
        catch(SQLException e){
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnResetPinActionPerformed

private void btnMDNStateChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDNStateChangeActionPerformed
    if (con==null){
          ConnectDB cnn = new ConnectDB();
          Connection con =  cnn.getConnection();
       }
        try{
           //lblDisplay.setText(txtMDN.getText().trim());
            
            
           JDialog.setDefaultLookAndFeelDecorated(true);
          int response = JOptionPane.showConfirmDialog(null, "Do you want to change the change MDN State?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if (response == JOptionPane.YES_OPTION){
              con.setAutoCommit(false);
              String myInput = txtMDN.getText().trim();
              Statement s = con.createStatement();
              s.executeUpdate("UPDATE device_t set State_ID=1 where device_ID = '" + myInput + "'");
              con.commit();

              lblDisplay.setText("MDN state has been changed to new");
              btnResetPin.setEnabled(false);
              btnRemove.setEnabled(false);
              txtMDN.setEnabled(true);
              txtMDN.setText("");
              s.close();
           
          }  
            
            
            
        }
        catch(SQLException e){
           System.out.println(e.getMessage());
        }
}//GEN-LAST:event_btnMDNStateChangeActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CCareGUI().setVisible(true);
               
                        
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnMDNStateChange;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnResetPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblMDNState;
    private javax.swing.JTextField txtMDN;
    // End of variables declaration//GEN-END:variables

  
}

