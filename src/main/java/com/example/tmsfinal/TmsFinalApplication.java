package com.example.tmsfinal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TmsFinalApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TmsFinalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        String mikalai = new BCryptPasswordEncoder().encode("Mikalai");
//        System.out.println("Mikalai = " + mikalai);
    }
}
