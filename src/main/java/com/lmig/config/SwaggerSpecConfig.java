package com.lmig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SwaggerSpecConfig {
    @Bean
    @Primary
    public SwaggerResourcesProvider swaggerResourcesProvider() {
        return () -> {
            List<SwaggerResource> resources = new ArrayList<>();
            Arrays.asList("swagger-api-docs")
                    .forEach(name -> resources.add(loadResource(name)));
            return resources;
        };
    }

    private SwaggerResource loadResource(String name) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation("/" + name + ".yml");
        swaggerResource.setSwaggerVersion("2.0");
        return swaggerResource;
    }
}
