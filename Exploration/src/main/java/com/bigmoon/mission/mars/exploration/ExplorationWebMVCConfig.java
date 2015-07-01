package com.bigmoon.mission.mars.exploration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class ExplorationWebMVCConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("Bigmoon: ExplorationWebMVCConfig::addResourceHandlers");
	   // registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	   //registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	   registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/META-INF/resources/");
	}	
}
