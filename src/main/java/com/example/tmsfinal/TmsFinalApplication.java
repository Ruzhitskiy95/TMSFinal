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
//        String vlad = new BCryptPasswordEncoder().encode("Vlad");
//        System.out.println("Vlad = " + vlad);
//        String alex = new BCryptPasswordEncoder().encode("Alex");
//        System.out.println("Alex = " + alex);
//        String nick = new BCryptPasswordEncoder().encode("Nick");
//        System.out.println("Nick = " + nick);
    }
}
