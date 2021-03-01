package listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent sessionEvent) {
    	//System.out.println("Session Created:: ID="+sessionEvent.getSession().getId());
    	System.out.println("Session Created");
    }

    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
    	//System.out.println("Session Destroyed:: ID="+sessionEvent.getSession().getId());
    	System.out.println("Session Destroyed");
    }
}