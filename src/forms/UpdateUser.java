/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import utility.BDutility;
import java.sql.*;
import dao.ConnectionProvider;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
 

public class UpdateUser extends javax.swing.JFrame {
String uniqueReg=null;
    String existingImageName=null;
    BufferedImage originalImage=null;
    File selectedFile=null;
    public UpdateUser() {
        initComponents();
        BDutility.setImage(this,"images/abc1.jpg", 860,542);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.BLACK));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblImage = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(860, 542));
        setMinimumSize(new java.awt.Dimension(860, 542));
        setUndecorated(true);

        jLabel8.setText("Country");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Update User");

        jLabel2.setText("Name");

        jLabel3.setText("Gender");

        jLabel4.setText("Email");

        jLabel5.setText("Contact");

        jLabel6.setText("Address");

        jLabel7.setText("State");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        radioMale.setText("Male");
        radioMale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioMaleItemStateChanged(evt);
            }
        });

        radioFemale.setText("Female");
        radioFemale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioFemaleItemStateChanged(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jInternalFrame1.setVisible(true);

        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("x");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail)
                    .addComponent(txtContact)
                    .addComponent(txtAddress)
                    .addComponent(txtState)
                    .addComponent(txtCountry)
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnExit)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(radioMale)
                            .addComponent(radioFemale))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void radioMaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioMaleItemStateChanged
        if(radioMale.isSelected()){
            radioFemale.setSelected(false);
        }
    }//GEN-LAST:event_radioMaleItemStateChanged

    private void radioFemaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioFemaleItemStateChanged
        if(radioFemale.isSelected()){
            radioMale.setSelected(false);
        }
    }//GEN-LAST:event_radioFemaleItemStateChanged

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
       JDialog dialog=new JDialog();
       dialog.setUndecorated(true);
       dialog.setSize(600,400);
       JFileChooser fileChooser=new JFileChooser();
       FileNameExtensionFilter filter=new FileNameExtensionFilter("JPG Images","jpg");
       fileChooser.setFileFilter(filter);
       fileChooser.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           if(e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)){
               selectedFile=fileChooser.getSelectedFile();
               try{
                   originalImage=ImageIO.read(selectedFile);
                   
                   int originalWidth=originalImage.getWidth();
                   int originalHeight=originalImage.getHeight();
                   
                   int labelWidth=lblImage.getWidth();
                   int labelHeight=lblImage.getHeight();
                   
                   double scaleX=(double) labelWidth/originalWidth;
                   double scaleY=(double) labelHeight/originalHeight;
                   
                   double scale=Math.min(scaleY, scaleY);
                   
                   int scaledWidth=(int)(originalWidth*scale);
                   int scaledHeight=(int)(originalHeight*scale);
                   
                   Image scaleImage=originalImage.getScaledInstance(scaledWidth,scaledHeight, Image.SCALE_SMOOTH);
               }catch(IOException ex){
                   ex.printStackTrace();
               }
               
           }
           dialog.dispose();
           }
       });
       dialog.add(fileChooser);
       dialog.setLocationRelativeTo(this);
       dialog.setVisible(true);
    }//GEN-LAST:event_lblImageMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       try{
           String name=txtName.getText().toString();
           String gender="";
           if(radioMale.isSelected()){
               gender="Male";
}
else if(radioFemale.isSelected()){
    gender="Female";
           }
           String email=txtEmail.getText().toString();
        String emailRegex="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if(!email.matches(emailRegex)){
            JOptionPane.showMessageDialog(null,"Invalid Email","Invalid",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String contact=txtContact.getText().toString();
        String contactRegex="^\\d{5}$";
        if(!contact.matches(contactRegex)){
            JOptionPane.showMessageDialog(null,"Invalid contact number","Invalid",JOptionPane.ERROR_MESSAGE );
            return;
        }
        String address=txtAddress.getText().toString();
        String state=txtState.getText().toString();
        String country=txtCountry.getText().toString();
        
        if(name.isEmpty() || email.isEmpty() || contact.isEmpty() || address.isEmpty() || state.isEmpty() || country.isEmpty() || gender.isEmpty()){
            JOptionPane.showMessageDialog(null,"one or more fields are empty.","Fields Empty",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Connection connection=ConnectionProvider.getCon();
        try{
            Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery("select * from userdetails where email='"+email+"'");
            if(!rs.next()){
                JOptionPane.showMessageDialog(null,"Email not found","Not Found",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        String imageName=saveImage(email);
        String updateQuery;
        if(imageName!=null){
            updateQuery="UPDATE userdetails SET name=?,gender=?,contact=?,address=?,state=?,country=?,imagename=? where uniqueregid=?";
}else{
            updateQuery="UPDATE userdetails SET name=?,gender=?,contact=?,address=?,state=?,country=? where uniqueregid=?";
        }
        PreparedStatement preparedStatement =connection.prepareStatement(updateQuery);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,gender);
        preparedStatement.setString(3,contact);
        preparedStatement.setString(4,address);
        preparedStatement.setString(5,state);
        preparedStatement.setString(6,country);
        if(imageName!=null){
        preparedStatement.setString(7,imageName);
        preparedStatement.setString(8,uniqueReg);
}else{
        preparedStatement.setString(7,uniqueReg);
        }
        preparedStatement.executeUpdate();
        JOptionPane.showMessageDialog(null,"User updated successfully.","Confirmation",JOptionPane.INFORMATION_MESSAGE);
        clearForm();
       }catch(Exception ex){
           ex.printStackTrace();
       }
    }//GEN-LAST:event_btnUpdateActionPerformed
     
    private String saveImage(String email){
        if(originalImage!=null&& selectedFile!=null){
            try{
                String savePath=BDutility.getPath("images\\");
                String extension=BDutility.getFileExtension(selectedFile.getName());
                String imageName=email+"."+extension;
                File saveFile=new File(savePath+imageName);
                BufferedImage scaledImage=BDutility.scaleImage(originalImage,ImageIO.read(selectedFile));
                ImageIO.write(scaledImage,extension,saveFile);
                return imageName;
            }catch(Exception ex){
                ex.printStackTrace();
                
            }
    }
    return null;
        }
        
    
    
    
    
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
         this.dispose();
         
    }//GEN-LAST:event_btnExitActionPerformed
    private void clearForm(){
        txtName.setText("");
        txtEmail.setText("");
        txtContact.setText("");
        txtAddress.setText("");
        txtState.setText("");
        txtCountry.setText("");
        radioMale.setSelected(false);
        radioFemale.setSelected(false); 
        lblImage.setIcon(null);
    }
    
    
    
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String email=txtEmail.getText().toString();
        String emailRegex="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if(!email.matches(emailRegex)){
            JOptionPane.showMessageDialog(null,"Invalid Email","Invalid",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from userdetails where email='"+email+"'");
            if(rs.next()){
                txtName.setText(rs.getString("name"));
                if(rs.getString("gender").equalsIgnoreCase("Male")){
                    radioMale.setSelected(true);
                    radioFemale.setSelected(false);
}else{
                    radioFemale.setSelected(true);
                    radioMale.setSelected(true);
                }
                txtContact.setText(rs.getString("contact"));
                txtAddress.setText(rs.getString("address"));
                txtState.setText(rs.getString("state"));
                txtCountry.setText(rs.getString("country"));
                uniqueReg=rs.getString("uniqueregid");
                String imageNameDB=rs.getString("imagename");
                existingImageName=Objects.isNull(imageNameDB)|| imageNameDB.isEmpty()?null:imageNameDB;
                if(!Objects.isNull(existingImageName)){
                    System.out.println("images"+File.separator+existingImageName);
                   String imagePath=BDutility.getPath("images"+File.separator+existingImageName);
                   File imageFile=new File(imagePath);
                   if(imageFile.exists()){
                       ImageIcon icon = new ImageIcon(imagePath);
                       Image image=icon.getImage().getScaledInstance(322,286,Image.SCALE_SMOOTH);
                       ImageIcon resizedIcon=new ImageIcon(image);
                       lblImage.setIcon(resizedIcon);
                   }
                   else{
                       lblImage.setIcon(null);
                   }
                }else{
                    lblImage.setIcon(null);
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"Email not found","not found",JOptionPane.WARNING_MESSAGE);
            }
}catch(Exception ex){
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null,ex);
    
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
