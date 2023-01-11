
package demojdbcbank;
import java.sql.*;
import java.util.Scanner;
public class DemoJdbcBank {
public static void main(String[] args) {
try {
//1. Register the driver
Class.forName("com.mysql.jdbc.Driver");

//2. establish connection by con object
Connection con = 
    DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root", "");
System.out.println("Connection established");

//3. Create the statement object which is used to execute query in database
Statement st = con.createStatement();

//4. Execute query 
int ch;
Scanner s = new Scanner(System.in);
System.out.println("Menu:");
System.out.println("1. To insert data");
System.out.println("2. To update data");
System.out.println("3. To delete data");
System.out.println("Otherwise : To fetch all the data in the table");
System.out.println("Enter your choise :");
ch = s.nextInt();

switch(ch){
// To insert data
case 1:
{
 int c1 = st.executeUpdate (
 "INSERT into bank_tb Values (1,'Mukesh',25000,876789876,'Rajkot') " );
 System.out.println("Data inserted.");
 break;
}

// To update data
case 2:{
 int i = st.executeUpdate("UPDATE bank_tb SET customerName ='AMIT' WHERE accountNo = 1 ");
 if(i==0)
   System.out.println("Table Not updated");
 else
   System.out.println("Table updated");
 break;
}
// To delete data  
case 3:{
 st.executeUpdate("DELETE FROM bank_tb WHERE accountNo = 1");
 break;
}

default : 
{
 ResultSet rs1 = st.executeQuery("SELECT * FROM bank_tb");
 while(rs1.next())                     
 System.out.println(rs1.getInt(1) + "  " + rs1.getString(2)
         + "  " + rs1.getInt(3) + " " + rs1.getInt(4) + " " + rs1.getString(5));
 break;
}
} // End of Swtich

//5.close the connection
con.close();
} // End of try clause
catch (Exception e)
{
	System.out.println("Exception: " + e);
}
} // End of main
} // End of class
