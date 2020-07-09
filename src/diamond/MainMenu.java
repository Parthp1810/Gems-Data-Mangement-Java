package diamond;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {
    
    public static int i=0;
    public static int n=0;
    public static String UN="";
    public static String time_l="";
    public static String Username="";    
    
    Timer t=new Timer();
    
    public MainMenu() {
        initComponents();
        
        menu.setLocation(0,0);        
    /** Date **/
        Date now = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );
        String date1=formatter.format(now);
        Date.setText(date1); 
    /** Time **/
        TimerTask time=new TimerTask()
        {
           public void run()
           {
                if(i==-5)
                {
                   Time.setText("");
                }
                else
                {
                    Date dNow = new Date( );
                    SimpleDateFormat ft=new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); 
                    String a=ft.format(dNow);
                    String d3="";
                    String sec=""+a.charAt(25);
                    for(int i=18;i<=25;i++)
                    {
                       d3=d3+a.charAt(i);
                    }
                    Time.setText(""+d3);
                }        
                i++;
            }
        };
        t.scheduleAtFixedRate(time, 0, 1*1000);
    /** Am/Pm **/
        Date ab = new Date( );
        SimpleDateFormat ft=new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); 
        String a=ft.format(ab);
        String day=""+a.charAt(27)+""+a.charAt(28);
        AP.setText(day);
/** Day **/
        String day1=""+a.charAt(0)+""+a.charAt(1)+""+a.charAt(2);
        Day.setText(day1);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AP = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Day = new javax.swing.JLabel();
        rgfts = new javax.swing.JLabel();
        loginpanel = new javax.swing.JLabel();
        loginname = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("                                                                                                                                             Atmiya Diamond Manufacturing");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("AR DESTINE", 1, 57)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Atmiya Diamond Manufacturing");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 990, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/dddd.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 660));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AP.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jPanel1.add(AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 12, 40, 20));

        Time.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jPanel1.add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 12, 70, 20));

        Date.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 12, 110, 20));

        Day.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jPanel1.add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 12, 50, 20));

        rgfts.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        rgfts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(rgfts, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 7, 300, 25));

        loginpanel.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        loginpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(loginpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 21));

        loginname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginname.setText("Logged Username :-");
        jPanel1.add(loginname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 25));

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1278, 40));

        menu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenu1.setText("DIAMOND");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setText("ROUGH");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem7.setText("POLISH REPORT");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem8.setText("ROUGH DIAMOND REMOVER");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem9.setText("DIAMOND IMAGE");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        menu.add(jMenu1);

        jMenu2.setText("Users");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setText("Registration");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem6.setText("Login Details");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        menu.add(jMenu2);

        jMenu10.setText("Search");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem11.setText("ROUGH DIAMOND");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem11);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem22.setText("POLISH REPORT");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem22);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem23.setText("DIAMOND IMAGE");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem23);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem14.setText("USERS");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem14);

        menu.add(jMenu10);

        jMenu11.setText("Get Data");
        jMenu11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem13.setText("ROUGH DIAMOND");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem13);

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem24.setText("POLISH REPORT");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem24);

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem25.setText("DIAMOND IMAGE");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem25);

        menu.add(jMenu11);

        jMenu16.setText("Login Detail");
        jMenu16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem35.setText("Super Login Detail");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem35);

        menu.add(jMenu16);

        jMenu15.setText("Tools");
        jMenu15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem33.setText("Calculator");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem33);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem34.setText("Notepad");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem34);

        menu.add(jMenu15);

        jMenu5.setText("Help");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem12.setText("About");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem15.setText("Contact");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        menu.add(jMenu5);

        setJMenuBar(menu);

        setSize(new java.awt.Dimension(1295, 763));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ROUGHDIAMOND frm= new ROUGHDIAMOND();
        frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        POLISHREPORT frm = new POLISHREPORT();
        frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Search_ROUGHDIAMOND frm= new Search_ROUGHDIAMOND();
        frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        Search_POLISHREPORT frm= new Search_POLISHREPORT();
        frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        Runtime rt=Runtime.getRuntime();
        try 
        {
            rt.exec("C:/Windows/System32/calc.exe");
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        Runtime rt=Runtime.getRuntime();
        try 
        {
            rt.exec("C:/Windows/System32/notepad.exe");
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        About frm= new About();
        frm.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Contact frm = new Contact();
        frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       try {
            int P = JOptionPane.showConfirmDialog(this, " Are you sure want to Log Out ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            while (P == 0) {
                Connection con=Connect.ConnectDB();
                Statement stmt = con.createStatement();
                String sql = "Select * from super_login_detail";
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                String s1 = rs.getString("UserName");
                String s2 = rs.getString("Date_login");
                String s3 = rs.getString("Login_time"); 
                String time=Time.getText()+""+AP.getText();
                String sql1 = "Update super_login_detail set UserName='"+(s1)+"', Date_login ='"+(s2)+"',Login_time = '"+(s3)+"', Logout_time = '"+(time)+"' where Username='"+Username+"' and Login_time = '"+(time_l)+"'";
                int rowsEffected = stmt.executeUpdate(sql1); 
                con.close();
                rs.close();
                stmt.close();
                }                
            }
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            String logout="";
                    String time=Time.getText()+""+AP.getText();
                    Username=username.getText();
                    String date=Date.getText();
                    time_l=time;
        try{
            Connection con=Connect.ConnectDB();
            Statement stmt = con.createStatement();
            String sql1 = "Select * from super_login_detail";
            ResultSet rs = stmt.executeQuery(sql1);
            String sql = "insert into super_login_detail(UserName,Date_login,Login_time,Logout_time)values('" + Username + "','" + date + "','" + time + "','"+logout+"')";
            int rowsEffected = stmt.executeUpdate(sql);          
            con.close();
            stmt.close();
            rs.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }          
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ROUGHDIAMONDREMOVER frm= new ROUGHDIAMONDREMOVER();
        frm.setVisible(true);   
       
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        DiamondImage frm= new DiamondImage();
        frm.setVisible(true); 
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        Search_DiamondImage frm= new Search_DiamondImage();
        frm.setVisible(true); 
       
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        ROUGHDIAMOND_Record1  frm= new ROUGHDIAMOND_Record1();
        frm.setVisible(true);   
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        POLISHREPORT_Record1 frm= new POLISHREPORT_Record1();
        frm.setVisible(true);   
        
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        Super_Login_Details frm= new Super_Login_Details();
        frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        UsersRegistration frm = new UsersRegistration();
        frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        LoginDetails frm = new LoginDetails();
        frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        Search_Users frm= new Search_Users();
        frm.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
       DIAMONDImage_Record1 frm= new DIAMONDImage_Record1();
        frm.setVisible(true);   
        
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AP;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Day;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginname;
    private javax.swing.JLabel loginpanel;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel rgfts;
    public static javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
