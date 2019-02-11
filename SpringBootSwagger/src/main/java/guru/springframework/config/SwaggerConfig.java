package guru.springframework.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {
	/*
	 * @Bean public Docket productApi() { return new
	 * Docket(DocumentationType.SWAGGER_2) .select()
	 * .apis(RequestHandlerSelectors.basePackage("guru.springframework"))
	 * .paths(regex("/product.*")) .build(); // .apiInfo(metaData()); }
	 */
	/*
	 * private ApiInfo metaData() { return new ApiInfoBuilder()
	 * .title("Spring Boot REST API")
	 * .description("\"Spring Boot REST API for Online Store\"") .version("1.0.0")
	 * .license("Apache License Version 2.0")
	 * .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"") .contact(new
	 * Contact("Manas Bansal", "https://springframework.guru/about/",
	 * "manasbansal672@gmail.com")) .build(); }
	 */
	/*
	  private ApiInfo metaData() {
	  
	  ApiInfo apiInfo = new ApiInfo( "Spring Boot Swagger Example API",
	  "Spring Boot Swagger Example API for Youtube", "1.0", "Terms of Service", new
	  Contact("TechPrimers", "https://www.youtube.com/TechPrimers",
	  "techprimerschannel@gmail.com"), "Apache License Version 2.0",
	  "https://www.apache.org/licesen.html" );
	  
	  return apiInfo; }
	  
	  
	  @Override protected void addResourceHandlers(ResourceHandlerRegistry
	  registry) { registry.addResourceHandler("swagger-ui.html")
	  .addResourceLocations("classpath:/META-INF/resources/");
	  
	  registry.addResourceHandler("/webjars/**")
	  .addResourceLocations("classpath:/META-INF/resources/webjars/"); }
	 */
	
	  @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2).select()
	            .apis(RequestHandlerSelectors
	                .basePackage("guru.springframework.controllers"))
	            .paths(PathSelectors.regex("/.*"))
	            .build().apiInfo(apiEndPointsInfo());
	    }
	    private ApiInfo apiEndPointsInfo() {
	        return new ApiInfoBuilder().title("Spring Boot REST API")
	            .description("Spring Boot REST API for Online Store")
	            .contact(new Contact("Manas Bansal", "https://dzone.com/articles/spring-boot-restful-api-documentation-with-swagger", "manasbansal672@gmail.com"))
	            .license("Apache 2.0")
	            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
	            .version("1.0.0")
	            .build();
	    }


}
