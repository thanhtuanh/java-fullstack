package com.bookstore.user;

import com.bookstore.model.User;
import com.bookstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("🔍 Suche Benutzer: {}", username);

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> {
                    log.warn("❌ Benutzer nicht gefunden: {}", username);
                    return new UsernameNotFoundException("Benutzer nicht gefunden: " + username);
                });

        log.info("✅ Benutzer gefunden: {}", user.getUsername());
        log.debug("🔐 Passwort in DB: {}", user.getPassword());
        log.debug("👤 Rolle: {}", user.getRole());
        log.debug("✅ Enabled: {}", user.getEnabled());

        Collection<GrantedAuthority> authorities = new ArrayList<>();

        // Rolle formatieren (z. B. "ADMIN" → "ROLE_ADMIN")
        String role = user.getRole();
        if (role != null) {
            String roleFormatted = role.startsWith("ROLE_") ? role : "ROLE_" + role;
            authorities.add(new SimpleGrantedAuthority(roleFormatted));
        }

        boolean isEnabled = user.getEnabled() != null ? user.getEnabled() : true;

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                isEnabled,
                true, // accountNonExpired
                true, // credentialsNonExpired
                true, // accountNonLocked
                authorities);
    }
}
