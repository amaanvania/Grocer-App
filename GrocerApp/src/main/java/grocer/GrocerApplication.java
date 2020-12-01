package grocer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class GrocerApplication {
	
	@Configuration
	public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {      
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/pngFiles/**")
	        .addResourceLocations("file:ext-resources/")
	        .setCachePeriod(0);
	    }
	}
	    
    public static void main(String... args) {
        SpringApplication.run(GrocerApplication.class,args);
    }
}
