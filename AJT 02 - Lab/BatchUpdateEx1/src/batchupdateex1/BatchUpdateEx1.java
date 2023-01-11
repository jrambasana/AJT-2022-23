package batchupdateex1;
import java.sql.*;  
class BatchUpdateEx1
{  
public static void main(String args[])throws Exception{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");  
con.setAutoCommit(false);  
Statement stmt=con.createStatement();  
stmt.addBatch("insert into emp values(11,'Aryan','Rajkot')");  
stmt.addBatch("insert into emp values(12,'Krupa','Junagadh')");  
stmt.addBatch("delete from emp where id=10");  
stmt.executeBatch(); //executing the batch  
con.commit();  
con.close();  
}
}
