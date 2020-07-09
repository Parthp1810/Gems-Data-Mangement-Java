package diamond;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.*;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.coobird.thumbnailator.Thumbnails;

public class DiamondImage extends javax.swing.JFrame {
    
    public static int i=0;
    public static int n=0;
    public static String time_l="";
    Timer t=new Timer();
   
    public DiamondImage() {
        initComponents();
        Get_Data1();
        Path.setVisible(false);
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
    
    KAPAN.setText("");
    PACKET.setText("");
    PW.setText("");
    COLOUR.setSelectedIndex(-1);
    CLEARITY.setSelectedIndex(-1);
    SHAPE.setSelectedIndex(-1);
    FLURESCENCE.setSelectedIndex(-1);
    SUBPACKET.setText("");
    ADD.setEnabled(true);
    Upd.setEnabled(false);
    Del.setEnabled(false);   
    Path.setText("");
    pic.setIcon(null);
    KAPAN.requestDefaultFocus();
    Get_Data1();
    DefaultTableModel model1 = (DefaultTableModel) jTable3.getModel();

        int rows1 = model1.getRowCount();
        if (rows1 > 0) {
            for (int i = 0; i < rows1; i++) {
                model1.removeRow(0);
            }
        }
}
public void Get_Data1(){
        
        try{
            Connection con=Connect.ConnectDB();
            String sql="select * from POLISHREPORT order by KAPAN,SUBPACKET,PACKET";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql); 
            DefaultTableModel model=(DefaultTableModel) jTable3.getModel();
            while(rs.next())
            {
                float s7 = rs.getFloat("POLISHW");
                String s8 = rs.getString("COLOUR");
                String s9 = rs.getString("CLEARITY");
                String s10 = rs.getString("SHAPE");
                String s11 = rs.getString("FLURESCENCE"); 
                model.addRow(new Object[]{s7,s8,s9,s10,s11});
            }
                con.close();
                st.close();
                rs.close();
         }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
          
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AP = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Day = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        KAPAN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PACKET = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pic = new javax.swing.JLabel();
        Browse = new javax.swing.JButton();
        Path = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        SUBPACKET = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        COLOUR = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        CLEARITY = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        SHAPE = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        FLURESCENCE = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        PW = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        GetData = new javax.swing.JButton();
        Upd = new javax.swing.JButton();
        Del = new javax.swing.JButton();
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 52)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DIAMOND IMAGE");
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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("KAPAN NO.");

        KAPAN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        KAPAN.setForeground(new java.awt.Color(51, 153, 0));
        KAPAN.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        KAPAN.setDoubleBuffered(true);
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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setText("PACKET NO.");

        PACKET.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PACKET.setForeground(new java.awt.Color(51, 153, 0));
        PACKET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PACKETKeyTyped(evt);
            }
        });

        pic.setPreferredSize(new java.awt.Dimension(150, 150));
        jScrollPane1.setViewportView(pic);

        Browse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Browse.setText("Browse");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        Path.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setText("SUB PACKET ");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Polish Weight", "Colour", "Clearity", "Shape", "Flurescence"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        SUBPACKET.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SUBPACKET.setForeground(new java.awt.Color(51, 153, 0));
        SUBPACKET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBPACKETActionPerformed(evt);
            }
        });
        SUBPACKET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SUBPACKETKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("COLOUR");

        COLOUR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        COLOUR.setForeground(new java.awt.Color(51, 153, 0));
        COLOUR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O" }));
        COLOUR.setSelectedIndex(-1);
        COLOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COLOURActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("CLEARITY");

        CLEARITY.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CLEARITY.setForeground(new java.awt.Color(51, 153, 0));
        CLEARITY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IF", "VVS1", "VVS2", "VS1", "VS2", "SI1", "SI2", "I1", "I2", "I3", "I4", "I5" }));
        CLEARITY.setSelectedIndex(-1);
        CLEARITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARITYActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("SHAPE");

        SHAPE.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SHAPE.setForeground(new java.awt.Color(51, 153, 0));
        SHAPE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ROUND", "OVAL", "PRINCESS", "MARQUISE", "PEAR", "EMERALD", "CUSHION" }));
        SHAPE.setSelectedIndex(-1);
        SHAPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHAPEActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("FLURESCENCE ");

        FLURESCENCE.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FLURESCENCE.setForeground(new java.awt.Color(51, 153, 0));
        FLURESCENCE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NONE", "FANT", "ST", "MD", "VST" }));
        FLURESCENCE.setSelectedIndex(-1);
        FLURESCENCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FLURESCENCEActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("POLISH WEIGHT");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(Path, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel13)
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CLEARITY, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SHAPE, 0, 254, Short.MAX_VALUE)
                                    .addComponent(FLURESCENCE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SUBPACKET)
                                    .addComponent(COLOUR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PW)
                                    .addComponent(PACKET)
                                    .addComponent(KAPAN)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(KAPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PACKET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(SUBPACKET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10)
                                    .addGap(88, 88, 88))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(7, 7, 7)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PW, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(COLOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CLEARITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(SHAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FLURESCENCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Path, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 1160, 530));

        ADD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Save.png"))); // NOI18N
        ADD.setText("Save");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, 160, 50));

        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Back.png"))); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 670, 160, 50));

        GetData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GetData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/GetData.png"))); // NOI18N
        GetData.setText("Get Data");
        GetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDataActionPerformed(evt);
            }
        });
        jPanel2.add(GetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 670, 170, 50));

        Upd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Upd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Refresh.png"))); // NOI18N
        Upd.setText("Update");
        Upd.setEnabled(false);
        Upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdActionPerformed(evt);
            }
        });
        jPanel2.add(Upd, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 670, 160, 50));

        Del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Delete.png"))); // NOI18N
        Del.setText("Delete");
        Del.setEnabled(false);
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });
        jPanel2.add(Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 160, 50));

        New.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/New.png"))); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jPanel2.add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 160, 50));

        Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Search.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 670, 160, 50));

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
FileInputStream fis;
String filename;
int s;
public static byte[]person_image;
ImageIcon format;
File file;
public static String kapan;
public static String packet;
public static String subpacket;
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataActionPerformed
        DIAMONDImage_Record frm = new DIAMONDImage_Record();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GetDataActionPerformed

    private void UpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdActionPerformed
        try 
        {
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
            if (person_image == null) 
            {
                JOptionPane.showMessageDialog(this, "Please Insert Image", "Error", JOptionPane.ERROR_MESSAGE);
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
                String sql1 = "update  diamondimage set KAPAN=?,img=? where KAPAN='" + kapan + "'AND SUBPACKET='" + subpacket + "' AND PACKET='" + packet + "'";
                PreparedStatement ps=con.prepareStatement(sql1);
                ps.setString(1, KAPAN.getText());
                ps.setBytes(2, person_image);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Data Successfully Updated", "Diamond Image Record", JOptionPane.INFORMATION_MESSAGE);
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
                String sql1 = "update  diamondimage set KAPAN=?,PACKET=?,img=? where KAPAN='" + kapan + "' AND PACKET='" + packet + "'AND SUBPACKET='" + subpacket + "'";
                PreparedStatement ps=con.prepareStatement(sql1);
                ps.setString(1, KAPAN.getText());
                ps.setString(2, PACKET.getText());
                ps.setBytes(3, person_image);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Data Successfully Updated", "Diamond Image Record", JOptionPane.INFORMATION_MESSAGE);
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
                String sql1 = "update  diamondimage set KAPAN=?,PACKET=?,SUBPACKET=?,img=? where KAPAN='" + kapan + "' AND SUBPACKET='" + subpacket + "' AND PACKET='" + packet + "'";
                PreparedStatement ps=con.prepareStatement(sql1);
                ps.setString(1, KAPAN.getText());
                ps.setString(2, PACKET.getText());
                ps.setString(3, SUBPACKET.getText());
                ps.setBytes(4, person_image);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Data Successfully Updated", "Diamond Image Record", JOptionPane.INFORMATION_MESSAGE);
                Reset();
                con.close();
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
                String sql1 = "Select KAPAN,SUBPACKET,PACKET from diamondimage where Kapan = '" + KAPAN.getText() + "' AND SUBPACKET='" + SUBPACKET.getText() + "' and PACKET = '" + PACKET.getText() + "'";
                ResultSet rs = stmt.executeQuery(sql1);
                if (rs.next()) 
                {
                    String sql = "delete from diamondimage where Kapan = '" + KAPAN.getText() + "' AND SUBPACKET='" + SUBPACKET.getText() + "' and PACKET = '" + PACKET.getText() + "'";
                    Statement st = con.createStatement();
                    int rowsEffected = st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Data Successfully Deleted", "Diamond Image Record", JOptionPane.INFORMATION_MESSAGE);
                    Reset();
                    con.close();
                    st.close();
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this, "Data Not Exist", "Diamond Image Record", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_DelActionPerformed
PreparedStatement ps;
    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        try 
        {
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
                JOptionPane.showMessageDialog(this, "Please Enter SUBPACKET NO.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }*/
            if (person_image == null) 
            {
                JOptionPane.showMessageDialog(this, "Please Insert Image", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            FileInputStream fis=new FileInputStream(filename);
            Connection con=Connect.ConnectDB();
            Statement stmt = con.createStatement();
            String sql1 = "Select KAPAN,PACKET,SUBPACKET from DiamondImage where KAPAN='" + KAPAN.getText() + "' AND SUBPACKET='" + SUBPACKET.getText() + "' AND PACKET='" + PACKET.getText() + "'";
            ResultSet rs = stmt.executeQuery(sql1);
            if (rs.next()) 
            {
                JOptionPane.showMessageDialog(this, "KAPAN OR PACKET OR SUBPACKET ALREADY EXISTS", "Error", JOptionPane.ERROR_MESSAGE);
                Reset();
                return;
            } 
            else 
            {   
                String sql = "insert into diamondimage(KAPAN,PACKET,SUBPACKET,POLISHW,COLOUR,CLEARITY,SHAPE,FLURESCENCE,img)values('" + KAPAN.getText() + "','" + PACKET.getText() + "','" + SUBPACKET.getText() + "'," + PW.getText() + ",'" + COLOUR.getSelectedItem() + "','" + CLEARITY.getSelectedItem() + "','" + SHAPE.getSelectedItem() + "','" + FLURESCENCE.getSelectedItem() + "',?)";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setBytes(1, person_image);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Data Successfully Saved", "Daimond Image Record", JOptionPane.INFORMATION_MESSAGE);
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
        Search_DiamondImage frm = new Search_DiamondImage();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SearchActionPerformed

    private void KAPANKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KAPANKeyTyped
        String s = KAPAN.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_KAPANKeyTyped

    private void PACKETKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PACKETKeyTyped
        String s = PACKET.getText();
        if (s.length() == 20) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_PACKETKeyTyped
byte[] person_name=null;
    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        JFileChooser choose=new JFileChooser();
        choose.showOpenDialog(this);
        File f=choose.getSelectedFile();
        filename=f.getAbsolutePath();
        try
        {
            File image=new File(filename);
            BufferedImage bufferedimage=ImageIO.read(image);
            ImageIcon img=new ImageIcon(bufferedimage);
            BufferedImage thumbnail=Thumbnails.of(bufferedimage).size(150,150).asBufferedImage();
            ByteArrayOutputStream os=new ByteArrayOutputStream();
            ImageIO.write(thumbnail,"jpeg", os);
            InputStream is=new ByteArrayInputStream(os.toByteArray());
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buff=new byte[1024];
            try
            {
                for(int readNum;(readNum=is.read(buff))!=-1;)
                {
                    bos.write(buff, 0, readNum);
                    System.out.println("Read "+readNum +" Bytes ,");
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(DiamondImage.class.getName()).log(Level.SEVERE, null, ex);
            }
            person_image=bos.toByteArray();
            BufferedImage buff_image = ImageIO.read(new ByteArrayInputStream(person_image));
            ImageIcon format=new ImageIcon(buff_image);
            pic.setIcon(format);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_BrowseActionPerformed

    private void SUBPACKETKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SUBPACKETKeyTyped
        String s = SUBPACKET.getText();
        if (s.length() == 10) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_SUBPACKETKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();       
    }//GEN-LAST:event_formWindowClosing

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        try {
            int row = jTable3.getSelectedRow();
            String table_click = jTable3.getModel().getValueAt(row, 0).toString();
            Connection con=Connect.ConnectDB();
            String sql = "select * from POLISHREPORT where POLISHW = '" + table_click + "'order by KAPAN,SUBPACKET,PACKET";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String add7 = rs.getString("POLISHW");
                PW.setText(add7);
                String add9 = rs.getString("CoLOUR");
                COLOUR.setSelectedItem(add9);
                String add11 = rs.getString("CLEARITY");
                CLEARITY.setSelectedItem(add11);
                String add14 = rs.getString("SHAPE");
                SHAPE.setSelectedItem(add14);
                String add15 = rs.getString("FLURESCENCE");
                FLURESCENCE.setSelectedItem(add15);
            }
            con.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void COLOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COLOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COLOURActionPerformed

    private void CLEARITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARITYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLEARITYActionPerformed

    private void SHAPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHAPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SHAPEActionPerformed

    private void FLURESCENCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FLURESCENCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FLURESCENCEActionPerformed

    private void PWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PWActionPerformed

    private void PWKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PWKeyTyped
        String s = PW.getText();
        if (s.length() == 20)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_PWKeyTyped

    private void SUBPACKETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBPACKETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUBPACKETActionPerformed

    private void KAPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KAPANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KAPANActionPerformed

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
            java.util.logging.Logger.getLogger(DiamondImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiamondImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiamondImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiamondImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiamondImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ADD;
    private javax.swing.JLabel AP;
    public static javax.swing.JButton Back;
    private javax.swing.JButton Browse;
    public javax.swing.JComboBox CLEARITY;
    public javax.swing.JComboBox COLOUR;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Day;
    public static javax.swing.JButton Del;
    public javax.swing.JComboBox FLURESCENCE;
    public static javax.swing.JButton GetData;
    public javax.swing.JTextField KAPAN;
    public static javax.swing.JButton New;
    public javax.swing.JTextField PACKET;
    public javax.swing.JTextField PW;
    private javax.swing.JLabel Path;
    public javax.swing.JComboBox SHAPE;
    public javax.swing.JTextField SUBPACKET;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Time;
    public static javax.swing.JButton Upd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    public static javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
}
