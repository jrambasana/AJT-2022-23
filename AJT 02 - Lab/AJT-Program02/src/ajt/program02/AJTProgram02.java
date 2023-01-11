package ajt.program02;
import java.sql.*;  
import java.util.Scanner;
public class AJTProgram02 {
    public static void main(String[] args) {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/test3","root","");  

        Scanner sc = new Scanner(System.in);
        System.out.print("To get an employee's City name enter the id: ");
        int id = sc.nextInt();
        String city = "";
        CallableStatement stmt = con.prepareCall("{call getCity(?,?)}");  
        stmt.setInt(1, id); 
        stmt.setString(2, "");
        stmt.registerOutParameter(2, Types.VARCHAR); 
        stmt.execute();  
        city = stmt.getString(2);

        System.out.println("City name is: " + city);  
    }
    catch(Exception e)
    {       System.out.println(e);      }  
    }
}
