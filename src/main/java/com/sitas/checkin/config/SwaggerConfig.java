package com.sitas.checkin.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
            .info(new Info()
                .title("Backend checkIn")
                .version("1.0.0")
                .description("Endpoints for the backend of CheckIn of the SITAS project"));
    }
}