package diamond;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
 
public class POLISHREPORT extends javax.swing.JFrame {
public static int i=0;
    public static int n=0;
    public static String time_l="";
    Timer t=new Timer();
    
    public POLISHREPORT() {
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
    MEASUREMENT.setText("");
    LAB.setText("");
    REPORT.setText("");
    DEPTH.setText("");
    TABLE.setText("");
    GTHIN.setText("");
    GTHICK.setText("");
    GIRDLE.setText("");
    GCONDITION.setText("");
    CSIZE.setText("");
    CCONDITION.setText("");
    DOLLAR.setText("");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        PW = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        MEASUREMENT = new javax.swing.JTextField();
        LAB = new javax.swing.JTextField();
        REPORT = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        DEPTH = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        TABLE = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        GTHIN = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        GTHICK = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        GIRDLE = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        GCONDITION = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        CSIZE = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        CCONDITION = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        SUBPACKET = new javax.swing.JTextField();
        FLURESCENCE = new javax.swing.JComboBox();
        CUT = new javax.swing.JComboBox();
        CLEARITY = new javax.swing.JComboBox();
        SHAPE = new javax.swing.JComboBox();
        SYMMETRY = new javax.swing.JComboBox();
        COLOUR = new javax.swing.JComboBox();
        POLISH = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        DOLLAR = new javax.swing.JTextField();
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
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 670, 140, 50));

        GetData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GetData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/GetData.png"))); // NOI18N
        GetData.setText("Get Data");
        GetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDataActionPerformed(evt);
            }
        });
        jPanel2.add(GetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 170, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 52)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("POLISH REPORT");
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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("KAPAN NO.");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PACKET NO.");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("POLISH WEIGHT");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("COLOUR");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("CLEARITY");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("SHAPE");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("FLURESCENCE ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("CUT GRADE");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("SYMMETRY");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("POLISH");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("DATE");

        KAPAN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KAPAN.setForeground(new java.awt.Color(51, 153, 0));
        KAPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KAPANActionPerformed(evt);
            }
        });
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
        PACKET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PACKETActionPerformed(evt);
            }
        });
        PACKET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PACKETKeyTyped(evt);
            }
        });

        PW.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PW.setForeground(new java.awt.Color(51, 153, 0));
        PW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWActionPerformed(evt);
            }
        });
        PW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PWKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("MEASUREMENT");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("LAB");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("REPORT");

        MEASUREMENT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MEASUREMENT.setForeground(new java.awt.Color(51, 153, 0));
        MEASUREMENT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEASUREMENTKeyTyped(evt);
            }
        });

        LAB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LAB.setForeground(new java.awt.Color(51, 153, 0));
        LAB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LABKeyTyped(evt);
            }
        });

        REPORT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        REPORT.setForeground(new java.awt.Color(51, 153, 0));
        REPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPORTActionPerformed(evt);
            }
        });
        REPORT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                REPORTKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 255));
        jLabel26.setText("DEPTH %");

        DEPTH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DEPTH.setForeground(new java.awt.Color(51, 153, 0));
        DEPTH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DEPTHKeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 255));
        jLabel27.setText("TABLE %");

        TABLE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TABLE.setForeground(new java.awt.Color(51, 153, 0));
        TABLE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TABLEKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 255));
        jLabel28.setText("GIRDLE THIN");

        GTHIN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GTHIN.setForeground(new java.awt.Color(51, 153, 0));
        GTHIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GTHINKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 255));
        jLabel29.setText("GIRDLE THICK");

        GTHICK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GTHICK.setForeground(new java.awt.Color(51, 153, 0));
        GTHICK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GTHICKKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 255));
        jLabel30.setText("GIRDLE %");

        GIRDLE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GIRDLE.setForeground(new java.awt.Color(51, 153, 0));
        GIRDLE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GIRDLEKeyTyped(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 255));
        jLabel31.setText("GIRDLE CONDITION");

        GCONDITION.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GCONDITION.setForeground(new java.awt.Color(51, 153, 0));
        GCONDITION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GCONDITIONKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 255));
        jLabel32.setText("CULET SIZE");

        CSIZE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CSIZE.setForeground(new java.awt.Color(51, 153, 0));
        CSIZE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CSIZEKeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 255));
        jLabel33.setText("CULET CONDITION");

        CCONDITION.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CCONDITION.setForeground(new java.awt.Color(51, 153, 0));
        CCONDITION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CCONDITIONKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("SUB PACKET ");

        SUBPACKET.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SUBPACKET.setForeground(new java.awt.Color(51, 153, 0));
        SUBPACKET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SUBPACKETKeyTyped(evt);
            }
        });

        FLURESCENCE.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FLURESCENCE.setForeground(new java.awt.Color(51, 153, 0));
        FLURESCENCE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NONE", "FANT", "ST", "MD", "VST" }));
        FLURESCENCE.setSelectedIndex(-1);
        FLURESCENCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FLURESCENCEActionPerformed(evt);
            }
        });

        CUT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CUT.setForeground(new java.awt.Color(51, 153, 0));
        CUT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EX", "VG", "GD" }));
        CUT.setSelectedIndex(-1);

        CLEARITY.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CLEARITY.setForeground(new java.awt.Color(51, 153, 0));
        CLEARITY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IF", "VVS1", "VVS2", "VS1", "VS2", "SI1", "SI2", "I1", "I2", "I3", "I4", "I5" }));
        CLEARITY.setSelectedIndex(-1);
        CLEARITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARITYActionPerformed(evt);
            }
        });

        SHAPE.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SHAPE.setForeground(new java.awt.Color(51, 153, 0));
        SHAPE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ROUND", "OVAL", "PRINCESS", "MARQUISE", "PEAR", "EMERALD", "CUSHION" }));
        SHAPE.setSelectedIndex(-1);
        SHAPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHAPEActionPerformed(evt);
            }
        });

        SYMMETRY.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SYMMETRY.setForeground(new java.awt.Color(51, 153, 0));
        SYMMETRY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EX", "VG", "GD" }));
        SYMMETRY.setSelectedIndex(-1);
        SYMMETRY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SYMMETRYActionPerformed(evt);
            }
        });

        COLOUR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        COLOUR.setForeground(new java.awt.Color(51, 153, 0));
        COLOUR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O" }));
        COLOUR.setSelectedIndex(-1);
        COLOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COLOURActionPerformed(evt);
            }
        });

        POLISH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        POLISH.setForeground(new java.awt.Color(51, 153, 0));
        POLISH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EX", "VG", "GD" }));
        POLISH.setSelectedIndex(-1);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 255));
        jLabel34.setText("DOLLAR");

        DOLLAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DOLLAR.setForeground(new java.awt.Color(51, 153, 0));
        DOLLAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DOLLARKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LAB, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MEASUREMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(POLISH, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SYMMETRY, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CUT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(371, 371, 371))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(SHAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(FLURESCENCE, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(CLEARITY, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(KAPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PACKET, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SUBPACKET, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PW, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(COLOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel24)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(124, 124, 124))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33))
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel31))
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOLLAR, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TABLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DEPTH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GTHIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GTHICK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GIRDLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GCONDITION, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CSIZE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CCONDITION, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(KAPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PACKET, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(SUBPACKET, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(PW, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(COLOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DEPTH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GTHIN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(GTHICK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(GIRDLE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GCONDITION, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CSIZE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CCONDITION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(DOLLAR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel28)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel29)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel34)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(CLEARITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(SHAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(FLURESCENCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(CUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SYMMETRY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(POLISH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MEASUREMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LAB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(REPORT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 1160, 510));

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

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataActionPerformed
        POLISHREPORT_Record frm = new POLISHREPORT_Record();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GetDataActionPerformed

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
            if (KAPAN.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter KAPAN NO.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            /*if (PACKET.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter PACKET NO.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (SUBPACKET.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter SUB PACKET", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }*/
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
            if (MEASUREMENT.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter MEASUREMENT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (LAB.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter LAB", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (REPORT.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter REPORT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (DEPTH.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter DEPTH %", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (TABLE.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter TABLE %", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (GTHIN.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter GIRDLE THIN", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (GTHICK.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter GIRDLE THICK", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (GIRDLE.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter GIRDLE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (GCONDITION.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter GIRDLE CONDITION", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (CSIZE.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter CULET SIZE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (CCONDITION.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter CULET CONDITION", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (DOLLAR.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter DOLLAR", "Error", JOptionPane.ERROR_MESSAGE);
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
                String sql = "update POLISHREPORT set DATE='" + DATE.getText() + "',KAPAN='" + KAPAN.getText() + "',PACKET='" + PACKET.getText() + "',SUBPACKET='" + SUBPACKET.getText() + "',POLISHW=" + PW.getText() + ",COLOUR='" + COLOUR.getSelectedItem() + "',CLEARITY='" + CLEARITY.getSelectedItem() + "',SHAPE='" + SHAPE.getSelectedItem() + "',FLURESCENCE='" + FLURESCENCE.getSelectedItem() + "',CUT='" + CUT.getSelectedItem() + "',SYMMETRY='" + SYMMETRY.getSelectedItem() + "',POLISH='" + POLISH.getSelectedItem() + "' ,MEASUREMENT='" + MEASUREMENT.getText() + "',LAB='" + LAB.getText() + "',REPORT='" + REPORT.getText() + "',DEPTH=" + DEPTH.getText() + ",TABLE_=" + TABLE.getText() + ",GTHIN='" + GTHIN.getText() + "',GTHICK='" + GTHICK.getText() + "',GIRDLE=" + GIRDLE.getText() + ",GCONDITION='" + GCONDITION.getText() + "',CSIZE='" + CSIZE.getText() + "',CCONDITION='" + CCONDITION.getText() + "',DOLLAR=" + DOLLAR.getText() + " where KAPAN='" + kapan + "' AND SUBPACKET='" + subpacket + "' AND PACKET='" + packet + "'";
                Statement st = con.createStatement();
                int rowsEffected = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Updated", "POLISH REPORT RECORD", JOptionPane.INFORMATION_MESSAGE);
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
                String sql = "update POLISHREPORT set DATE='" + DATE.getText() + "',KAPAN='" + KAPAN.getText() + "',PACKET='" + PACKET.getText() + "',SUBPACKET='" + SUBPACKET.getText() + "',POLISHW=" + PW.getText() + ",COLOUR='" + COLOUR.getSelectedItem() + "',CLEARITY='" + CLEARITY.getSelectedItem() + "',SHAPE='" + SHAPE.getSelectedItem() + "',FLURESCENCE='" + FLURESCENCE.getSelectedItem() + "',CUT='" + CUT.getSelectedItem() + "',SYMMETRY='" + SYMMETRY.getSelectedItem() + "',POLISH='" + POLISH.getSelectedItem() + "' ,MEASUREMENT='" + MEASUREMENT.getText() + "',LAB='" + LAB.getText() + "',REPORT='" + REPORT.getText() + "',DEPTH=" + DEPTH.getText() + ",TABLE_=" + TABLE.getText() + ",GTHIN='" + GTHIN.getText() + "',GTHICK='" + GTHICK.getText() + "',GIRDLE=" + GIRDLE.getText() + ",GCONDITION='" + GCONDITION.getText() + "',CSIZE='" + CSIZE.getText() + "',CCONDITION='" + CCONDITION.getText() + "',DOLLAR=" + DOLLAR.getText() + " where KAPAN='" + kapan + "' AND SUBPACKET='" + subpacket + "' AND PACKET='" + packet + "'";
                Statement st = con.createStatement();
                int rowsEffected = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Updated", "POLISH REPORT RECORD", JOptionPane.INFORMATION_MESSAGE);
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
                String sql = "update POLISHREPORT set DATE='" + DATE.getText() + "',KAPAN='" + KAPAN.getText() + "',PACKET='" + PACKET.getText() + "',SUBPACKET='" + SUBPACKET.getText() + "',POLISHW=" + PW.getText() + ",COLOUR='" + COLOUR.getSelectedItem() + "',CLEARITY='" + CLEARITY.getSelectedItem() + "',SHAPE='" + SHAPE.getSelectedItem() + "',FLURESCENCE='" + FLURESCENCE.getSelectedItem() + "',CUT='" + CUT.getSelectedItem() + "',SYMMETRY='" + SYMMETRY.getSelectedItem() + "',POLISH='" + POLISH.getSelectedItem() + "' ,MEASUREMENT='" + MEASUREMENT.getText() + "',LAB='" + LAB.getText() + "',REPORT='" + REPORT.getText() + "',DEPTH=" + DEPTH.getText() + ",TABLE_=" + TABLE.getText() + ",GTHIN='" + GTHIN.getText() + "',GTHICK='" + GTHICK.getText() + "',GIRDLE=" + GIRDLE.getText() + ",GCONDITION='" + GCONDITION.getText() + "',CSIZE='" + CSIZE.getText() + "',CCONDITION='" + CCONDITION.getText() + "',DOLLAR=" + DOLLAR.getText() + " where KAPAN='" + kapan + "' AND SUBPACKET='" + subpacket + "' AND PACKET='" + packet + "'";
                Statement st = con.createStatement();
                int rowsEffected = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Updated", "POLISH REPORT RECORD", JOptionPane.INFORMATION_MESSAGE);
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
public static String kapan;
public static String packet;
public static String subpacket;
    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        try 
        {
            int P = JOptionPane.showConfirmDialog(this, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (P == 0) 
            {
                Connection con=Connect.ConnectDB();
                Statement stmt = con.createStatement();
                String sql1 = "Select KAPAN,SUBPACKET,PACKET from polishreport where Kapan = '" + KAPAN.getText() + "' AND SUBPACKET='" + SUBPACKET.getText() + "' and PACKET = '" + PACKET.getText() + "'";
                ResultSet rs = stmt.executeQuery(sql1);
                if (rs.next()) 
                {
                    String sql = "delete from polishreport where Kapan = '" + KAPAN.getText() + "' AND SUBPACKET='" + SUBPACKET.getText() + "'  and PACKET = '" + PACKET.getText() + "'";
                    Statement st = con.createStatement();
                    int rowsEffected = st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Data Successfully Deleted", "POLISH REPORT RECORD", JOptionPane.INFORMATION_MESSAGE);
                    Reset();
                    con.close();
                    st.close();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Data Not Exist", "POLISH REPORT RECORD", JOptionPane.INFORMATION_MESSAGE);
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
            }*/
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
            if (MEASUREMENT.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter MEASUREMENT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (LAB.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter LAB", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (REPORT.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter REPORT", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (DEPTH.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter DEPTH %", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (TABLE.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter TABLE %", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (GTHIN.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter GIRDLE THIN", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (GTHICK.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter GIRDLE THICK", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (GIRDLE.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter GIRDLE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (GCONDITION.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter GIRDLE CONDITION", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (CSIZE.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter CULET SIZE", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (CCONDITION.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter CULET CONDITION", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (DOLLAR.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Please Enter DOLLAR", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Connection con=Connect.ConnectDB();
            Statement stmt = con.createStatement();
            String sql1 = "Select KAPAN,PACKET,SUBPACKET from POLISHREPORT where KAPAN='" + KAPAN.getText() + "' AND SUBPACKET='" + SUBPACKET.getText() + "' AND PACKET= '" + PACKET.getText() + "'";
            ResultSet rs = stmt.executeQuery(sql1);
            if (rs.next()) 
            {
                JOptionPane.showMessageDialog(this, "KAPAN OR PACKET OR SUBPACKET ALREADY EXISTS", "Error", JOptionPane.ERROR_MESSAGE);
                Reset();
                DATE.requestDefaultFocus();
                return;
            } 
            else 
            {
                String sql = "insert into POLISHREPORT(DATE,KAPAN,PACKET,SUBPACKET,POLISHW,COLOUR,CLEARITY,SHAPE,FLURESCENCE,CUT,SYMMETRY,POLISH,MEASUREMENT,LAB,REPORT,DEPTH,TABLE_,GTHIN,GTHICK,GIRDLE,GCONDITION,CSIZE,CCONDITION,DOLLAR)values('" + DATE.getText() + "','" + KAPAN.getText() + "','" + PACKET.getText() + "','" + SUBPACKET.getText() + "'," + PW.getText() + ",'" + COLOUR.getSelectedItem() + "','" + CLEARITY.getSelectedItem() + "','" + SHAPE.getSelectedItem() + "','" + FLURESCENCE.getSelectedItem() + "','" + CUT.getSelectedItem() + "','" + SYMMETRY.getSelectedItem() + "','" + POLISH.getSelectedItem() + "','" + MEASUREMENT.getText() + "','" + LAB.getText() + "','" + REPORT.getText() + "'," + DEPTH.getText() + "," + TABLE.getText() + ",'" + GTHIN.getText() + "','" + GTHICK.getText() + "'," + GIRDLE.getText() + ",'" + GCONDITION.getText() + "','" + CSIZE.getText() + "','" + CCONDITION.getText() + "'," + DOLLAR.getText() + ")";
                int rowsEffected = stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Saved", "POLISH REPORT RECORD", JOptionPane.INFORMATION_MESSAGE);
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
        Search_POLISHREPORT frm = new Search_POLISHREPORT();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SearchActionPerformed

    private void MEASUREMENTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEASUREMENTKeyTyped
        String s = MEASUREMENT.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_MEASUREMENTKeyTyped

    private void LABKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LABKeyTyped
        String s = LAB.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_LABKeyTyped

    private void REPORTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_REPORTKeyTyped
        String s = REPORT.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_REPORTKeyTyped

    private void DEPTHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DEPTHKeyTyped
        String s = DEPTH.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        } 
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_DEPTHKeyTyped

    private void TABLEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLEKeyTyped
        String s = TABLE.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TABLEKeyTyped

    private void GTHINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GTHINKeyTyped
        String s = GTHIN.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_GTHINKeyTyped

    private void GTHICKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GTHICKKeyTyped
        String s = GTHICK.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_GTHICKKeyTyped

    private void GIRDLEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GIRDLEKeyTyped
        String s = GIRDLE.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_GIRDLEKeyTyped

    private void GCONDITIONKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GCONDITIONKeyTyped
        String s = GCONDITION.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_GCONDITIONKeyTyped

    private void CSIZEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CSIZEKeyTyped
        String s = CSIZE.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_CSIZEKeyTyped

    private void CCONDITIONKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CCONDITIONKeyTyped
        String s = CCONDITION.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_CCONDITIONKeyTyped

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();   
    }//GEN-LAST:event_formWindowClosing

    private void CLEARITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARITYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLEARITYActionPerformed

    private void FLURESCENCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FLURESCENCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FLURESCENCEActionPerformed

    private void PWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PWActionPerformed

    private void COLOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COLOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COLOURActionPerformed

    private void SHAPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHAPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SHAPEActionPerformed

    private void SYMMETRYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SYMMETRYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SYMMETRYActionPerformed

    private void KAPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KAPANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KAPANActionPerformed

    private void PACKETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PACKETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PACKETActionPerformed

    private void REPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPORTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REPORTActionPerformed

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
            java.util.logging.Logger.getLogger(POLISHREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POLISHREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POLISHREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POLISHREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POLISHREPORT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ADD;
    private javax.swing.JLabel AP;
    public static javax.swing.JButton Back;
    public javax.swing.JTextField CCONDITION;
    public javax.swing.JComboBox CLEARITY;
    public javax.swing.JComboBox COLOUR;
    public javax.swing.JTextField CSIZE;
    public javax.swing.JComboBox CUT;
    public javax.swing.JFormattedTextField DATE;
    public javax.swing.JTextField DEPTH;
    public javax.swing.JTextField DOLLAR;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Day;
    public static javax.swing.JButton Del;
    public javax.swing.JComboBox FLURESCENCE;
    public javax.swing.JTextField GCONDITION;
    public javax.swing.JTextField GIRDLE;
    public javax.swing.JTextField GTHICK;
    public javax.swing.JTextField GTHIN;
    public static javax.swing.JButton GetData;
    public javax.swing.JTextField KAPAN;
    public javax.swing.JTextField LAB;
    public javax.swing.JTextField MEASUREMENT;
    public static javax.swing.JButton New;
    public javax.swing.JTextField PACKET;
    public javax.swing.JComboBox POLISH;
    public javax.swing.JTextField PW;
    public javax.swing.JTextField REPORT;
    public javax.swing.JComboBox SHAPE;
    public javax.swing.JTextField SUBPACKET;
    public javax.swing.JComboBox SYMMETRY;
    private javax.swing.JButton Search;
    public javax.swing.JTextField TABLE;
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
    private javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
