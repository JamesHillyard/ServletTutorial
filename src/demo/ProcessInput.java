package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Displays the parameter entered on the page using a printwriter.
 */
public class ProcessInput extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("first_name");
		Cookie cookie = new Cookie("LoggedInUser", name);
		PrintWriter out = response.getWriter();
		out.println(name);
	}
}
