package com.atividade02.atividade02backend.repository;

import com.atividade02.atividade02backend.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
