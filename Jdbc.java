package jdbc;
import java.sql.*;
public class Jdbc {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        String url="jdbc:mysql://localhost:4400/klu";
        String user="varatha";
        String pass="raman";
        Connection con;
        Statement st;
        try{
            con=DriverManager.getConnection(url,user,pass);
            st=con.createStatement();
            String sql;
            sql="insert into Inventory"+"(itemNo,itemName,Category,no.ofitemsinshelf)"+"values('2','dove','soap','5')";
            st.executeUpdate(sql);
        }catch(SQLException e){
            System.err.println(e);
         
        }
    
    }
    
}