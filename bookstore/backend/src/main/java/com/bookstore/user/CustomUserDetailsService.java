package com.bookstore.user;

import com.bookstore.model.User; // Update to the correct package where the User class is located
import com.bookstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Benutzer nicht gefunden: " + username));
        System.out.println("Benutzer geladen: " + user.getUsername());
        System.out.println("Passwort in DB: " + user.getPassword());

        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getUsername())
                .password(user.getPassword()) // bcrypt gespeichert
                .roles(user.getRole().replace("ROLE_", "")) // z.B. "ADMIN"
                .build();
    }
}
