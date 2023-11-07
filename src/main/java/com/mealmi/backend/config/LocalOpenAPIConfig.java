package com.mealmi.backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalOpenAPIConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        final String securitySchemeName = "bearerAuth";

        return new OpenAPI()
            .info(new Info().title("Mealmi Backend WebApp")
                .description("Mealmi Backend WebApp")
                .version("v0.1")
                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

}
