import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("name");
        String password = request.getParameter("password");
        
        RequestDispatcher rd = null;
        HttpSession session = null;
        
        if (username!=null && password!=null)
        {
            if (username.equals("admin") && password.equals("admin"))
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
                out.println("<h3>Please login first.</h3>");
                rd.include(request, response);
        }   
}

protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doPost(request, response);
}

}
