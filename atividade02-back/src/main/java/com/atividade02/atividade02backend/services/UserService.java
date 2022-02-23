package com.atividade02.atividade02backend.services;

import com.atividade02.atividade02backend.modal.User;
import com.atividade02.atividade02backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void UserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> index() {
        return userRepository.findAll();
    }

    public User store(User user) {
        return userRepository.save(user);
    }
}
