package schooljmcp2;



import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StaffManagement.java
 *
 * Created on Dec 21, 2015, 10:31:41 PM
 */

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import javax.swing.JOptionPane;
public class StaffManagement extends javax.swing.JFrame {
 Connection con;
    Statement smt,smt1;
    ResultSet rs,rs1,rs2;
    String sid,spass,sfname,slname,sdesig,sadd,snum;
    /** Creates new form StaffManagement */
    public StaffManagement() {
        initComponents();
        jButton2.setVisible(false);
        jButton1.setVisible(false);
         try
        {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","hanu");
            String query = "SELECT * FROM login ORDER BY userid;";
            smt=con.createStatement();
            rs=smt.executeQuery(query);
            rs.next();
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 100, 90, 21);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 100, 90, 21);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(539, 132, 91, 21);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(385, 299, 72, 21);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Enter User ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(18, 33, 71, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Enter Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(18, 58, 81, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Re Enter Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(18, 83, 98, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Enter First Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(18, 137, 87, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Enter Last Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(18, 165, 87, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Enter Contact No.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(18, 191, 93, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Enter Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(18, 214, 73, 15);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("First <<");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(539, 32, 91, 21);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("Previous <");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(636, 32, 87, 21);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setText("Next >");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(539, 69, 91, 21);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("Last >>");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(636, 69, 91, 21);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(139, 31, 194, 21);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(139, 56, 194, 21);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(139, 81, 194, 21);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(139, 106, 194, 21);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(139, 135, 194, 21);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(139, 163, 194, 21);

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(139, 214, 194, 98);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Enter Designation");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(18, 108, 93, 15);

        jTextField7.setEditable(false);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(139, 188, 194, 22);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(525, 214, 135, 22);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(525, 240, 135, 22);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(525, 266, 135, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Search Specific Staff by his/ her");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(373, 192, 184, 14);

        jLabel11.setText("User ID");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(373, 216, 110, 16);

        jLabel12.setText("First Name");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(373, 242, 120, 16);

        jLabel13.setText("Last Name");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(373, 268, 120, 16);

        jButton10.setText("New");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(539, 100, 91, 22);

        jButton11.setText("Edit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(636, 100, 91, 22);

        jButton12.setText("Back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(597, 298, 72, 22);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooljmcp2/Staff-1.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(360, 40, 150, 140);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooljmcp2/Untitled.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(0, -150, 750, 510);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooljmcp2/logo_maglietta_STAFF-Gioco_libera_tutti.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooljmcp2/Untitled.png"))); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooljmcp2/Untitled.png"))); // NOI18N
        jLabel18.setText("jLabel15");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(506, 506, 506)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public final void displayRecord(){
        try
        {
            jTextField1.setText(rs.getString(1));
            jTextField2.setText(rs.getString(2));
            jTextField4.setText(rs.getString(3));
            jTextField5.setText(rs.getString(4));
            jTextField6.setText(rs.getString(5));
            jTextField7.setText(rs.getString(7));
            jTextArea1.setText(rs.getString(6));
        }
        catch(Exception ec)
        {}
    }
    //ENABLE TEXT FIELDS AND AREA
    public void enableTextF(){
        jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);
        jTextField6.setEditable(true);
        jTextField7.setEditable(true);
        jTextArea1.setEditable(true);
    }
    //DISABLE TEXT FIELDS AND AREA
    public void disableTextF(){
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextArea1.setEditable(false);
    }
    //CLEAR TEXT FIELDS AND AREA
    public void clearTextF(){
        try
        {
            jTextField1.setText(null);
            jTextField2.setText(null);
            jTextField3.setText(null);
            jTextField4.setText(null);
            jTextField5.setText(null);
            jTextField6.setText(null);
            jTextField7.setText(null);
            jTextArea1.setText(null);
        }
        catch(Exception ec)
        {}
    }
    //GET THE VALUES FROM TEXT FIELDS AND AREA
    public void fetchFromTextF(){
        sid=jTextField1.getText();
        spass=jTextField2.getText();
       
        sdesig=jTextField4.getText();
        sfname=jTextField5.getText();
        slname=jTextField6.getText();
        snum=jTextField7.getText();
        sadd=jTextArea1.getText();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       try{
           fetchFromTextF();
           String insertquery="insert into login (userid,password,Staffdesig,StaffFName,StaffLName,StaffAdd,StaffContactNo) values('"+sid+"','"+spass+"','"+sdesig+"','"+sfname+"','"+slname+"','"+sadd+"','"+snum+"');";
                            smt=con.createStatement();
                            int success=smt.executeUpdate(insertquery);
                            if(success>0) {
                                JOptionPane.showMessageDialog(this, "Record Saved");
                                
                            } else {
                                JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
                            }
                             jButton1.setVisible(false);
                        jButton10.setVisible(true);
                        clearTextF();
       }
       catch(Exception e){
           System.out.print("sfvh");
       }
           
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        enableTextF();
        jTextField1.setEnabled(false);
       try{
          fetchFromTextF();
                int code=JOptionPane.showConfirmDialog(this,"Information of " + sfname + " will change in database.","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if(code==JOptionPane.YES_OPTION) {
                    String updatequery="update login set userid = '"+sid+"',password='"+spass+"',Staffdesig='"+sdesig+"',StaffFName='"+sfname+"',StaffLName='"+slname+"',StaffAdd='"+sadd+"',StaffContactNo='"+snum+"' where userid like '"+sid+"';";
                    smt=con.createStatement();
                    int success=smt.executeUpdate(updatequery);
                    if(success>0) {
                        JOptionPane.showMessageDialog(this, "Record Modified");
                       
                    } else {
                        JOptionPane.showMessageDialog(this, "Problem in mofifying. Retry");
                         
                    }
       }clearTextF();
       jButton2.setVisible(false);
   jButton11.setVisible(true);
   disableTextF();
      
       }
       catch(Exception e){

       }
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            fetchFromTextF();
                int code=JOptionPane.showConfirmDialog(this,"Information of " + sfname + " will be deleted from database.","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if(code==JOptionPane.YES_OPTION) {
                    String updatequery="DELETE from login where userid like '"+sid+"';";
                    smt=con.createStatement();
                    int success=smt.executeUpdate(updatequery);
                    if(success>0) {
                        JOptionPane.showMessageDialog(this, "Record Deleted");

                    } else {
                        JOptionPane.showMessageDialog(this, "Problem in deletion. Retry");
                    }
        }clearTextF();

        }
        catch(Exception e){
            System.out.print("sfvh");
        }
       
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        disableTextF();
        String seaID=jTextField8.getText();
        String seaFN=jTextField9.getText();
        String seaLN=jTextField10.getText();
        if(seaID.equals("")&&seaFN.equals("")&&seaLN.equals("")) {
            JOptionPane.showMessageDialog(this, "Select at least 1 option for search");
        } else {
            if((!seaID.equals("")) && (!seaFN.equals("")) && (!seaLN.equals(""))) {
                try{
                    String query = "SELECT * FROM login where userid LIKE '"+seaID+"' AND StaffFName LIKE '"+seaFN+"' AND StaffLName LIKE '"+seaLN+"';";
                    smt=con.createStatement();
                    rs=smt.executeQuery(query);
                    rs.next();
                    displayRecord();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            } else if((!seaID.equals("")) && (!seaFN.equals("")) && seaLN.equals("")) {
                try{
                    String query = "SELECT * FROM login where userid LIKE '"+seaID+"' AND StaffFName LIKE '"+seaFN+"';";
                    smt=con.createStatement();
                    rs=smt.executeQuery(query);
                    rs.next();
                    displayRecord();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            } else if((!seaID.equals("")) && seaFN.equals("") && (!seaLN.equals(""))) {
                try{
                    String query = "SELECT * FROM login where userid LIKE '"+seaID+"' AND StaffLName LIKE '"+seaLN+"';";
                    smt=con.createStatement();
                    rs=smt.executeQuery(query);
                    rs.next();
                    displayRecord();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            } else if(seaID.equals("") && (!seaFN.equals("")) && (!seaLN.equals(""))) {
                try{
                    String query = "SELECT * FROM login where StaffFName LIKE '"+seaFN+"' AND StaffLName LIKE '"+seaLN+"';";
                    smt=con.createStatement();
                    rs=smt.executeQuery(query);
                    rs.next();
                    displayRecord();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            } else if((!seaID.equals("")) && seaFN.equals("") && seaLN.equals("")) {
                try{
                    String query = "SELECT * FROM login where userid LIKE '"+seaID+"';";
                    smt=con.createStatement();
                    rs=smt.executeQuery(query);
                    rs.next();
                    displayRecord();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            } else if(seaID.equals("") && (!seaFN.equals("")) && seaLN.equals("")) {
                try{
                    String query = "SELECT * FROM login where StaffFName LIKE '"+seaFN+"';";
                    smt=con.createStatement();
                    rs=smt.executeQuery(query);
                    rs.next();
                    displayRecord();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            } else if(seaID.equals("") && seaFN.equals("") && (!seaLN.equals(""))) {
                try{
                    String query = "SELECT * FROM login where StaffLName LIKE '"+seaLN+"';";
                    smt=con.createStatement();
                    rs=smt.executeQuery(query);
                    rs.next();
                    displayRecord();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            rs.first();
            if(rs.isFirst())
                rs.first();
            displayRecord();
        } catch(Exception ex) {}
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            rs.previous();
            if(rs.isFirst())
                rs.first();
            displayRecord();
        } catch(Exception ex) {}
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            rs.next();
            if(rs.isLast())
                rs.last();
            displayRecord();
        } catch(Exception ex) {}
}//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            rs.last();
            if(rs.isLast())
                rs.last();
            displayRecord();
        } catch(Exception ex) {}
}//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
jButton1.setVisible(true);
jButton10.setVisible(false);

        enableTextF();
clearTextF();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
   jButton2.setVisible(true);
   jButton11.setVisible(false);
        jTextField1.setEnabled(false);
        enableTextF();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        new Navigationframe().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
}//GEN-LAST:event_jButton12ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
