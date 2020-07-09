package diamond;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class POLISHREPORT_Record1 extends javax.swing.JFrame {

    public static int i=0;
    public static int n=0;
    public static String time_l="";
    Timer t=new Timer();
    
    public POLISHREPORT_Record1() {
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
private void Reset()
{
    KAPAN.setText("");
    TD.setText("");
    
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TD = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        KAPAN = new javax.swing.JTextField();
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

        GetData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GetData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamond/GetData.png"))); // NOI18N
        GetData.setText("Get Data");
        GetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDataActionPerformed(evt);
            }
        });
        jPanel2.add(GetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 670, 180, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 52)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("POLISH REPORT RECORDS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 1070, -1));

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "KAPAN NO.", "PACKET NO.", "SUB PACKET", "POLISH WEIGHT", "COLOUR", "CLEARITY", "SHAPE", "FLURESCENCE", "CUT", "SYMMETRY", "POLISH", "MEASUREMENT", "LAB", "REPORT", "DEPTH %", "TABLE %", "GIRDLE THIN", "GIRDLE THICK", "GIRDLE %", "GIRDLE CONDITION", "CULET SIZE", "CULET CONDITION", "DOLLAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 61, 1130, 420));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("TOTAL");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 490, 1058, 28));

        TD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 490, 70, 28));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("KAPAN NO.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 20, 110, -1));

        KAPAN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        KAPAN.setForeground(new java.awt.Color(51, 153, 0));
        KAPAN.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        KAPAN.setDoubleBuffered(true);
        KAPAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KAPANKeyTyped(evt);
            }
        });
        jPanel1.add(KAPAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 150, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 1160, 530));

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
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1390, 64));

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

    private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataActionPerformed
       Refresh();
        try
        {
            Connection con=Connect.ConnectDB();
            String sql= "select SUM(DOLLAR) from POLISHREPORT where KAPAN= '" + KAPAN.getText() + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                double add=rs.getDouble("sum(DOLLAR)");
                TD.setText(""+add);
            }
            con.close();
            st.close();
            rs.close();   
        }
        catch(Exception ex)
        {
           JOptionPane.showMessageDialog(this,ex); 
        }
        try 
        {
            if (KAPAN.getText().equals(""))
            {
                Connection con=Connect.ConnectDB();
                String sql = "select * from POLISHREPORT  order by KAPAN,PACKET,SUBPACKET";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                while (rs.next()) 
                {
                    String s2 = rs.getString("DATE");
                    String s4 = rs.getString("KAPAN");
                    String s5 = rs.getString("PACKET");
                    String s29 = rs.getString("SUBPACKET");
                    float s7 = rs.getFloat("POLISHW");
                    String s8 = rs.getString("COLOUR");
                    String s9 = rs.getString("CLEARITY");
                    String s10 = rs.getString("SHAPE");
                    String s11 = rs.getString("FLURESCENCE");
                    String s12 = rs.getString("CUT");
                    String s13 = rs.getString("SYMMETRY");
                    String s14 = rs.getString("POLISH");
                    String s15 = rs.getString("MEASUREMENT");
                    String s16 = rs.getString("LAB");
                    String s17 = rs.getString("REPORT");
                    float s21 = rs.getFloat("DEPTH");
                    float s22 = rs.getFloat("TABLE_");
                    String s23 = rs.getString("GTHIN");
                    String s24 = rs.getString("GTHICK");
                    float s25 = rs.getFloat("GIRDLE");
                    String s26 = rs.getString("GCONDITION");
                    String s27 = rs.getString("CSIZE");
                    String s28 = rs.getString("CCONDITION");
                    float s30 = rs.getFloat("DOLLAR");               
                    model.addRow(new Object[]{s2,s4, s5,s29, s7, s8, s9, s10, s11,s12,s13,s14,s15,s16,s17,s21,s22,s23,s24,s25,s26,s27,s28,s30});
                }
            }
            else
            {
                Connection con=Connect.ConnectDB();
                Statement stmt = con.createStatement();
                String sql1 = "Select KAPAN from POLISHREPORT where Kapan = '" + KAPAN.getText() + "'";
                ResultSet rs1 = stmt.executeQuery(sql1);
                if (rs1.next()) 
                {
                    String sql = "select * from POLISHREPORT where KAPAN= '" + KAPAN.getText() + "' order by KAPAN,PACKET,SUBPACKET";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    while (rs.next()) 
                    {
                        String s2 = rs.getString("DATE");
                        String s4 = rs.getString("KAPAN");
                        String s5 = rs.getString("PACKET");
                        String s29 = rs.getString("SUBPACKET");
                        float s7 = rs.getFloat("POLISHW");
                        String s8 = rs.getString("COLOUR");
                        String s9 = rs.getString("CLEARITY");
                        String s10 = rs.getString("SHAPE");
                        String s11 = rs.getString("FLURESCENCE");
                        String s12 = rs.getString("CUT");
                        String s13 = rs.getString("SYMMETRY");
                        String s14 = rs.getString("POLISH");
                        String s15 = rs.getString("MEASUREMENT");
                        String s16 = rs.getString("LAB");
                        String s17 = rs.getString("REPORT");
                        float s21 = rs.getFloat("DEPTH");
                        float s22 = rs.getFloat("TABLE_");
                        String s23 = rs.getString("GTHIN");
                        String s24 = rs.getString("GTHICK");
                        float s25 = rs.getFloat("GIRDLE");
                        String s26 = rs.getString("GCONDITION");
                        String s27 = rs.getString("CSIZE");
                        String s28 = rs.getString("CCONDITION");
                        float s30 = rs.getFloat("DOLLAR");               
                        model.addRow(new Object[]{s2,s4, s5,s29, s7, s8, s9, s10, s11,s12,s13,s14,s15,s16,s17,s21,s22,s23,s24,s25,s26,s27,s28,s30});
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Data Not Exist", "POLISH REPORT RECORD", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_GetDataActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try 
        {
            int row = jTable1.getSelectedRow();
            String table_click2 = jTable1.getModel().getValueAt(row, 0).toString();
            String table_click = jTable1.getModel().getValueAt(row, 2).toString();
            String table_click1 = jTable1.getModel().getValueAt(row, 3).toString();
            Connection con=Connect.ConnectDB();
            String sql = "select * from polishreport where KAPAN='"+table_click2+"' AND SUBPACKET='"+table_click1+"' AND  PACKET = '" + table_click + "'";
            System.out.print(table_click);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) 
            {
                this.dispose(); 
                POLISHREPORT frm = new POLISHREPORT();
                frm.setVisible(true);
                frm.Del.setEnabled(true);
                frm.Upd.setEnabled(true);
                frm.ADD.setEnabled(false);
                String add1 = rs.getString("DATE");
                frm.DATE.setText(add1);
                String add3 = rs.getString("KAPAN");
                frm.KAPAN.setText(add3);
                String add5 = rs.getString("PACKET");
                frm.PACKET.setText(add5);
                String add33 = rs.getString("SUBPACKET");
                frm.SUBPACKET.setText(add33);
                String add7 = rs.getString("POLISHW");
                frm.PW.setText(add7);
                String add9 = rs.getString("CoLOUR");
                frm.COLOUR.setSelectedItem(add9);
                String add11 = rs.getString("CLEARITY");
                frm.CLEARITY.setSelectedItem(add11);
                String add14 = rs.getString("SHAPE");
                frm.SHAPE.setSelectedItem(add14);
                String add15 = rs.getString("FLURESCENCE");
                frm.FLURESCENCE.setSelectedItem(add15);
                String add16 = rs.getString("CUT");
                frm.CUT.setSelectedItem(add16);
                String add17 = rs.getString("SYMMETRY");
                frm.SYMMETRY.setSelectedItem(add17);
                String add18 = rs.getString("POLISH");
                frm.POLISH.setSelectedItem(add18);
                String add19 = rs.getString("MEASUREMENT");
                frm.MEASUREMENT.setText(add19);
                String add20 = rs.getString("LAB");
                frm.LAB.setText(add20);
                String add21 = rs.getString("REPORT");
                frm.REPORT.setText(add21);
                String add25 = rs.getString("DEPTH");
                frm.DEPTH.setText(add25);
                String add26 = rs.getString("TABLE_");
                frm.TABLE.setText(add26);
                String add27 = rs.getString("GTHIN");
                frm.GTHIN.setText(add27);
                String add28 = rs.getString("GTHICK");
                frm.GTHICK.setText(add28);
                String add29 = rs.getString("GIRDLE");
                frm.GIRDLE.setText(add29);
                String add30 = rs.getString("GCONDITION");
                frm.GCONDITION.setText(add30);
                String add31 = rs.getString("CSIZE");
                frm.CSIZE.setText(add31);
                String add32 = rs.getString("CCONDITION");
                frm.CCONDITION.setText(add32);
                String add34 = rs.getString("DOLLAR");
                frm.DOLLAR.setText(add34);
                frm.kapan=add3;
                frm.packet=(add5);
                frm.subpacket=add33;
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        Refresh();
    }//GEN-LAST:event_RefreshActionPerformed

    private void KAPANKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KAPANKeyTyped
        String s = KAPAN.getText();
        if (s.length() == 20) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_KAPANKeyTyped
public void toExcel(JTable table)
{
    File file;
    JFileChooser chooser = new JFileChooser();
    int returnVal = chooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) 
    {
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

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
    Reset(); 
    }//GEN-LAST:event_NewActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();        
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POLISHREPORT_Record1().setVisible(true);
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
    private javax.swing.JButton GetData;
    public javax.swing.JTextField KAPAN;
    private javax.swing.JButton New;
    private javax.swing.JButton Print;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel TD;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
