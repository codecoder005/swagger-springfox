package com.lmig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerSpringfoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringfoxApplication.class, args);
	}

	/*@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/users/**"))
				.apis(RequestHandlerSelectors.basePackage("com.lmig"))
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo(){
		return new ApiInfo(
				"Users API",
				"This API manages and provides information about users",
				"1.0",
				"Open Source",
				new Contact("Ramakrishna Janaureddy", "www.google.co.in", ""),
				"Apache License Version 2.0",
				"www.apache.org/licenses/LICENSE-2.0",
				new ArrayList<>()
		);
	}*/
}
