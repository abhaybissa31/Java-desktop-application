/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhayproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author DDE
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
         this.setLocationRelativeTo(null);

         lbl1.setIcon(new ImageIcon("Pictures\\fondo-viaje-en-autobus-en-diseno-plano_23-2147639854.jpg"));
      
         

                 ///////////CODING FOR CREATIONS OF TABLE///////////
         
         
         Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
         try {
            Class.forName("java.sql.Driver");
           
            con = DriverManager.getConnection("jdbc:mysql://localhost","root", "olopcs");
             stmt = con.createStatement();
              String query = "create database abhaypro;";
        String quer = "use abhaypro;";
           
            stmt.executeUpdate(query);
            stmt.executeUpdate(quer);
            
            JOptionPane.showMessageDialog(null,"record updated");
        }
        catch(Exception e) {

        }

          Connection con1 = null;
        Statement stmt1 = null;
        ResultSet rs1 = null;
         try {
            Class.forName("java.sql.Driver");
           
            con1 = DriverManager.getConnection("jdbc:mysql://localhost","root", "olopcs");
             stmt1 = con1.createStatement();
            
        String quer = "use abhaypro;";
            String que = "create table flight(Date date, flight_no char(20),Departure_time char(8),Bussiness_class char(3),Economy_class char(4));";
          
         
            stmt.executeUpdate(quer);
            stmt.executeUpdate(que);
           
            JOptionPane.showMessageDialog(null,"record updated");
        }
        catch(Exception e) {

        }
         Connection con2 = null;
        Statement stmt2 = null;
        ResultSet rs2 = null;
         try {
            Class.forName("java.sql.Driver");
           
            con2 = DriverManager.getConnection("jdbc:mysql://localhost","root", "olopcs");
             stmt2 = con2.createStatement();
      
        String quer = "use abhaypro;";
            String que = "create table searchbus(date date, Bus_no char(20),Departure_time char(20), Ac_seats_avability char(10),Sleeper_seats_avialabel char(10),General_seats_avialabel char(10));";
        
          
          
            stmt2.executeUpdate(quer);
            stmt2.executeUpdate(que);
           
            JOptionPane.showMessageDialog(null,"record updated");
        }
        catch(Exception e) {

        }
         Connection con3 = null;
        Statement stmt3 = null;
        ResultSet rs3 = null;
         try {
            Class.forName("java.sql.Driver");
           
            con3 = DriverManager.getConnection("jdbc:mysql://localhost","root", "olopcs");
             stmt3 = con3.createStatement();
      
        String quer = "use abhaypro;";
            String que = "create table searchbus(date date, Bus_no char(20),Departure_time char(20), Ac_seats_avability char(10),Sleeper_seats_avialabel char(10),General_seats_avialabel char(10));";
        
        
          
            stmt3.executeUpdate(quer);
            stmt3.executeUpdate(que);
            
            JOptionPane.showMessageDialog(null,"record updated");
        }
        catch(Exception e) {

        }
         Connection con4 = null;
        Statement stmt4 = null;
        ResultSet rs4 = null;
         try {
            Class.forName("java.sql.Driver");
           
            con4 = DriverManager.getConnection("jdbc:mysql://localhost","root", "olopcs");
             stmt4 = con4.createStatement();
            
        String quer = "use abhaypro;";
            String que = "create table signup(firstname char(20), lastname char(20),username char(40),password char(40),Mobile_no int(10), address char(250));";
          
         
            stmt4.executeUpdate(quer);
            stmt4.executeUpdate(que);
        
            JOptionPane.showMessageDialog(null,"record updated");
        }
        catch(Exception e) {

        }
            Connection con5 = null;
        Statement stmt5 = null;
        ResultSet rs5 = null;
         try {
            Class.forName("java.sql.Driver");
           
            con5 = DriverManager.getConnection("jdbc:mysql://localhost","root", "olopcs");
             stmt5 = con5.createStatement();
            
        String quer = "use abhaypro;";
            String que = "create table bookpassenger(type varchar(20),tickettype varchar(20),no_of_persons int(30),price int(10), username varchar(30));";
           
         
            stmt.executeUpdate(quer);
            stmt.executeUpdate(que);
           
            JOptionPane.showMessageDialog(null,"record updated");
        }
        catch(Exception e) {

        }
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
        lblwlcm = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        lblwlcm.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblwlcm.setForeground(new java.awt.Color(255, 255, 255));
        lblwlcm.setText("Hey there! Welcome to Flash tour and travelles");
        lblwlcm.setToolTipText("");
        lblwlcm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblwlcm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblwlcmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblwlcmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblwlcmMouseExited(evt);
            }
        });
        jPanel1.add(lblwlcm);
        lblwlcm.setBounds(150, 0, 330, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 30, 50, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 30, 60, 30);

        lbl1.setText(" ");
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl1MouseExited(evt);
            }
        });
        jPanel1.add(lbl1);
        lbl1.setBounds(0, 0, 630, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblwlcmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblwlcmMouseClicked
        // TODO add your handling code here
        JOptionPane.showMessageDialog(null, "hello", "Welcome fellas!",JOptionPane.INFORMATION_MESSAGE);
         new Loginpage1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblwlcmMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void lblwlcmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblwlcmMouseEntered
        // TODO add your handling code here:
        lblwlcm.setText("<html><u>Hey there! Welcome to Flash tour and travelles</u></html>");
    }//GEN-LAST:event_lblwlcmMouseEntered

    private void lblwlcmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblwlcmMouseExited
        // TODO add your handling code here:
        lblwlcm.setText("Hey there! Welcome to Flash tour and travelles");
    }//GEN-LAST:event_lblwlcmMouseExited

    private void lbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_lbl1MouseEntered

    private void lbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl1MouseExited

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        // TODO add your handling code here:
        new Loginpage1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl1MouseClicked

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblwlcm;
    // End of variables declaration//GEN-END:variables
}
