package io.pragra.learning.july24jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class July24JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(July24JpaApplication.class, args);
    }

}
