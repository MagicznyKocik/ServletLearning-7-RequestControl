package pl.adamLupinski.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AdminServletForward")
public class AdminServletForward extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // We are sending parameters thru request dispatcher forward() method which is sending parameters to location
    // in method parameter - in this case "LoginServlet"


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("AdminServletForward POST " + username);
        request.getRequestDispatcher("LoginServlet").forward(request,response);

        // message below should not be printed because forward method is passing control to other servlet - in this case LoginServlet
        response.getWriter().println("After forward operation");
    }

}
