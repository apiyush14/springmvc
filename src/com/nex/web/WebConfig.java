package com.nex.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.nex.web")
public class WebConfig extends WebMvcConfigurerAdapter{

	@Bean(name="HelloWorld")
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}	
	
	/*@Bean
	public TilesConfigurer tilesConfigurer()
	{
		TilesConfigurer tiles = new TilesConfigurer();
		tiles.setDefinitions(new String[] {"/WEB-INF/layout/tiles.xml"});
		tiles.setCheckRefresh(true);
		return tiles;
	}*/
	
	@Bean
	public Spitter getSpitter()
	{
		Spitter spitter=new Spitter();
		spitter.setFirstName("Piyush");
		spitter.setLastName("Arora");
		return spitter;
	}
	
	/*@Bean
	public ViewResolver viewResolver(SpringTemplateEngine templateEngine) 
	{
	ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	viewResolver.setTemplateEngine(templateEngine);
	return viewResolver;
	}
	
	@Bean
	public TemplateEngine templateEngine(TemplateResolver templateResolver) {
	SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	templateEngine.setTemplateResolver(templateResolver);
	return templateEngine;
	}
	
	@Bean
	public TemplateResolver templateResolver() {
	TemplateResolver templateResolver =
	new ServletContextTemplateResolver();
	templateResolver.setPrefix("/WEB-INF/templates/");
	templateResolver.setSuffix(".html");
	templateResolver.setTemplateMode(TemplateMode.HTML5);
	return templateResolver;
	}*/
	
	
	
	/*@Bean
	public ViewResolver viewResolver1() {
	return new TilesViewResolver();
	}*/
}
