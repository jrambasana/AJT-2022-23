import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        RequestDispatcher rd = null;
        HttpSession session = null;
        
        try
        {
        String username = request.getParameter("name");
        String password = request.getParameter("password");
        
        if (username!=null && password!=null)
        {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/ajt","root","");  
            PreparedStatement stmt = 
                con.prepareStatement("select * from users where username=? and password=?");  
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            ResultSet rs = stmt.executeQuery();  
//            if (username.equals("admin") && password.equals("admin"))
            if(rs.next()) 
            {
                rd = request.getRequestDispatcher("profile");
                session = request.getSession(true);
                session.setAttribute("username", username);
                rd.forward(request, response);
            }
            else
            {
                rd = request.getRequestDispatcher("index.html");
                out.println("<h3>Login error!! Please login again.</h3>");
                rd.include(request, response);
            }
        }
        else
        {
                rd = request.getRequestDispatcher("index.html");
                out.println("<h3>Login error!! Please login again.</h3>");
                rd.include(request, response);
        }   
        }
        catch(Exception e)
        {
                rd = request.getRequestDispatcher("index.html");
                out.println("<h3>Some error occured in login process.</h3>");
                out.println("<h3>Please login again.</h3>");
                out.println(e);
                rd.include(request, response);            
        }
}

protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doPost(request, response);
}

}
