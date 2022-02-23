package com.atividade02.atividade02backend.controller;

import com.atividade02.atividade02backend.modal.User;
import com.atividade02.atividade02backend.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping
    public ResponseEntity<List<User>> index() {
        return ResponseEntity.ok(userService.index());
    }
    
    @PostMapping
    public ResponseEntity<User> store( @RequestBody User user) {
        return ResponseEntity.ok(userService.store(user));
    }
}
