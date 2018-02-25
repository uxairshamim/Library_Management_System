import  java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect{
   
     public static void main(String[] args){
        javaconnect pro = new javaconnect();
        pro.CreateConnection();
     }
    
    public static Connection CreateConnection(){
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","Uzairshamim123");
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
        
    