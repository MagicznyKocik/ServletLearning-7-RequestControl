package pl.adamLupinski.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AdminServletInclude")
public class AdminServletInclude extends HttpServlet {

    private static final long serialVersionUID = 1L;
    // We are sending parameters thru request dispatcher include() method which is sending parameters to location
    // in method parameter - in this case "LoginServlet"

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        System.out.println("AdminServlet POST " + username);
        request.getRequestDispatcher("LoginServlet").include(request,response);

        // in this case include method in not immediately  passing control to another servlet so message will be shown on site
        response.getWriter().println("Message after include() method");

    }

}
