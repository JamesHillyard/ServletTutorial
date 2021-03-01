package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
	
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Context Listener Starting.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Context Listener Shutting Down.");
    }
}
