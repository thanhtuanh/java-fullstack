package com.bookstore.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class PasswordEncoderTest {

    @Bean
    public CommandLineRunner testPasswordEncoder() {
        return args -> {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String plainPassword = "admin";
            String encodedPassword = encoder.encode(plainPassword);

            System.out.println("====== PASSWORT DEBUG ======");
            System.out.println("Klartext: " + plainPassword);
            System.out.println("Encoded: " + encodedPassword);

            // Überprüfen, ob das gespeicherte Passwort mit 'admin' übereinstimmt
            String storedHash = "$2a$10$A4NQzOmMxEE9v6.RDGLDu.nIMRtRXp6Rk91yE9nsOAdBI7dDwnO5C";
            boolean isMatch = encoder.matches(plainPassword, storedHash);

            System.out.println("Passwort stimmt überein: " + isMatch);
            System.out.println("============================");
        };
    }
}