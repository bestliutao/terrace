package cn.sznk.terrace.config;

import cn.sznk.terrace.component.LoginHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
//@EnableWebMvc   //不要接管SpringMVC
@Configuration
public class MyMvcConfig implements WebMvcConfigurer  {
    @Autowired
    private LoginHandlerInterceptor loginInterceptor;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("login");
        registry.addViewController("/console").setViewName("Console");
        registry.addViewController("/hazard").setViewName("Hazard_analysis");
        registry.addViewController("/intelligent").setViewName("intelligent-analysis");
        registry.addViewController("/effectiveness").setViewName("Effectiveness_analysis");
        registry.addViewController("/judgment").setViewName("Safety_judgment");
        registry.addViewController("/risk").setViewName("Safety_risk");
        registry.addViewController("/situation").setViewName("Situation");
        registry.addViewController("/application").setViewName("Application_goout");
        registry.addViewController("/consumption").setViewName("Consumption");
        registry.addViewController("/risk/personnel").setViewName("Personnel_trend_risk");
        registry.addViewController("/hazard/personnel").setViewName("Personnel_trend_hazard");
        registry.addViewController("/rewards").setViewName("Rewards_punishments");
        registry.addViewController("/labelSuccess").setViewName("Label");
        registry.addViewController("/hazardDetilShow").setViewName("Hazard_analysis-Details");
        registry.addViewController("/judgmentEquipemnt").setViewName("Equipment_exception");
        registry.addViewController("/riskEquipemnt").setViewName("Equipment_exception_risk");
        registry.addViewController("/efficacy").setViewName("efficacy");
        registry.addViewController("/effectivenessDetails").setViewName("Effectiveness_analysis-Details");
        registry.addViewController("/provincialPlatform").setViewName("Provincial_platform");
        registry.addViewController("/provincialEquip").setViewName("Provincial_equipment");

//        registry.addViewController("/efficacy").setViewName("efficacy");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    }
    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        //SpringBoot已经做好了静态资源映射
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
                .excludePathPatterns("/index","/","/user/login","/css/**","/img/**","/font/**","/js/**",
                        "/get/traineeData");
    }
}
