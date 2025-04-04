package com.bookstore.controller;

import com.bookstore.model.LoginRequest;
import com.bookstore.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        try {
            // Authenticate the user
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getUsername(),
                            loginRequest.getPassword()));

            System.out.println("Login-Versuch: " + loginRequest.getUsername());
            System.out.println("Passwort (eingetippt): " + loginRequest.getPassword());

            // Generate JWT token
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String token = jwtService.generateToken(userDetails.getUsername());

            // Return token in response
            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            response.put("username", userDetails.getUsername());

            return ResponseEntity.ok(response);
        } catch (AuthenticationException e) {
            return ResponseEntity.status(401).body(Map.of(
                    "status", 401,
                    "message", "Ungültiger Benutzername oder Passwort",
                    "timestamp", java.time.LocalDateTime.now().toString()));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of(
                    "status", 500,
                    "message", "Ein Fehler ist bei der Authentifizierung aufgetreten: " + e.getMessage(),
                    "timestamp", java.time.LocalDateTime.now().toString()));
        }
    }
}