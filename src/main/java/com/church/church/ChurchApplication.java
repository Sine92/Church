package com.church.church;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(value = "com.church.church.Repository")
@SpringBootApplication
public class ChurchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChurchApplication.class, args);
    }

}
