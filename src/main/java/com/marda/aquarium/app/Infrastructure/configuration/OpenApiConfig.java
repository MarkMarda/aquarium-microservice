package com.marda.aquarium.app.Infrastructure.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class OpenApiConfig {
    @Bean
    public OpenAPI openApiConfig() {
        return new OpenAPI()
                .info(new Info()
                    .title("Aquarium API")
                    .version("1.0.0")
                    .description("Aquarium products API"));
    }
}
