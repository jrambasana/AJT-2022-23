import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1_Request extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Request Information Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Request Information Example</h3>");
        out.println("<br>Method: " + request.getMethod());
        out.println("<br>Request URI: " + request.getRequestURI());
        out.println("<br>Protocol: " + request.getProtocol());
        out.println("<br>PathInfo: " + request.getPathInfo());
        out.println("<br>Remote Address: " + request.getRemoteAddr());
        out.println("</body>");
        out.println("</html>");
    }
}
