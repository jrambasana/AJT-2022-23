import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doPost(request, response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        HttpSession session = request.getSession(false);
        
        if(session != null)
        {
            String username = (String)session.getAttribute("username");
            out.println("<h3>Login successful!!</h3>");
            out.println("<h3>Welcome " + username + " to your Profile page.<h3>");
        }
        else
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.forward(request, response);
        }
        
        out.println("<a href='logout'>Logout</a>");
}
}
