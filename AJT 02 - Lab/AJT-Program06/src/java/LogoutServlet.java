import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
    doPost(request, response);
}
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    HttpSession session = request.getSession(false);
    RequestDispatcher rd = null;

    if(session != null)
    {
        session.invalidate();
        out.println("<h3>You have been Logged out!!!</h3>");
    }
    else
    {
        out.println("<h3>Please login first!!!</h3>");
    }
        rd = request.getRequestDispatcher("index.html");
        rd.include(request, response);
}

}
