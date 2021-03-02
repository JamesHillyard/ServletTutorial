package login;

import util.requestForwarder;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WelcomeLogin")
public class WelcomeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		boolean admin = IsAdmin.checkAdmin(username);
		if(admin){
			requestForwarder.forward(request, response, "/AdminHome.jsp");
		}
		requestForwarder.forward(request, response, "/UserHome.jsp");
	}


}
