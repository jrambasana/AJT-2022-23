package callableexample1;

import java.sql.*;  

public class CallableExample1 {

public static void main(String[] args) throws Exception
{
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/test","root","");  
    CallableStatement stmt = con.prepareCall( "{call insertR(?,?)}" );  
    stmt.setInt(1,2);  
    stmt.setString(2,"Amit");  
    boolean res = stmt.execute();  
    if (res == false)
        System.out.println("success");  
    else
        System.out.println("failure");
}  
}
