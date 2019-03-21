package com.example.nsspringoracleboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NsspringoraclebootApplication {

    public static void main(String[] args) {
        SpringApplication.run(NsspringoraclebootApplication.class, args);
    }

}
