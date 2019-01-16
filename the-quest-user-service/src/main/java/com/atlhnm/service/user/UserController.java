package com.atlhnm.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
class UserController {
    private final UserRepository userRepository;

    @PostMapping("users/{name}")
    User createUser(@PathVariable String name) {
        return userRepository.save(User.builder().name(name).build());
    }

    @GetMapping("users")
    List<User> allUsers() {
        return userRepository.findAll();
    }
}
