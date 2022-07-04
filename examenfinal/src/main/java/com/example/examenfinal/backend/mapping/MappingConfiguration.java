package com.example.examenfinal.backend.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("AccommodationMappingConfiguration")
public class MappingConfiguration {

    @Bean
    public AccommodationMapper accommodationMapper() {
        return new AccommodationMapper();
    }

}