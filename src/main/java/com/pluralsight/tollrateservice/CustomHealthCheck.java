package com.pluralsight.tollrateservice;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator{

    int errorCode = 0;

    @Override
    public Health health() {
        System.out.println("Health check performed, error code is: " + errorCode);

        // errorCode++;
        // if(errorCode > 2 && errorCode < 4){
        //     return Health.down().withDetail("Custom health error code", errorCode).build();
        // }else{
        //     return Health.up().build();
        // }
        return Health.up().build();
    }
}
