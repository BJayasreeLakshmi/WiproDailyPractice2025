package com.wipro.FlightApp.BookingMs.config;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi bookingApi() {
        return GroupedOpenApi.builder()
                .group("BookingMS API")
                .pathsToMatch("/bookings/**")
                .build();
    }

    @Bean
    public GroupedOpenApi flightDataApi() {
        return GroupedOpenApi.builder()
                .group("FlightDataMS API")
                .pathsToMatch("/flights/**")
                .packagesToScan("com.wipro.FlightApp.FlightDataMs.controller")
                .build();
    }
}
