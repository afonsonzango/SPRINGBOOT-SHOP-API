package com.dailycodework.dreamshops.data;

import com.dailycodework.dreamshops.model.Role;
import com.dailycodework.dreamshops.model.User;
import com.dailycodework.dreamshops.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
@Component
@RequiredArgsConstructor
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Set<String> defaultRoles = Set.of("ROLE_ADMIN", "ROLE_USER");
        createDefaultRolesIfNotExists(defaultRoles);
        createDefaultUserIfNotExists();
        createDefaultAdminIfNotExists();
    }

    private void createDefaultUserIfNotExists() {
        Role userRole = roleRepository.findByName("ROLE_USER").orElse(null);

        if (userRole == null) {
            System.out.println("O papel 'ROLE_USER' não foi encontrado.");
            return; // Retorna se o papel não for encontrado
        }

        for (int i = 1; i <= 5; i++) {
            String defaultEmail = "sam" + i + "@email.com";
            if (userRepository.existsByEmail(defaultEmail)) {
                continue; // Pula se o email já existir
            }
            User user = new User();
            user.setFirstName("The User");
            user.setLastName("User" + i);
            user.setEmail(defaultEmail);
            user.setPassword(passwordEncoder.encode("123456"));
            user.setRoles(Set.of(userRole)); // userRole não é null aqui
            userRepository.save(user);
            System.out.println("Default user " + i + " created successfully.");
        }
    }

    private void createDefaultAdminIfNotExists() {
        Role adminRole = roleRepository.findByName("ROLE_ADMIN").orElse(null);

        if (adminRole == null) {
            System.out.println("O papel 'ROLE_ADMIN' não foi encontrado.");
            return; // Retorna se o papel não for encontrado
        }

        for (int i = 1; i <= 2; i++) {
            String defaultEmail = "admin" + i + "@email.com";
            if (userRepository.existsByEmail(defaultEmail)) {
                continue; // Pula se o email já existir
            }
            User user = new User();
            user.setFirstName("Admin");
            user.setLastName("Admin" + i);
            user.setEmail(defaultEmail);
            user.setPassword(passwordEncoder.encode("123456"));
            user.setRoles(Set.of(adminRole)); // adminRole não é null aqui
            userRepository.save(user);
            System.out.println("Default admin user " + i + " created successfully.");
        }
    }

    private void createDefaultRolesIfNotExists(Set<String> roles) {
        roles.forEach(role -> {
            if (roleRepository.findByName(role).isEmpty()) {
                Role newRole = new Role();
                newRole.setName(role); // Assume que o Role tem um método setName
                roleRepository.save(newRole);
                System.out.println("Papel " + role + " criado com sucesso.");
            }
        });
    }
}