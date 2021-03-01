package login;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

public class ServletFilter implements Filter{

	public void init(FilterConfig filterConfig) throws ServletException {
    }
	
	@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		String username = request.getParameter("username");
		List<String> bannedUsers = Arrays.asList(new String[]{"Josh", "Seb"});
		
	    if(!bannedUsers.contains(username)){
	        filterChain.doFilter(request, response);
	        return;
	    }
	    else {
	    	HttpServletResponse res = (HttpServletResponse) response;
	    	res.sendRedirect("BannedUser.html");
	    }
    }
}
