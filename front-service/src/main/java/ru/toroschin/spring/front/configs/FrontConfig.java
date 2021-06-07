package ru.toroschin.spring.front.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FrontConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
