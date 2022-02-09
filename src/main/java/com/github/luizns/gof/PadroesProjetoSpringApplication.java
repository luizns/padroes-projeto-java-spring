package com.github.luizns.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PadroesProjetoSpringApplication.class, args);
    }

}
