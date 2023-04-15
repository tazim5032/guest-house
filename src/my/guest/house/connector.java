package my.guest.house;



import java.sql.*;
public class connector {
    public Connection c;
    public Statement s;
    
    public connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///GuestHouse","root","");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
