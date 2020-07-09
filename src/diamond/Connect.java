package diamond;

import java.sql.*;
import javax.swing.*;
public class Connect {
     Connection con=null;
   
        public static Connection ConnectDB(){
             try{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Connection con = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLSERVER:1433;user=sa;password=12345;" + "databaseName=DIAMOND;");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DIAMOND","root","mysql");
          
          return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
}
