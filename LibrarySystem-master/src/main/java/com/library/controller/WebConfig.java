package com.library.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
* WebConfig类用于配置Spring MVC框架的一些基本功能，包括视图解析器和静态资源处理器。
* */
@Configuration
@EnableWebMvc
@ComponentScan("com.library.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

    /*
    * @Bean注解用于声明一个视图解析器的Bean，方法名为viewResolver()。在该方法中，
    * 创建了一个InternalResourceViewResolver对象，并设置了视图文件的后缀为".jsp"，然后将该解析器返回。
    * */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(".jsp");
        return resolver;
    }

    /*
    * configureDefaultServletHandling()方法用于配置默认的Servlet处理，
    * 通过调用configurer.enable()启用默认的Servlet处理。
    * */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    /*
    * addResourceHandlers()方法用于配置静态资源的处理器。在该方法中，
    * 通过调用registry.addResourceHandler()方法来指定静态资源的URL路径，
    * 以及调用addResourceLocations()方法来指定静态资源的存放路径
    * */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**")
                .addResourceLocations("/static/img/");
        registry.addResourceHandler("/js/**").addResourceLocations("/static/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/static/css/");
    }
}
