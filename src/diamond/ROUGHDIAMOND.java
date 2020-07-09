package diamond;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class ROUGHDIAMOND extends javax.swing.JFrame {

    public static int i=0;
    public static int n=0;
    public static String time_l="";
    Timer t=new Timer();
    
    public ROUGHDIAMOND() {
        initComponents();
    
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

private void Reset()
{
    
    DATE.setText("");
    NAME.setText("");
    RW.setText("");
    PW.setText("");
    KAPAN.setText("");
    PACKET.setText("");
    SUBPACKET.setText("");
    COLOUR.setSelectedIndex(-1);
    CLEARITY.setSelectedIndex(-1);
    SHAPE.setSelectedIndex(-1);
    FLURESCENCE.setSelectedIndex(-1);
    CUT.setSelectedIndex(-1);
    SYMMETRY.setSelectedIndex(-1);
    POLISH.setSelectedIndex(-1);
    DOLLAR.setText("");
    AVG.setText("");
    ADD.setEnabled(true);
    Upd.setEnabled(false);
    Del.setEnabled(false);    
    DATE.requestDefaultFocus();

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        GetData = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AP = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Day = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        KAPAN = new javax.swing.JTextField();
        DATE = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        PACKET = new javax.swing.JTextField();
        RW = new javax.swing.JTextField();
        PW = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        SUBPACKET = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        DOLLAR = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        AVG = new javax.swing.JTextField();
        COLOUR = new javax.swing.JComboBox();
        CLEARITY = new javax.swing.JComboBox();
        SHAPE = new javax.swing.JComboBox();
        FLURESCENCE = new javax.swing.JComboBox();
        CUT = new javax.swing.JComboBox();
        SYMMETRY = new javax.swing.JComboBox();
        POLISH = new javax.swing.JComboBox();
        Upd = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        New = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("                                                                                                                                             Atmiya Diamond Manufacturing");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Back.png"))); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 670, 130, 50));

        GetData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GetData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/GetData.png"))); // NOI18N
        GetData.setText("Get Data");
        GetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDataActionPerformed(evt);
            }
        });
        jPanel2.add(GetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 180, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 52)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ROUGH DIAMOND");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 1140, -1));

        AP.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        AP.setForeground(new java.awt.Color(255, 153, 153));
        jPanel3.add(AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 50, 40));

        Time.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 153, 153));
        jPanel3.add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 120, 40));

        Day.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        Day.setForeground(new java.awt.Color(255, 153, 153));
        jPanel3.add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 60, 40));

        Date.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 153, 153));
        jPanel3.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 15, 150, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 1160, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("NAME");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setText("KAPAN NO.");

        NAME.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NAME.setForeground(new java.awt.Color(51, 153, 0));
        NAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NAMEKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 255));
        jLabel7.setText("PACKET NO.");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 255));
        jLabel8.setText("ROUGH  WEIGHT");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 255));
        jLabel9.setText("POLISH WEIGHT");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 255));
        jLabel10.setText("COLOUR");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 255));
        jLabel11.setText("CLEARITY");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 255));
        jLabel12.setText("SHAPE");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 255));
        jLabel14.setText("FLURESCENCE ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 255));
        jLabel15.setText("CUT GRADE");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 255));
        jLabel16.setText("SYMMETRY");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 255));
        jLabel17.setText("POLISH");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 255));
        jLabel18.setText("DATE");

        KAPAN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KAPAN.setForeground(new java.awt.Color(51, 153, 0));
        KAPAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KAPANKeyTyped(evt);
            }
        });

        DATE.setForeground(new java.awt.Color(51, 153, 0));
        DATE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        DATE.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DATE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DATEKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 255));
        jLabel24.setText("(DD/MM/YYYY)");

        PACKET.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PACKET.setForeground(new java.awt.Color(51, 153, 0));
        PACKET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PACKETKeyTyped(evt);
            }
        });

        RW.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RW.setForeground(new java.awt.Color(51, 153, 0));
        RW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RWKeyTyped(evt);
            }
        });

        PW.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PW.setForeground(new java.awt.Color(51, 153, 0));
        PW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PWKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setText("SUB PACKET ");

        SUBPACKET.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SUBPACKET.setForeground(new java.awt.Color(51, 153, 0));
        SUBPACKET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SUBPACKETKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 255));
        jLabel19.setText("DOLLAR");

        DOLLAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DOLLAR.setForeground(new java.awt.Color(51, 153, 0));
        DOLLAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DOLLARKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 255));
        jLabel20.setText("AVREAGE DOLLAR");

        AVG.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AVG.setForeground(new java.awt.Color(51, 153, 0));
        AVG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AVGKeyTyped(evt);
            }
        });

        COLOUR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        COLOUR.setForeground(new java.awt.Color(51, 153, 0));
        COLOUR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O" }));
        COLOUR.setSelectedIndex(-1);

        CLEARITY.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CLEARITY.setForeground(new java.awt.Color(51, 153, 0));
        CLEARITY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IF", "VVS1", "VVS2", "VS1", "VS2", "SI1", "SI2", "I1", "I2", "I3", "I4", "I5" }));
        CLEARITY.setSelectedIndex(-1);

        SHAPE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SHAPE.setForeground(new java.awt.Color(51, 153, 0));
        SHAPE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ROUND", "OVAL", "PRINCESS", "MARQUISE", "PEAR", "EMERALD", "CUSHION" }));
        SHAPE.setSelectedIndex(-1);

        FLURESCENCE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FLURESCENCE.setForeground(new java.awt.Color(51, 153, 0));
        FLURESCENCE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NONE", "FANT", "ST", "MD", "VST" }));
        FLURESCENCE.setSelectedIndex(-1);

        CUT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CUT.setForeground(new java.awt.Color(51, 153, 0));
        CUT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EX", "VG", "GD" }));
        CUT.setSelectedIndex(-1);

        SYMMETRY.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SYMMETRY.setForeground(new java.awt.Color(51, 153, 0));
        SYMMETRY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EX", "VG", "GD" }));
        SYMMETRY.setSelectedIndex(-1);

        POLISH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        POLISH.setForeground(new java.awt.Color(51, 153, 0));
        POLISH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EX", "VG", "GD" }));
        POLISH.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15))
                                    .addGap(17, 17, 17)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(KAPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PACKET, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SUBPACKET, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(RW, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PW, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AVG, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DOLLAR, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(POLISH, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SYMMETRY, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CUT, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FLURESCENCE, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SHAPE, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CLEARITY, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(COLOUR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel13))
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KAPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(PACKET, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(SUBPACKET, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RW, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PW, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(COLOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CLEARITY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SHAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FLURESCENCE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addComponent(CUT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SYMMETRY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(POLISH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DOLLAR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AVG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 1160, 480));

        Upd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Upd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Refresh.png"))); // NOI18N
        Upd.setText("Update");
        Upd.setEnabled(false);
        Upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdActionPerformed(evt);
            }
        });
        jPanel2.add(Upd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 670, 160, 50));

        Del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Delete.png"))); // NOI18N
        Del.setText("Delete");
        Del.setEnabled(false);
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });
        jPanel2.add(Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, 160, 50));

        ADD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Save.png"))); // NOI18N
        ADD.setText("Save");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, 160, 50));

        New.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/New.png"))); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jPanel2.add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 160, 50));

        Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Search.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 670, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/background.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 660));

        jLabel2.setBackground(new java.awt.Color(211, 219, 238));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 660, 1400, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1363, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1295, 763));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public static String kapan;
public static String packet;
public static String subpacket;
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataActionPerformed
        ROUGHDIAMOND_Record frm = new ROUGHDIAMOND_Record();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GetDataActionPerformed

    private void NAMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NAMEKeyTyped
        String s = NAME.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_NAMEKeyTyped

    private void KAPANKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KAPANKeyTyped
        String s = KAPAN.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_KAPANKeyTyped

    private void DATEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DATEKeyTyped
        String s = DATE.getText();
        if (s.length() == 10) 
        {
            getToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_DATEKeyTyped

    private void PACKETKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PACKETKeyTyped
        String s = PACKET.getText();
        if (s.length() == 4) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_PACKETKeyTyped

    private void RWKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RWKeyTyped
        String s = RW.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_RWKeyTyped

    private void PWKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PWKeyTyped
       String s = PW.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_PWKeyTyped

    private void UpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdActionPerformed
        try 
        {
            if (DATE.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter DATE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (NAME.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter NAME", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (KAPAN.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter KAPAN NO.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            /*if (PACKET.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter PACKET NO.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (SUBPACKET.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter SUB PACKET", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            */
            if (RW.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter ROUGH WEIGHT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (PW.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter POLISH WEIGHT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (COLOUR.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select COLOUR", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (CLEARITY.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select CLEARITY", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (SHAPE.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select SHAPE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (FLURESCENCE.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select FLURESCENCE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (CUT.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select CUT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (SYMMETRY.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select SYMMETRY", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (POLISH.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select POLISH", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (DOLLAR.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter DOLLAR", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (AVG.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter AVREAGE DOLLAR", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Connection con=Connect.ConnectDB();
            if(packet.equals("") && subpacket.equals("")&& kapan!=null)
            {
                if (PACKET.getText().isEmpty()!=true || SUBPACKET.getText().isEmpty()!=true) 
                {
                    JOptionPane.showMessageDialog(this, "Main Diamond can not have PACKET NO. and SUBPACKET ", "Error", JOptionPane.ERROR_MESSAGE);
                    PACKET.setText(packet);
                    SUBPACKET.setText(subpacket);
                    return;
                }
                String sql = "update ROUGHDIAMOND set date='" + DATE.getText() + "',NAME='" + NAME.getText() + "',kapan='" + KAPAN.getText() + "',PACKET='" + PACKET.getText() + "',SUBPACKET='" + SUBPACKET.getText() + "',ROUGHW=" + RW.getText() + ",POLISHW=" + PW.getText() + ",COLOUR='" + COLOUR.getSelectedItem() + "',CLEARITY='" + CLEARITY.getSelectedItem() + "',SHAPE='" + SHAPE.getSelectedItem() + "',FLURESCENCE='" + FLURESCENCE.getSelectedItem() + "',CUT='" + CUT.getSelectedItem() + "',SYMMETRY='" + SYMMETRY.getSelectedItem() + "',POLISH='" + POLISH.getSelectedItem() + "',DOLLAR=" + DOLLAR.getText() + ",AVREAGE=" + AVG.getText() + " where KAPAN='" + kapan + "' AND PACKET='" + packet + "' AND SUBPACKET='" + subpacket + "'";
                Statement st = con.createStatement();
                int rowsEffected = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Updated", "ROUGH DIAMOND RECORD", JOptionPane.INFORMATION_MESSAGE);
                Reset();
                con.close();
            }
            else if(packet!=null && subpacket.equals("") && kapan!=null)
            {
                if (SUBPACKET.getText().isEmpty()!=true) 
                {
                    JOptionPane.showMessageDialog(this, "Main Diamond->PACKET can not have  SUBPACKET ", "Error", JOptionPane.ERROR_MESSAGE);
                    SUBPACKET.setText(subpacket);
                    return;
                }
                String sql = "update ROUGHDIAMOND set date='" + DATE.getText() + "',NAME='" + NAME.getText() + "',kapan='" + KAPAN.getText() + "',PACKET='" + PACKET.getText() + "',SUBPACKET='" + SUBPACKET.getText() + "',ROUGHW=" + RW.getText() + ",POLISHW=" + PW.getText() + ",COLOUR='" + COLOUR.getSelectedItem() + "',CLEARITY='" + CLEARITY.getSelectedItem() + "',SHAPE='" + SHAPE.getSelectedItem() + "',FLURESCENCE='" + FLURESCENCE.getSelectedItem() + "',CUT='" + CUT.getSelectedItem() + "',SYMMETRY='" + SYMMETRY.getSelectedItem() + "',POLISH='" + POLISH.getSelectedItem() + "',DOLLAR=" + DOLLAR.getText() + ",AVREAGE=" + AVG.getText() + " where KAPAN='" + kapan + "' AND PACKET='" + packet + "' AND SUBPACKET='" + subpacket + "'";
                Statement st = con.createStatement();
                int rowsEffected = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Updated", "ROUGH DIAMOND RECORD", JOptionPane.INFORMATION_MESSAGE);
                Reset();
                con.close();
            }
            else if(packet!=null && subpacket!=null && kapan!=null)
            {
                if (PACKET.getText().equals("") ||SUBPACKET.getText().equals("")) 
                {
                    JOptionPane.showMessageDialog(this, "Please Enter PACKET NO. and SUB PACKET", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String sql = "update ROUGHDIAMOND set date='" + DATE.getText() + "',NAME='" + NAME.getText() + "',kapan='" + KAPAN.getText() + "',PACKET='" + PACKET.getText() + "',SUBPACKET='" + SUBPACKET.getText() + "',ROUGHW=" + RW.getText() + ",POLISHW=" + PW.getText() + ",COLOUR='" + COLOUR.getSelectedItem() + "',CLEARITY='" + CLEARITY.getSelectedItem() + "',SHAPE='" + SHAPE.getSelectedItem() + "',FLURESCENCE='" + FLURESCENCE.getSelectedItem() + "',CUT='" + CUT.getSelectedItem() + "',SYMMETRY='" + SYMMETRY.getSelectedItem() + "',POLISH='" + POLISH.getSelectedItem() + "',DOLLAR=" + DOLLAR.getText() + ",AVREAGE=" + AVG.getText() + " where KAPAN='" + kapan + "' AND PACKET='" + packet + "' AND SUBPACKET='" + subpacket + "'";
                Statement st = con.createStatement();
                int rowsEffected = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Updated", "ROUGH DIAMOND RECORD", JOptionPane.INFORMATION_MESSAGE);
                Reset();
                con.close();
                st.close();
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_UpdActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        try 
        {
            int P = JOptionPane.showConfirmDialog(this, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (P == 0) 
            {
                Connection con=Connect.ConnectDB();
                Statement stmt = con.createStatement();
                String sql1 = "Select KAPAN,SUBPACKET,PACKET from ROUGHDIAMOND where Kapan = '" + KAPAN.getText() + "' AND SUBPACKET='" + SUBPACKET.getText() + "' and PACKET = '" + PACKET.getText() + "'";
                ResultSet rs = stmt.executeQuery(sql1);
                if (rs.next()) 
                {
                    String sql = "delete from ROUGHDIAMOND where Kapan = '" + KAPAN.getText() + "' AND SUBPACKET='" + SUBPACKET.getText() + "' and PACKET = '" + PACKET.getText() + "'";
                    Statement st = con.createStatement();
                    int rowsEffected = st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Data Successfully Deleted", "ROUGH DIAMOND RECORD", JOptionPane.INFORMATION_MESSAGE);
                    Reset();
                    con.close();
                    st.close();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Data Not Exist", "ROUGH DIAMOND RECORD", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_DelActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        try 
        {
            if (DATE.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter DATE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (NAME.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter NAME", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (KAPAN.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter KAPAN NO.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            /*if (PACKET.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter PACKET NO.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (SUBPACKET.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter SUB PACKET", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            */
            if (RW.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter ROUGH WEIGHT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (PW.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter POLISH WEIGHT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (COLOUR.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select COLOUR", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (CLEARITY.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select CLEARITY", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (SHAPE.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select SHAPE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (FLURESCENCE.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select FLURESCENCE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (CUT.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select CUT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (SYMMETRY.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select SYMMETRY", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (POLISH.getSelectedIndex()==-1) 
            {
                JOptionPane.showMessageDialog(this, "Please Select POLISH", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (DOLLAR.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter DOLLAR", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (AVG.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter AVREAGE DOLLAR", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Connection con=Connect.ConnectDB();
            Statement stmt = con.createStatement();
            String sql1 = "Select PACKET,SUBPACKET from ROUGHDIAMOND where KAPAN='" + KAPAN.getText() + "' AND SUBPACKET='" + SUBPACKET.getText() + "' AND PACKET= '" + PACKET.getText() + "'";
            ResultSet rs = stmt.executeQuery(sql1);
            if (rs.next()) 
            {
                JOptionPane.showMessageDialog(this, "PACKET NO. AND SUB PACKET ALREADY EXISTS", "Error", JOptionPane.ERROR_MESSAGE);
                Reset();
                DATE.requestDefaultFocus();
                return;
            } 
            else 
            {
                String sql = "insert into ROUGHDIAMOND(DATE,NAME,KAPAN,PACKET,SUBPACKET,ROUGHW,POLISHW,COLOUR,CLEARITY,SHAPE,FLURESCENCE,CUT,SYMMETRY,POLISH,DOLLAR,AVREAGE)values('" + DATE.getText() + "','" + NAME.getText() + "','" + KAPAN.getText() + "','" + PACKET.getText() + "','" + SUBPACKET.getText() + "',"+RW.getText()+"," + PW.getText() + ",'" + COLOUR.getSelectedItem() + "','" + CLEARITY.getSelectedItem() + "','" + SHAPE.getSelectedItem() + "','" + FLURESCENCE.getSelectedItem() + "','" + CUT.getSelectedItem() + "','" + SYMMETRY.getSelectedItem() + "','" + POLISH.getSelectedItem() + "'," + DOLLAR.getText() + "," + AVG.getText() + ")";
                int rowsEffected = stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Saved", "ROUGH DIAMOND REOCRD", JOptionPane.INFORMATION_MESSAGE);
                Reset();
            }
            con.close();
            stmt.close();
            rs.close();
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        Reset();
    }//GEN-LAST:event_NewActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        Search_ROUGHDIAMOND frm = new Search_ROUGHDIAMOND();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SearchActionPerformed

    private void SUBPACKETKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SUBPACKETKeyTyped
        String s = SUBPACKET.getText();
        if (s.length() == 10) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_SUBPACKETKeyTyped

    private void DOLLARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DOLLARKeyTyped
       String s = DOLLAR.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_DOLLARKeyTyped

    private void AVGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AVGKeyTyped
       String s = AVG.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_AVGKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ROUGHDIAMOND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ROUGHDIAMOND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ROUGHDIAMOND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ROUGHDIAMOND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ROUGHDIAMOND().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ADD;
    private javax.swing.JLabel AP;
    public javax.swing.JTextField AVG;
    public static javax.swing.JButton Back;
    public javax.swing.JComboBox CLEARITY;
    public javax.swing.JComboBox COLOUR;
    public javax.swing.JComboBox CUT;
    public javax.swing.JFormattedTextField DATE;
    public javax.swing.JTextField DOLLAR;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Day;
    public static javax.swing.JButton Del;
    public javax.swing.JComboBox FLURESCENCE;
    public static javax.swing.JButton GetData;
    public javax.swing.JTextField KAPAN;
    public javax.swing.JTextField NAME;
    public static javax.swing.JButton New;
    public javax.swing.JTextField PACKET;
    public javax.swing.JComboBox POLISH;
    public javax.swing.JTextField PW;
    public javax.swing.JTextField RW;
    public javax.swing.JComboBox SHAPE;
    public javax.swing.JTextField SUBPACKET;
    public javax.swing.JComboBox SYMMETRY;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Time;
    public static javax.swing.JButton Upd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
