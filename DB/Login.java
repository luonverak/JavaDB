package DB;

import com.mysql.jdbc.Connection;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    String sql;
    public Login() {
        initComponents();
    }
    Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_3_5","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
            //JOptionPane.showMessageDialog(this, e);
        }
        return con;
    
    }
    public static String getMd5(String input)
    {
        try {
 
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
 
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
 
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
 
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        materialButton1 = new necesario.MaterialButton();
        btnCancel = new com.k33ptoo.components.KButton();
        btnLogin = new com.k33ptoo.components.KButton();
        password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1001, 674));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 300, 190, 40);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 21)); // NOI18N
        jLabel2.setText("Welcome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 150, 100, 40);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Login your account");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 180, 190, 40);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Username or Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 220, 190, 40);

        username.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        getContentPane().add(username);
        username.setBounds(140, 250, 300, 40);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/macbook/NetBeansProjects/JAVA_FORM/src/images/user1.png")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 50, 150, 130);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setText("Have not account yet?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 520, 190, 60);

        materialButton1.setText("SIGN UP");
        materialButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        materialButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(materialButton1);
        materialButton1.setBounds(230, 570, 140, 40);

        btnCancel.setText("Cancel");
        btnCancel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        getContentPane().add(btnCancel);
        btnCancel.setBounds(320, 410, 130, 45);

        btnLogin.setText("Login");
        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(140, 410, 130, 45);

        password.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(140, 330, 300, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/macbook/NetBeansProjects/JAVA_FORM/src/images/create_acc1.png")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1000, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        
    }//GEN-LAST:event_passwordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            
            String email=this.username.getText();
            String password = this.password.getText();
            String pass = getMd5(password);
            
            sql = "SELECT id FROM `user` WHERE (username=? OR email=?) AND password = ?";
            ps=connection().prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, email);
            ps.setString(3, pass);
            r=ps.executeQuery();
            
            if(r.next()){
                JOptionPane.showMessageDialog(this, "Success");
                int id = r.getInt(1);
                Employee employee= new Employee(id);
                employee.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton1ActionPerformed
        Account.main(null);
        dispose();
    }//GEN-LAST:event_materialButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnCancel;
    private com.k33ptoo.components.KButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private necesario.MaterialButton materialButton1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
