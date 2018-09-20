package liangwenhan.web.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Configuration
@EnableWebMvc
public class SystemConfig extends WebMvcConfigurerAdapter {
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/app/");
    }
    
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptorAdapter() {

            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                                     Object handler) throws Exception {
                System.out.println("interceptor====222");
                return true;
            }
            
            @Override
        	public void postHandle(
        			HttpServletRequest request, HttpServletResponse response, Object handler,
        			ModelAndView modelAndView) {
            	System.out.println("interceptor====222");
        	}
        }).addPathPatterns("/*");
    }
    
    public static void main(String args[]) {
    	System.out.println(cal(100, 0));
    }
    
    static int cal(int num, int sum) {
    	if (num == 0) return sum;
    	return cal(num - 1, sum+num);
    }
}