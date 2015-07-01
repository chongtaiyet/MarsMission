import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
@ComponentScan(basePackages = "com.bigmoon.mission.mars.exploration")
public class ExplorationConfigurationAndInitializer implements WebApplicationInitializer {
	@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
    	System.out.println("Bigmoon: ExplorationConfigurationAndInitializer::onStartup");
        WebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

    private AnnotationConfigWebApplicationContext getContext() {
    	System.out.println("Bigmoon: ExplorationConfigurationAndInitializer::AnnotationConfigWebApplicationContext");
    	AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.bigmoon.mission.mars.exploration");
        return context;
    }
}
