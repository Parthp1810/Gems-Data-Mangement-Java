package diamond;

import java.awt.Component;
import java.sql.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Search_DiamondImage extends javax.swing.JFrame {
    
    public static int i=0;
    public static int n=0;
    public static String time_l="";
    Timer t=new Timer();
    
    public Search_DiamondImage() {
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
private void Refresh()
{
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int rows = model.getRowCount();
    if (rows > 0)
    {
        for (int i = 0; i < rows; i++) 
        {
            model.removeRow(0);
        }
    }
}
public void Reset(){
        PACKET.setText("");
        KAPAN.setText("");
        KAPAN.requestDefaultFocus();
        pic.setIcon(null);
}
private void updateRowHeights()
{
    for (int row = 0; row < jTable1.getRowCount(); row++)
    {
        int rowHeight = jTable1.getRowHeight();
        for (int column = 0; column < jTable1.getColumnCount(); column++)
        {
            Component comp = jTable1.prepareRenderer(jTable1.getCellRenderer(row, column), row, column);
            rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
        }
        jTable1.setRowHeight(row, rowHeight);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        Search = new javax.swing.JButton();
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
        pic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Refresh = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        New = new javax.swing.JButton();
        Print = new javax.swing.JButton();
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
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 670, 160, 50));

        Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Search.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 670, 180, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 52)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search ROUGH DIAMOND Details");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 14, 800, -1));

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

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pic.setPreferredSize(new java.awt.Dimension(150, 150));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KAPAN NO.", "PACKET NO.", "SUB PACKET", "DIAMOND IMAGE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,ImageIcon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(KAPAN, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(PACKET))
                .addContainerGap(345, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(KAPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PACKET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(79, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 1160, 540));

        Refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Refresh.png"))); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel2.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 670, 160, 50));

        Del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Delete.png"))); // NOI18N
        Del.setText("Delete");
        Del.setEnabled(false);
        jPanel2.add(Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 160, 50));

        ADD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/Save.png"))); // NOI18N
        ADD.setText("Save");
        ADD.setEnabled(false);
        jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 670, 160, 50));

        New.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/New.png"))); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jPanel2.add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 160, 50));

        Print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/icons8-print-50.png"))); // NOI18N
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel2.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/background.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 660));

        jLabel2.setBackground(new java.awt.Color(211, 219, 238));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 660, 1390, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1295, 763));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
    Refresh();
    try 
    {
        if (KAPAN.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(this, "Please Enter KAPAN NO.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            Connection con=Connect.ConnectDB();
            Statement stmt = con.createStatement();
            String sql1 = "Select KAPAN,PACKET from DIAMONDIMAGE where Kapan = '" + KAPAN.getText() + "' and PACKET = '" + PACKET.getText() + "'";
            ResultSet rs1 = stmt.executeQuery(sql1);
            if (rs1.next()) 
            { 
                if(PACKET.getText().equals(""))
                {
                    String sql = "select * from DiamondImage where KAPAN= '" + KAPAN.getText() + "' order by KAPAN,PACKET,SUBPACKET";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    while (rs.next()) 
                    {
                        byte[] i1=rs.getBytes("img");
                        ImageIcon format=new ImageIcon(i1);
                        String s4 = rs.getString("KAPAN");
                        String s1 = rs.getString("SUBPACKET");
                        String s5 = rs.getString("PACKET");
                        pic.setIcon(format);
                        model.addRow(new Object[]{s4, s5,s1,format});
                    } 
                    con.close();
                    st.close();
                    rs.close();
                }
                else
                {
                    String sql = "select * from DiamondImage where KAPAN= '" + KAPAN.getText() + "'  and PACKET ='" + PACKET.getText() + "' order by KAPAN,PACKET,SUBPACKET";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    while (rs.next()) 
                    {
                        byte[] i1=rs.getBytes("img");
                        ImageIcon format=new ImageIcon(i1);
                        String s4 = rs.getString("KAPAN");
                        String s1 = rs.getString("SUBPACKET");
                        String s5 = rs.getString("PACKET");
                        pic.setIcon(format);
                        model.addRow(new Object[]{s4, s5,s1,format});
                    } 
                    con.close();
                    st.close();
                    rs.close();   
                }
                con.close();
                stmt.close();
                rs1.close();
            }
            else
            {   
                Reset();
                JOptionPane.showMessageDialog(this, "Data Not Exist", "ROUGH DIAMOND RECORD", JOptionPane.INFORMATION_MESSAGE);
            }      
        }
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(this, e);
    }
    updateRowHeights();
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

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        Refresh();
        Reset();
    }//GEN-LAST:event_RefreshActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        Reset();
        Refresh();
        pic.setIcon(null);
    }//GEN-LAST:event_NewActionPerformed
public void toExcel(JTable table)
{
    File file;
    JFileChooser chooser = new JFileChooser();
    int returnVal = chooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        file= chooser.getSelectedFile();  
    }
    else
        file=null;
       
    try
    {
        TableModel model = table.getModel();
	FileWriter excel = new FileWriter(file);
        for(int i = 0; i < model.getColumnCount(); i++)
        {
            excel.write(model.getColumnName(i) + "\t");
	}
        excel.write("\n");
        for(int i=0; i< model.getRowCount(); i++) 
        {
            for(int j=0; j < model.getColumnCount(); j++) 
            {
                excel.write(model.getValueAt(i,j).toString()+"\t");
            }
            excel.write("\n");
	}
	excel.close();
    }
    catch(IOException e)
    { 
        System.out.println(e); 
    }
}
    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        if (jTable1.getRowCount()==0) 
        {
            JOptionPane.showMessageDialog(this, "Please Get Details for Printing", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            toExcel(jTable1);
        }
        //toImport(jTable1);
        //toPrint(jTable1);
    }//GEN-LAST:event_PrintActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();       
    }//GEN-LAST:event_formWindowClosing

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try
        {
            int row = jTable1.getSelectedRow();
            String table_click2 = jTable1.getModel().getValueAt(row, 0).toString();
            String table_click = jTable1.getModel().getValueAt(row, 1).toString();
            String table_click1 = jTable1.getModel().getValueAt(row, 2).toString();
            Connection con=Connect.ConnectDB();
            String sql = "select * from diamondimage where KAPAN='"+table_click2+"' AND SUBPACKET='"+table_click1+"' AND PACKET ='" + table_click + "'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                this.dispose(); 
                DiamondImage frm = new DiamondImage();
                frm.setVisible(true);
                frm.Del.setEnabled(true);
                frm.Upd.setEnabled(true);
                frm.ADD.setEnabled(false);
                String add3 = rs.getString("KAPAN");
                frm.kapan=add3;
                frm.KAPAN.setText(frm.kapan);
                String add5 = rs.getString("PACKET");
                frm.packet=(add5);
                frm.PACKET.setText(frm.packet);
                String add2 = rs.getString("SUBPACKET");
                frm.subpacket=add2;
                frm.SUBPACKET.setText(frm.subpacket);
                byte[] i1=rs.getBytes("img");
                BufferedImage buff_image = ImageIO.read(new ByteArrayInputStream(i1));
                ImageIcon format=new ImageIcon(buff_image);
                frm.pic.setIcon(format);
                frm.person_image=i1;
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_DiamondImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JLabel AP;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Day;
    private javax.swing.JButton Del;
    public javax.swing.JTextField KAPAN;
    private javax.swing.JButton New;
    public javax.swing.JTextField PACKET;
    private javax.swing.JButton Print;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
}
