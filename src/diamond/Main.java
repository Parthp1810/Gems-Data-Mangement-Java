package diamond;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends javax.swing.JFrame {

    public static int j=1;
    
    public Main() {
        initComponents();
        
        Timer timer=new Timer();
        TimerTask task=new TimerTask()
        {
            public void run()
            {
                for(int a=1;a<=100;a++)
                {
                    if(a==j)
                    {
                        bar.setValue(a);
                        
                    }
                }
                if(j==101)
                {
                    setVisible(false);
                    Login frm=new Login();
                    frm.setVisible(true);  
                    dispose();
                }
                j++;
            }
        };
        timer.scheduleAtFixedRate(task, 0, 30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Untitled.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel3.setMaximumSize(new java.awt.Dimension(389, 140));
        jLabel3.setPreferredSize(new java.awt.Dimension(389, 143));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 0, 370, 140));

        bar.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 210, 663, 5));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/diamond.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 296, 255));

        jLabel7.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel7.setText("Copyright © 2016");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Version 1.0.1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 310, 40));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 666, 257));

        setSize(new java.awt.Dimension(666, 256));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
