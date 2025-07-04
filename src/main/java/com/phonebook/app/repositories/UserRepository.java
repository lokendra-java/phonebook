package com.phonebook.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonebook.app.entities.User;



public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

    void deleteByEmail(String email);

    void deleteByUsername(String username);

}
