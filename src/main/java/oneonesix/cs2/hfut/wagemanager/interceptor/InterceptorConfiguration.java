//package oneonesix.cs2.hfut.wagemanager.interceptor;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
///**注册拦截器
// * @author FTC
// */
//@Configuration
//public class InterceptorConfiguration extends WebMvcConfigurerAdapter {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 注册拦截器
//        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterceptor());
//        // 配置拦截的路径和不拦截的路径
//        List<String> ex = new ArrayList<String>();
//        ex.addAll(Arrays.asList(new String[]{"/login*","/js/**","/css/**","/img/**","/lib/**" }));
//        interceptorRegistration.addPathPatterns("/**").excludePathPatterns(ex);
//    }
//}
//
