package cn.com.testol.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import cn.com.testol.interceptor.AccessInterceptor;
/** SpringBoot2使用这种写法 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {


    // todo 拦截器做不好。就不再开了

    /* 拦截器配置 */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new AccessInterceptor())
//                    .addPathPatterns("/**")
//                    .excludePathPatterns("/login/**")
//                    .excludePathPatterns("/register/**")
//                    .excludePathPatterns("/images/**")
//                    .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**")
//                    ;
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").
        addResourceLocations("file:D:/项目/demo/前端/Online-exam/online-examination-system-server-master/src/main/resources/static/images");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")// 允许跨域访问的路径

                // 设置 参数 为 * ，保证不会有 请求头格式报错
                .allowedOriginPatterns("/**")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")// 允许请求方法
                .maxAge(168000)// 预检间隔时间
                .allowedHeaders("*")// 允许头部设置
                .allowCredentials(true); // 是否发送cookie

    }

}