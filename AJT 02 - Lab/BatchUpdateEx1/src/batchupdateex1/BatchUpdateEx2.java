package batchupdateex1;
import java.sql.*;  
class BatchUpdateEx2
{  
public static void main(String args[])throws Exception{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");  
con.setAutoCommit(false);  
preparedStatement stmt=con.prepareStatement();  
stmt.addBatch("insert into emp values(?,?,?)");    
stmt.setint();  
stmt.executeBatch(); //executing the batch  
con.commit();  
con.close();  
}
}
