package listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {
       
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
    	System.out.println("ServletRequest destroyed");
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
    	System.out.println("ServletRequest Initialized");
    }
}
